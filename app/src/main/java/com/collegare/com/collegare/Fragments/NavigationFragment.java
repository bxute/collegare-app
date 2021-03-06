package com.collegare.com.collegare.fragments;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.activities.EditProfile;
import com.collegare.com.collegare.volley.AppManager;
import com.collegare.com.collegare.utilities.App_Config;
import com.collegare.com.collegare.testStore.DataStore;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.network.Imager;
import com.collegare.com.collegare.network.InternetManager;
import com.collegare.com.collegare.adapters.NavigationDrawerRecyclerViewAdapter;
import com.collegare.com.collegare.customControls.RecyclerViewDecorator;
import com.collegare.com.collegare.models.CollegareAdmin;
import com.collegare.com.collegare.models.CollegareGroup;
import com.collegare.com.collegare.models.CollegareGroupMember;
import com.collegare.com.collegare.models.CollegareUser;
import com.collegare.com.collegare.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationFragment extends Fragment implements View.OnClickListener {

    RecyclerView navRv;
    RecyclerView.Adapter navRVadapter;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FloatingActionButton fab;
    public DrawerLayout DrawerLayout;
    private ArrayList<CollegareGroup> groupList;
    private ArrayList<CollegareAdmin> admins;
    private ArrayList<CollegareGroupMember> members;
    private DataStore dataStore;
    ImageView proPic;
    TextView email,userid,username;
    CollegareUser user;

    public NavigationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        groupList= new ArrayList<>();
        admins= new ArrayList<>();
        members= new ArrayList<>();
        dataStore= new DataStore(getActivity());
        user=dataStore.getUser();
        if(user!=null) {
            groupList = user.groups;
           // Log.e("Navigation fra(oCreate)", " getUsers");
            groupList.add(new CollegareGroup("0", "Public", "2013-12-12 12:12:12", admins, members));
            groupList.add(new CollegareGroup("1", "Admins", "2013-12-12 12:12:12", admins, members));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_navigation, container, false);
        navRv= (RecyclerView) view.findViewById(R.id.navRecycler);
        proPic= (ImageView) view.findViewById(R.id.profile_image);
        email= (TextView) view.findViewById(R.id.email);
        userid= (TextView) view.findViewById(R.id.userId);
        username= (TextView) view.findViewById(R.id.username);
        proPic.setOnClickListener(this);


        if(user!=null){
            email.setText(user.email + "");
            userid.setText(user.id + "");
            username.setText(user.firstname + " " + user.lastname);

        }

        return view;
    }


    public void makeReadyNav(final Activity context,DrawerLayout drawerLayout,Toolbar toolbar){

        if(Imager.getInstance(getActivity()).isImageAvailable()){
            //Log.e("nav pic ","aval");
            proPic.setImageBitmap(Imager.getInstance(getActivity()).getImage());
        }
        else{
            if (InternetManager.getInstance(getActivity()).isConnectedToNet()) {
                requestImage();
            }
            else {
                proPic.setImageResource(R.drawable.ankit);
            }

        }



        //Log.e("passing "," "+drawerLayout);
        navRVadapter= new NavigationDrawerRecyclerViewAdapter(getActivity(),drawerLayout,new Feeds());
        NavigationDrawerRecyclerViewAdapter.getInstance(getActivity()).setGroupsList(groupList);
        navRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        navRv.addItemDecoration(new RecyclerViewDecorator(getActivity(), 5, true, R.drawable.post_divider));
        navRv.setAdapter(navRVadapter);

        fab= (FloatingActionButton) context.findViewById(R.id.fab);
        actionBarDrawerToggle=new ActionBarDrawerToggle(context,drawerLayout,toolbar,R.string.navigation_drawer_close,R.string.navigation_drawer_close){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                context.invalidateOptionsMenu();
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                context.invalidateOptionsMenu();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                if(slideOffset*280>=240 && fab.isShown()){fab.hide();}
                else if(slideOffset*280<=240 && !fab.isShown()){
                    fab.show();
                }
            }
        };
        drawerLayout.post(new Runnable() {
            @Override
            public void run() {
                actionBarDrawerToggle.syncState();
            }
        });
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

    }

    public void requestImage(){

        StringRequest userReq = new StringRequest(Request.Method.POST, App_Config.USER_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
             //   Log.e(s + "[response]", "");

                try {
                    JSONObject userOBJ = new JSONObject(s);
                    int error_code = userOBJ.getInt("status");
                    if(error_code==0){
                        String url=null;
                        url="http://collegare.eu5.org/"+userOBJ.getString("url");
                        parseAndSet(url);

                    }
               //     Log.e("nav pic ", "" + s);


                } catch (JSONException e) {
                    Log.e("Nav",""+e);
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("[vol] user:"," "+volleyError);
            }}){
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action","getpic");
                String username= DatabaseManager.getInstance(getActivity()).getUser().username;
                params.put("username", username);
                return params;
            }};
       // Log.e("reqeust for userinfo", "");
        AppManager.getInstance().addToRequestQueue(userReq, "userinfo", getActivity());
    }

    public void parseAndSet(String url){

        ImageRequest imageRequest= new ImageRequest(url, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap bitmap) {
                    proPic.setImageBitmap(bitmap);
                    Imager.getInstance(getActivity()).saveImage(bitmap);
            }
        },0,0,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                   // Log.e("error","nav pic fetch up");
            }
        });

    }

    @Override
    public void onClick(View view) {
        int id= view.getId();

        if(id==R.id.profile_image){

            startActivity(new Intent(getActivity(), EditProfile.class));

        }
    }
}
