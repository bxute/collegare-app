package com.collegare.com.collegare.handlers;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.network.InternetManager;
import com.collegare.com.collegare.volley.AppManager;
import com.collegare.com.collegare.utilities.App_Config;
import com.collegare.com.collegare.SharedPreference.SessionManager;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.models.CollegareTask;
import com.collegare.com.collegare.models.CollegareUser;
import com.collegare.com.collegare.textUtils.Segmentor;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ankit on 6/23/2016.
 */
public class TaskHandler {

    private Context context;
    private static TaskHandler mTaskHandler;
    private static boolean isHandlerRunning;
    private static boolean isExecuting;
    private static int tasks_count = 0;

    private TaskHandler(Context context) {
        this.context = context;

    }

    public static TaskHandler getInstance(Context context) {
        if (mTaskHandler == null) {
            mTaskHandler = new TaskHandler(context);
        }
        return mTaskHandler;
    }

    public void initialize(){
        isHandlerRunning = false;
        isExecuting = false;
        registerForNewTasks();
    }

    public void activateTaskHandler() {

        while (tasks_count > 0 && isConnected()) {
            ArrayList<String> taskIDs = getTaskSequence();
            for (String taskID : taskIDs) {

                final CollegareTask curr_task = getTask(taskID);
                Log.e("TaskHandler", " task " + curr_task.taskID + " executing");
                messageSentCallback(curr_task.taskID);

            }
        }
    }

    public void deactivateTaskHandler(){
        //TODO: cancel all thread operations
    }

    private void registerForNewTasks() {
        DatabaseManager.getInstance(context).setOnTaskAdditionListener(new DatabaseManager.TaskListener() {
            @Override
            public void onAdd() {
                tasks_count++;
                Log.e("TaskHandler"," current tasks = "+tasks_count);
                Log.e("TaskHandler"," handler running status "+isHandlerRunning);
                if (!isHandlerRunning)
                    activateTaskHandler();
            }
        });
    }

    private ArrayList<String> getTaskSequence() {
        ArrayList<String> task;
        String _tasks = SessionManager.getTaskSequence();
        task = new Segmentor().getParts(_tasks, '#');

        return task;
    }

    private CollegareTask getTask(String _taskID) {
        return DatabaseManager.getInstance(context).getTask(_taskID);
    }

    private void removeTask(String _taskID) {
        //TODO: get task arraylist remove item
        int index_to_remove=-1;
        int counter = 0;
        ArrayList<String> taskIDs  = getTaskSequence();

        for (String _task_id :taskIDs) {
            if(_task_id.equals(_taskID)){
                index_to_remove = counter;
                break;
            }
            counter++;
        }

        if(index_to_remove!=-1) taskIDs.remove(index_to_remove);
        Log.e("TaskHandler","task "+_taskID+" finished");
        DatabaseManager.getInstance(context).removeTask(_taskID);
        writeToSharedPreferences(taskIDs);

        this.tasks_count--;
    }

    public void writeToSharedPreferences(ArrayList<String> orders){
        String currStack="";
        for (String id : orders) {
            currStack +="#"+id;
        }
        currStack = currStack.substring(0,currStack.length());
        Log.e("TaskHandler", "Writing to SP " + currStack);
        SessionManager.setTasksSequence(currStack);
    }

    private void execute(final CollegareTask task) {

        CollegareUser dbm = DatabaseManager.getInstance(context).getUser();
        final String UserId = dbm.id;
        final String UserToken = dbm.token;

        Date d = new Date();
        final CharSequence doc = DateFormat.format("yyyy-mm-dd hh:mm:ss", d.getTime());

        StringRequest sendMsgReq = new StringRequest(Request.Method.POST,
                App_Config.Message_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        Log.e("msg sent resp ", "" + s);
                        //TODO: parse response and if positive call messageSentCallback()
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("action", "send");
                params.put("id", UserId);
                params.put("token", UserToken);
                params.put("recid", task.receiver);
                params.put("content", task.payload);
                //TODO:add one more parameter in api [timestamp] -> for time of message sent
                //params.put("timestamp",task.timeStamp);
                return params;
            }
        };
        AppManager.getInstance().addToRequestQueue(sendMsgReq, "msg req", context);
    }

    private boolean isConnected(){
        return InternetManager.getInstance(context).isConnectedToNet();
    }

    private void messageSentCallback(String _t) {
        removeTask(_t);
    }
}