package com.collegare.com.collegare.Fragments;

import android.graphics.Color;
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

import com.collegare.com.collegare.Managers.App_Config;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Managers.NavigationListener;
import com.collegare.com.collegare.Managers.SendListener;
import com.collegare.com.collegare.Managers.SessionManager;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.Report;
import com.collegare.com.collegare.R;
import com.collegare.com.collegare.Managers.DataStore;
import com.collegare.com.collegare.Managers.postDataAdapter;

import java.util.ArrayList;


public class Feeds extends Fragment implements SendListener , NavigationListener{
    RecyclerView recyclerView;
    postDataAdapter adapter;
    SwipeRefreshLayout swipeRefreshLayout;
    TextView error;
    DataStore dataStore;
    String groupID;
    ArrayList<CollegareFeed> feedArrayList;
    SessionManager sessionManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e("feeds oncreate called"," ");
        super.onCreate(savedInstanceState);
        adapter= postDataAdapter.getInstance(getActivity());
        feedArrayList= new ArrayList<>();
        groupID =   sessionManager.getLastGroup();
        sessionManager= new SessionManager(getActivity());
        if(InternetManager.getInstance(getActivity()).isConnectedToNet()){
            InternetManager.getInstance(getActivity()).getFeeds(groupID);
        }
    }

    @Override
   public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_feeds,container,false);
        error= (TextView) view.findViewById(R.id.errorPanel);
        Log.e("feeds oncreateView cld","");
        swipeRefreshLayout= (SwipeRefreshLayout) view.findViewById(R.id.refresser);
        recyclerView=(RecyclerView) view.findViewById(R.id.recyclerGroups);
        Log.e("restored gid"," "+groupID);
        dataStore= new DataStore(getActivity());

        feedArrayList=dataStore.getFeeds(groupID);
        /*if(feedArrayList.size()==0){
            recyclerView.setVisibility(View.GONE);
            error.setVisibility(View.VISIBLE);
            error.setText("Data Not Available");
        }*/


        //Toast.makeText(getActivity()," "+rp.Description+" sta "+rp.Status,Toast.LENGTH_LONG).show();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        swipeRefreshLayout.setColorSchemeColors(Color.RED, Color.BLUE, Color.CYAN);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
               refressFeeds();
                Log.e("[feed] refress "," triggered");
            }});


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(" feeds onResume called"," ");
    }

    private void refressFeeds() {

        if(InternetManager.getInstance(getActivity()).isConnectedToNet()){
            InternetManager.getInstance(getActivity()).getFeeds(groupID);
            swipeRefreshLayout.setRefreshing(false);
        }else{
            Snackbar.make(swipeRefreshLayout,"No Connectivity !!",Snackbar.LENGTH_SHORT).show();
            swipeRefreshLayout.setRefreshing(false);
        }

    }

    @Override
    public void send(){
    }

    @Override
    public void LoadData(String gid) {
        if(groupID==gid){
            return;
        }
        groupID=gid;
        dataStore=new DataStore(getActivity());
        adapter= postDataAdapter.getInstance(getActivity());

                Log.e("data"," "+dataStore);
                        feedArrayList=dataStore.getFeeds(groupID);
                        this.adapter.setPostDataList(feedArrayList);
                Log.e("got  "," "+feedArrayList.size()+" items");

        this.adapter.notifyDataSetChanged();
    }
}