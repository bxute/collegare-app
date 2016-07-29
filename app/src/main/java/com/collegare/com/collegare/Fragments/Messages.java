package com.collegare.com.collegare.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.activities.UsersActivity;
import com.collegare.com.collegare.interfaces.FABListener;
import com.collegare.com.collegare.utilities.Contexter;
import com.collegare.com.collegare.volley.AppManager;
import com.collegare.com.collegare.utilities.App_Config;
import com.collegare.com.collegare.json.CollegareParser;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.network.InternetManager;
import com.collegare.com.collegare.notifications.LocalNotificationManager;
import com.collegare.com.collegare.adapters.MessageWallListAdapter;
import com.collegare.com.collegare.interfaces.RefressListener;
import com.collegare.com.collegare.textUtils.Segmentor;
import com.collegare.com.collegare.SharedPreference.SessionManager;
import com.collegare.com.collegare.models.CollegareMessage;
import com.collegare.com.collegare.models.CollegareUser;
import com.collegare.com.collegare.models.CollegareWallMessageModel;
import com.collegare.com.collegare.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Messages extends Fragment implements RefressListener,FABListener {
    ListView listView;
    View view;
    MessageWallListAdapter adapter;
    TextView error;
    SwipeRefreshLayout swipeRefreshLayout;
    Handler hadler;
    private int MAX_ATTEMPT=10;
    ArrayList<String> user_id_order;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e("Message", "onCreate()");
        super.onCreate(savedInstanceState);
        adapter = MessageWallListAdapter.getInstance(getActivity());
        hadler= new Handler();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("Message", "onCreateView()");
        view = inflater.inflate(R.layout.activity_message, container, false);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        error = (TextView) view.findViewById(R.id.errorPanel);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.refresser);
        listView = (ListView) view.findViewById(R.id.listViewMessageWall);
        adapter = new MessageWallListAdapter(getActivity());
        listView.setAdapter(adapter);

        swipeRefreshLayout.setColorSchemeColors(Color.RED, Color.BLUE, Color.GREEN);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                hadler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refreshMessage();
                        Log.e("Handler", "posted");
                    }
                }, 100);

            }
        });
        return view;
    }

    @Override
    public void onResume(){
        super.onResume();
        load();

        if(App_Config.OFFLINE){
            Log.e("Message","registering for msg add");
            DatabaseManager.getInstance(getActivity()).setOnNewMessageAdditionListener(new DatabaseManager.NewMessageListener() {
                @Override
                public void onMessageAdd(String userID) {
                    Log.e("Message", " msg add listner callback");
                    putOnTop(userID);
                    writeToSharedPreferences();
                    load();
                }
            });

            Log.e("Message", "registering for msg sent");
            DatabaseManager.getInstance(new Contexter().getContext()).setOnMessageSentListener(new DatabaseManager.MessageSentListener() {
                @Override
                public void onMessageSent() {
                    Log.e("Msg", "messageSentListener call");
                    load();
                }
            });

        }

        if(false){
            new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < 10; i++) {
                        final int ms_n = i;

                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                Log.e("Handler", "injecting " + ms_n + "th message");
                                testInjectNewMessage(ms_n);
                            }

                        });

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }).start();
        }
        Log.e("Message", "onResume()");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.e("Message", "onPause()");
    }

    public void putOnTop(String id){

        int index=-1;
        for(int i=0;i<user_id_order.size();i++){

            if(user_id_order.get(i).equals(id)){
                index=i;

                break;
            }
        }

        if(index==-1){
            user_id_order.add(0, id);

        }else {

            user_id_order.remove(index);

            user_id_order.add(0, id);
        }

    }

    public void writeToSharedPreferences(){
        String currStack="";
        for (String id : user_id_order) {
            currStack +="#"+id;
        }
        currStack = currStack.substring(0,currStack.length());
        Log.e("MessageF", "Writing to SP " + currStack);
        SessionManager.setUserIdSequence(currStack);
    }

    public void testInjectNewMessage(int msg_n){
        String user_order_seq = SessionManager.getUserIdSequence();

        user_id_order = new Segmentor().getParts(user_order_seq,'#');

        //Adding msgs
        ArrayList<CollegareMessage> messages = new ArrayList<>();
        messages.add(new CollegareMessage("1","how are you?","ankit","2016-12-12 12:12:12","201451054","201451065","Me","false","R","false"));
        messages.add(new CollegareMessage("2","hi xute","xute","2016-12-12 12:12:12","201451053","201451065","Me","false","R","false"));
        messages.add(new CollegareMessage("3","watching tv?","ankit","2016-12-12 12:12:12","201451054","201451065","Me","false","R","false"));
        messages.add(new CollegareMessage("6","when did u reach?","Smack","2016-12-12 12:12:12","201451059","201451065","Me","false","R","false"));
        messages.add(new CollegareMessage("8", "how did you come to know about my health", "Ramesh", "2016-12-12 12:12:12", "201421054","201451065","Me", "false", "R", "false"));
        messages.add(new CollegareMessage("7", "roaming here and there ", "Rajesh", "2016-12-12 12:12:12", "201551054", "201451065","Me", "false", "R", "false"));
        messages.add(new CollegareMessage("19", "playing football , meet u later ", "Master", "2016-12-12 12:12:12", "202451054", "201451065","Me", "false", "R", "false"));
        messages.add(new CollegareMessage("12", "why not hava a cup of coffee", "Smack", "2016-12-12 12:12:12", "201451059", "201451065","Me", "false", "R", "false"));
        messages.add(new CollegareMessage("23", "im fine and you", "Me", "2015-12-12 12:00:00", "201451065", "201451059", "Smack", "true", "S","false"));
        messages.add(new CollegareMessage("14", "say something ", "Smack", "2016-12-12 12:12:12", "201451059", "201451065", "Me", "false", "R", "false"));


            DatabaseManager.getInstance(getActivity()).appendMessage(messages.get(msg_n));
            LocalNotificationManager.getInstance(getActivity()).launchNotification(messages.get(msg_n).sender_name, messages.get(msg_n).content);

    }

    public void load(){

        //TODO: get current order from Session Manager and prepare order list of array
        ArrayList<String> user_id_order = new Segmentor().getParts(SessionManager.getUserIdSequence(), '#');
        ArrayList<CollegareWallMessageModel> message_wall_list = new ArrayList<>();

        Log.e("Message"," userids found "+user_id_order.size());
        //TODO: for each uid in order list get:-> last message from DB and unread count
        for (String id : user_id_order) {
            DatabaseManager manager = DatabaseManager.getInstance(getActivity());
            ArrayList<CollegareMessage> _msgs = manager.getMessages(id);
            Log.e("Message"," msgs found "+_msgs.size());

            int unread_count = 0;
            String msg = null;
            String time = null;
            String username=null;
            String user_id=null;
            String sent = null;
            for (CollegareMessage _m : _msgs) {
                if(_m.read.equals("false"))unread_count++;

                msg=_m.content;
                time=_m.doc;
                sent = _m.sent;
                if(_m.type.equals("S")){

                    username = _m.receiver_name;
                    user_id = _m.receiver_id;
                    Log.e("Ms","username"+username);
                }else{

                    username = _m.sender_name;
                    user_id = _m.sender_id;
                    Log.e("Mr","username"+username);
                }

            }

            message_wall_list.add(new CollegareWallMessageModel(user_id,username, unread_count, msg, time,Boolean.parseBoolean(sent)));

        }

        //TODO: set data list to adapter
        adapter.setMessageList(message_wall_list);

    }

    private void refreshMessage() {
        if (InternetManager.getInstance(getActivity()).isConnectedToNet()) {
            getMessage();
            swipeRefreshLayout.setEnabled(false);
        } else {
            Snackbar.make(swipeRefreshLayout, "No Connectivity", Snackbar.LENGTH_SHORT).show();
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.setEnabled(false);
        }
    }


    public void getMessage() {


        if (!InternetManager.getInstance(getActivity()).isConnectedToNet()) {
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.setEnabled(true);
            Log.e("Message", "no newtwork");
            return;
        }

        CollegareUser dbm = DatabaseManager.getInstance(getActivity()).getUser();
        final String UserId = dbm.id;
        final String UserToken = dbm.token;

        StringRequest getMsgReq = new StringRequest(
                Request.Method.POST,
                App_Config.Message_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        CollegareParser.getInstance(getActivity()).parseMessage(s);
                        callbackMsgReceived();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        Log.e("Message", "" + volleyError);
                        if(MAX_ATTEMPT>0){
                            MAX_ATTEMPT--;
                            refreshMessage();
                        }
                        else {
                            timeOut();
                        }
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("action", "feed");
                params.put("id", UserId);
                params.put("token", UserToken);
                return params;
            }
        };

        AppManager.getInstance().addToRequestQueue(getMsgReq, "msgReq", getActivity());
    }

    private void timeOut(){
        Snackbar.make(swipeRefreshLayout, "Connection Problem ! Please Pull to Reload ", Snackbar.LENGTH_LONG).show();
    }

    protected void callbackMsgReceived() {
        swipeRefreshLayout.setRefreshing(false);
        swipeRefreshLayout.setEnabled(true);
    }

    @Override
    public void refress() {
        Log.e("Message","interface call:: to refress()");
        refreshMessage();
    }

    @Override
    public void send() {
        Intent intent = new Intent(getActivity(), UsersActivity.class);
        startActivity(intent);
    }

    @Override
    public void alert(String msg, Context context) {

    }
}