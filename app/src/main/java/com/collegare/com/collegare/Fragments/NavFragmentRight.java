package com.collegare.com.collegare.Fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.collegare.com.collegare.Managers.NavigationDrawerRecyclerViewAdapter;
import com.collegare.com.collegare.Managers.RecyclerViewDecorator;
import com.collegare.com.collegare.R;

/**
 * Created by RadhePC on 12-11-2015.
 */
public class NavFragmentRight extends Fragment {
    RecyclerView navRv;
    RecyclerView.Adapter navRVadapter;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FloatingActionButton fab;
    public NavFragmentRight() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_navigation, container, false);
        return view;
    }

    public void makeReadyNav(final Activity context,DrawerLayout drawerLayout,Toolbar toolbar){
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

                /*if(slideOffset*280>=240 && fab.isShown()){fab.hide();}
                else if(slideOffset*280<=240 && !fab.isShown()){
                    fab.show();
                }*/
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
