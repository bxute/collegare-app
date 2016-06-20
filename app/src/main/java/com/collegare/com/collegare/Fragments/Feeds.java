package com.collegare.com.collegare.Fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
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
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Activity.Home;
import com.collegare.com.collegare.Activity.postSend;
import com.collegare.com.collegare.Managers.AppManager;
import com.collegare.com.collegare.Managers.App_Config;
import com.collegare.com.collegare.Managers.CollegareParser;
import com.collegare.com.collegare.Managers.Contexter;
import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Managers.NavigationListener;
import com.collegare.com.collegare.Managers.RefressListener;
import com.collegare.com.collegare.Managers.SendListener;
import com.collegare.com.collegare.Managers.SessionManager;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.CollegareUser;
import com.collegare.com.collegare.Models.Report;
import com.collegare.com.collegare.R;
import com.collegare.com.collegare.Managers.DataStore;
import com.collegare.com.collegare.Managers.postDataAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Feeds extends Fragment implements SendListener , NavigationListener, RefressListener{
    RecyclerView recyclerView;
    postDataAdapter adapter;
    SwipeRefreshLayout swipeRefreshLayout;
    TextView error;
    DataStore dataStore;
    String groupID;
    ArrayList<CollegareFeed> feedArrayList;
    SessionManager sessionManager;
    private View view;
    Handler handler;
    private int MAX_ATTEMPT=10;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e("Feeds", "onCreate");

        super.onCreate(savedInstanceState);
        adapter= postDataAdapter.getInstance(getActivity());
        feedArrayList= new ArrayList<>();
        groupID =   sessionManager.getLastGroup();
        sessionManager= new SessionManager(getActivity());
        handler= new Handler();
        if(InternetManager.getInstance(getActivity()).isConnectedToNet()){
            String lastId=SessionManager.getLastPostID(groupID);
            getFeeds(groupID,lastId);
        }


        if(App_Config.OFFLINE){

            dataStore= new DataStore(getActivity());
            dataStore.testDB();
            Log.e("Feeds","feeds for "+groupID);
            feedArrayList=dataStore.getFeeds(groupID);
            Log.e("Feeds",feedArrayList.size()+" feeds");
        }

    }

    @Override
   public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
         view= inflater.inflate(R.layout.activity_feeds,container,false);
        error= (TextView) view.findViewById(R.id.errorPanel);
        Log.e("Feeds","onCreateView");
        swipeRefreshLayout= (SwipeRefreshLayout) view.findViewById(R.id.refresser);
        recyclerView=(RecyclerView) view.findViewById(R.id.recyclerGroups);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        swipeRefreshLayout.setColorSchemeColors(Color.RED, Color.BLUE, Color.GREEN);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refreshFeeds();
                        Log.e("Feeds","handler posted");
                    }
                },0);
            }});


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Feeds","onResume");


    }

    private void refreshFeeds() {

        if(InternetManager.getInstance(getActivity()).isConnectedToNet()){
            String lastLoadedId= SessionManager.getLastPostID(groupID);
            getFeeds(groupID,lastLoadedId);
            swipeRefreshLayout.setRefreshing(true);
            swipeRefreshLayout.setEnabled(false);
        }else{
            Snackbar.make(swipeRefreshLayout,"No Connectivity !!",Snackbar.LENGTH_SHORT).show();
            swipeRefreshLayout.setRefreshing(false);
        }

    }

    @Override
    public void send(){
        startActivity(new Intent(getActivity(), postSend.class));
    }

    @Override
    public void LoadData(String gid) {
        if(groupID==gid){
            Log.e("Feeds"," loading no data");
            return;
        }
        groupID=gid;
        getFeeds(groupID,SessionManager.getLastPostID(groupID));
    }

    @Override
    public void alert(String msg,Context context){
        Log.e("msg is"," >"+msg+"[this]"+ context);
        Toast.makeText(context, "" + msg, Toast.LENGTH_SHORT).show();
    }

    public void getFeeds(final String gid, final String lastId) {

        String TAG = "feed";

        if (!InternetManager.getInstance(getActivity()).isConnectedToNet()) {
            Log.e("Feed","no newtwork");
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.setEnabled(true);
            return;
        }

        CollegareUser dbm = DatabaseManager.getInstance(getActivity()).getUser();
        final String UserId=dbm.id;
        final String UserToken=dbm.token;


        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("Feeds:",response+"");
                CollegareParser.getInstance(getActivity()).parseFeed(response);
                callback_postReceived();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                    Log.e("Feeds",""+volleyError);
                    if(MAX_ATTEMPT>0){
                        MAX_ATTEMPT--;
                        refreshFeeds();
                    }else{
                        TimeOut();
                    }
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "feed");
               // Log.e("ttt for id>>", UserId);
                params.put("id", UserId);
               // Log.e("ttt for gid >>", gid);
                params.put("gid", gid);
                params.put("after",lastId);
                return params;
            }
        };
        //  Log.e("instanse", "" + AppManager.getInstance()+"in conte "+context);
        AppManager.getInstance().addToRequestQueue(request, TAG, getActivity());

    }                                               // getting feeds for anonymous post

    protected void callback_postReceived(){
        swipeRefreshLayout.setRefreshing(false);
        swipeRefreshLayout.setEnabled(true);
    }

    private void TimeOut(){
        Snackbar.make(swipeRefreshLayout,"Connection Problem ! Please Pull to Reload ",Snackbar.LENGTH_LONG).show();
        swipeRefreshLayout.setRefreshing(false);
    }
    @Override
    public void refress() {
        Log.e("Feed","interface call:: to refress()");
        refreshFeeds();
    }
}