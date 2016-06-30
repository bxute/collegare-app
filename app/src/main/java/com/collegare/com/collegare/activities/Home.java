package com.collegare.com.collegare.activities;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.collegare.com.collegare.fragments.NavigationFragment;
import com.collegare.com.collegare.fragments.SendDailoge;
import com.collegare.com.collegare.adapters.BPagerAdapter;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.handlers.TaskHandler;
import com.collegare.com.collegare.interfaces.LogoutListener;
import com.collegare.com.collegare.adapters.MessageRoomAdapter;
import com.collegare.com.collegare.interfaces.FABListener;
import com.collegare.com.collegare.SharedPreference.SessionManager;
import com.collegare.com.collegare.adapters.PostDataAdapter;
import com.collegare.com.collegare.R;


public class Home extends AppCompatActivity {

    CharSequence bTitle;
    CharSequence bDrawerTitle;
    NavigationView bNavigationView;
    DrawerLayout bDrawerLayout;
    ActionBarDrawerToggle bDrawerToggle;
    Toolbar toolbar;
    FloatingActionButton fab;
    TabLayout tabLayout;
    ViewPager viewPager;
    SessionManager sessionManager;
    PagerAdapter pagerAdapter;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sessionManager = new SessionManager(this);
        setContentView(R.layout.activity_home);
        init();
        TaskHandler.getInstance(this).initialize();
    }

    @Override
    protected void onResume(){
        super.onResume();
     //   Log.e("Home", "vp stat ::" + viewPager);
        if(SessionManager.getSendType().equals("1")){
            viewPager.setCurrentItem(1);
            SessionManager.setSendType("0");
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bDrawerToggle.onConfigurationChanged(configuration);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_Profile:
                Intent aboutUsIntent = new Intent(this, Profile.class);
                Bundle data=new Bundle();
                data.putString("username",DatabaseManager.getInstance(this).getUser().username);
                aboutUsIntent.putExtras(data);
                startActivity(aboutUsIntent);
                break;
            case R.id.action_LogOut:
                logout();
                break;
            case R.id.action_CreatePoll:
                break;
        }
        return false;
    }

    public void logout(){
        SessionManager.setLoginStatus(false);
        DatabaseManager.getInstance(this).rollbackDatabase();
        SessionManager.setLastPostID(SessionManager.getLastGroup(),"0");
        startActivity(new Intent(this, Login.class));
        ((LogoutListener) PostDataAdapter.getInstance(this)).reset();
        ((LogoutListener) MessageRoomAdapter.getInstance(this)).reset();
        finish();
    }

    public void init() {

        bTitle = bDrawerTitle = getTitle();
        bDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Feeds"));
        tabLayout.addTab(tabLayout.newTab().setText("Messages"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        viewPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new BPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()==1){
                    ///fab.setBackgroundResource(R.drawable.add2);
                }
                else fab.show();

                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        NavigationFragment navigationFragment = (NavigationFragment) getFragmentManager().findFragmentById(R.id.fragmentNav);
        navigationFragment.makeReadyNav(this, bDrawerLayout, toolbar);
        final SendDailoge sendDailoge = new SendDailoge(this);
        sendDailoge.setCancelable(true);
        sendDailoge.setTitle("Sending Post");
        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       fragment = (Fragment) pagerAdapter.instantiateItem(viewPager, viewPager.getCurrentItem());

                                       if (fragment instanceof FABListener) {
                                           ((FABListener) fragment).send();
                                       }
                                   }
                               }
        );

    }

/*
    @Override
    public void sent(int type) {

        fragment = (Fragment) pagerAdapter.instantiateItem(viewPager, type);

        if (type == 0) {
            viewPager.setCurrentItem(0);
            if (fragment instanceof RefressListener) {
                ((RefressListener) fragment).refress();
            }

        } else {
            viewPager.setCurrentItem(1);
            if (fragment instanceof RefressListener) {
                ((RefressListener) fragment).refress();
            }
        }

    }*/
}