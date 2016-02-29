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
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Activity.MessageSend;
import com.collegare.com.collegare.Activity.postSend;
import com.collegare.com.collegare.Managers.AppManager;
import com.collegare.com.collegare.Managers.App_Config;
import com.collegare.com.collegare.Managers.CollegareParser;
import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Managers.MessageAdapter;
import com.collegare.com.collegare.Managers.RecyclerViewDecorator;
import com.collegare.com.collegare.Managers.RefressListener;
import com.collegare.com.collegare.Managers.SendListener;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.CollegareMessage;
import com.collegare.com.collegare.Models.CollegareUser;
import com.collegare.com.collegare.Models.Report;
import com.collegare.com.collegare.R;
import com.collegare.com.collegare.Managers.DataStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Messages extends Fragment implements SendListener,RefressListener {
    RecyclerView recyclerView;
    MessageAdapter adapter;
    InternetManager internetManager;
    TextView error;
    ArrayList<CollegareMessage> dataList;
    SwipeRefreshLayout swipeRefreshLayout;
    Handler hadler;
    private DataStore dataStore;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = MessageAdapter.getInstance(getActivity());
        hadler= new Handler();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_message, container, false);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        error = (TextView) view.findViewById(R.id.errorPanel);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.refresser);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerAnonymous);
        recyclerView.addItemDecoration(new RecyclerViewDecorator(getActivity(), 5, true, R.drawable.post_divider));
        dataStore = new DataStore(getActivity());

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