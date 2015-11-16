package com.collegare.com.collegare.Fragments;


import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
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
import android.widget.Toast;

import com.collegare.com.collegare.Managers.DataStore;
import com.collegare.com.collegare.Managers.NavigationDrawerRecyclerViewAdapter;
import com.collegare.com.collegare.Managers.RecyclerViewDecorator;
import com.collegare.com.collegare.Models.CollegareAdmin;
import com.collegare.com.collegare.Models.CollegareGroup;
import com.collegare.com.collegare.Models.CollegareGroupMember;
import com.collegare.com.collegare.Models.CollegareUser;
import com.collegare.com.collegare.R;

import java.lang.ref.SoftReference;
import java.net.PortUnreachableException;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationFragment extends Fragment {

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
        groupList=user.groups;
        Log.e("Navigation fra(oCreate)"," getUsers");
        groupList.add(new CollegareGroup("0","PUBLIC","2013-12-12 12:12:12",admins,members));
        groupList.add(new CollegareGroup("1","Admins","2013-12-12 12:12:12",admins,members));

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
        email.setText(user.email+"");
        userid.setText(user.id+"");
        username.setText(user.firstname+" "+user.lastname);



        return view;
    }

    public void makeReadyNav(final Activity context,DrawerLayout drawerLayout,Toolbar toolbar){

        Log.e("passing "," "+drawerLayout);
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

}
