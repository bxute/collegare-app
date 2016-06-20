package com.collegare.com.collegare.Fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Activity.MessageSend;
import com.collegare.com.collegare.Managers.AppManager;
import com.collegare.com.collegare.Managers.App_Config;
import com.collegare.com.collegare.Managers.CollegareParser;
import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Managers.LocalNotificationManager;
import com.collegare.com.collegare.Managers.MessageWallRecylerAdapter;
import com.collegare.com.collegare.Managers.RecyclerViewDecorator;
import com.collegare.com.collegare.Managers.RefressListener;
import com.collegare.com.collegare.Managers.Segmentor;
import com.collegare.com.collegare.Managers.SendListener;
import com.collegare.com.collegare.Managers.SessionManager;
import com.collegare.com.collegare.Models.CollegareMessage;
import com.collegare.com.collegare.Models.CollegareUser;
import com.collegare.com.collegare.Models.CollegareWallMessageModel;
import com.collegare.com.collegare.R;
import com.collegare.com.collegare.Managers.DataStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Messages extends Fragment implements SendListener,RefressListener {
    RecyclerView recyclerView;
    MessageWallRecylerAdapter adapter;
    TextView error;
    SwipeRefreshLayout swipeRefreshLayout;
    Handler hadler;
    private int MAX_ATTEMPT=10;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e("Message", "onCreate()");
        super.onCreate(savedInstanceState);
        adapter = MessageWallRecylerAdapter.getInstance(getActivity());
        hadler= new Handler();

        if(App_Config.OFFLINE){
            DatabaseManager.getInstance(getActivity()).setOnNewMessageAdditionListener(new DatabaseManager.NewMessageListener() {
                @Override
                public void onMessageAdd() {
                    Log.e("Messages", " callback from database for new message");
                    Load();
                }
            });
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("Message", "onCreateView()");
        View view = inflater.inflate(R.layout.activity_message, container, false);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        error = (TextView) view.findViewById(R.id.errorPanel);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.refresser);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerMessageWall);
        recyclerView.addItemDecoration(new RecyclerViewDecorator(getActivity(), 5, true, R.drawable.post_divider));

        getMessage();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
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

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(10000);
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
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    };
            }

            }
        }).start();

        Log.e("Message", "onResume()");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.e("Message", "onPause()");
    }

    public void putOnTop(String id,ArrayList<String> order){
       // Log.e("Messages", "try pushing " + id);
        int index=-1;
        for(int i=0;i<order.size();i++){
           // Log.e("Messages","matching "+id+" with "+ order.get(i));
            if(order.get(i).equals(id)){
                index=i;
               // Log.e("Messages"," and matched");
                break;
            }
        }

        if(index==-1){
            order.add(0, id);
           // Log.e("Messages", "added  " + id);
        }else {
           // Log.e("Messages", "removing " +order.get(index));
            order.remove(index);
           // Log.e("Messages", "moving to top " + id);
            order.add(0, id);
        }

    }

    public void writeToSharedPreferences(ArrayList<String> orders){
        String currStack="";
        for (String id : orders) {
            currStack +="#"+id;
        }
        currStack = currStack.substring(0,currStack.length());
       // Log.e("MessageF","Writing to SP "+currStack);
        SessionManager.setUserIdSequence(currStack);
    }

    public void testInjectNewMessage(int msg_n){
        ArrayList<String> user_id_order;
        String user_order_seq = SessionManager.getUserIdSequence();
        //Log.e("MessageF","Reading from SP "+user_order_seq);
        user_id_order = new Segmentor().getParts(user_order_seq,'#');
        // trimming vaccant arrray

       // Log.e("Messages" , "ids got from SP with size "+user_id_order.size());
//        for (String s : user_id_order
//             ) {Log.e("",s);
//        }
        //Adding msgs
        ArrayList<CollegareMessage> messages = new ArrayList<>();
        messages.add(new CollegareMessage("1","how are you?","ankit","2016-12-12 12:12:12","201451054","false","R","false"));
        messages.add(new CollegareMessage("2","hi xute","xute","2016-12-12 12:12:12","201451053","false","R","false"));
        messages.add(new CollegareMessage("3","watching tv?","ankit","2016-12-12 12:12:12","201451054","false","R","false"));
        messages.add(new CollegareMessage("6","when did u reach?","shweta","2016-12-12 12:12:12","201451059","false","R","false"));
        messages.add(new CollegareMessage("8","how did you come to know about my health","Ramesh","2016-12-12 12:12:12","201421054","false","R","false"));
        messages.add(new CollegareMessage("7","roaming here and there ","Rajesh","2016-12-12 12:12:12","201551054","false","R","false"));
        messages.add(new CollegareMessage("19","playing football , meet u later ","Mudliar","2016-12-12 12:12:12","202451054","false","R","false"));
        messages.add(new CollegareMessage("12","why not hava a cup of coffee","shweta","2016-12-12 12:12:12","201451059","false","R","false"));
        messages.add(new CollegareMessage("13","plz","shweta","2016-12-12 12:12:12","201451059","false","R","false"));
        messages.add(new CollegareMessage("14","say something ","shweta","2016-12-12 12:12:12","201451059","false","R","false"));

            DatabaseManager.getInstance(getActivity()).appendMessage(messages.get(msg_n));
            putOnTop(messages.get(msg_n).user_id, user_id_order);

            writeToSharedPreferences(user_id_order);
            LocalNotificationManager.getInstance(getActivity()).launchNotification(messages.get(msg_n).username, messages.get(msg_n).content);

    }

    public void Load(){

        //TODO: get current order from Session Manager and prepare order list of array
        ArrayList<String> user_id_order = new Segmentor().getParts(SessionManager.getUserIdSequence(), '#');
        ArrayList<CollegareWallMessageModel> message_wall_list = new ArrayList<>();

        //TODO: for each uid in order list get:-> last message from DB and unread count
        for (String id : user_id_order) {
            DatabaseManager manager = DatabaseManager.getInstance(getActivity());
            ArrayList<CollegareMessage> _msgs = manager.getMessages(id);
            int unread_count = 0;
            String msg=null;
            String time=null;
            String username=null;
            for (CollegareMessage _m : _msgs) {
                if(_m.read.equals("false"))unread_count++;
                msg=_m.content;
                time=_m.doc;
                username=_m.username;
            }

            message_wall_list.add(new CollegareWallMessageModel(username, unread_count, msg, time));

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

    @Override
    public void send() {
        startActivity(new Intent(getActivity(), MessageSend.class));

    }

    @Override
    public void alert(String msg, Context context) {

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

        StringRequest getMsgReq = new StringRequest(Request.Method.POST,
                App_Config.Message_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        CollegareParser.getInstance(getActivity()).parseMessage(s);
                        callback_msgReceived();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("Message", "" + volleyError);
               if(MAX_ATTEMPT>0){
                   MAX_ATTEMPT--;
                   refreshMessage();
               }
                else{
                   TimeOut();
               }
            }
        }) {
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

    private void TimeOut(){
        Snackbar.make(swipeRefreshLayout, "Connection Problem ! Please Pull to Reload ", Snackbar.LENGTH_LONG).show();
    }

    protected void callback_msgReceived() {
        swipeRefreshLayout.setRefreshing(false);
        swipeRefreshLayout.setEnabled(true);
    }

    @Override
    public void refress() {
        Log.e("Message","interface call:: to refress()");
        refreshMessage();
    }
}