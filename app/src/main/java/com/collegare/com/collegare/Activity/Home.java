package  com.collegare.com.collegare.Activity;


import android.app.ActionBar;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.support.design.widget.FloatingActionButton;
import android.widget.Toast;

import com.collegare.com.collegare.Fragments.NavigationFragment;
import com.collegare.com.collegare.Fragments.SendDailoge;
import com.collegare.com.collegare.Managers.DataStore;
import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Managers.SendListener;
import com.collegare.com.collegare.Managers.SessionManager;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.Report;
import com.collegare.com.collegare.R;
import com.collegare.com.collegare.Managers.BPagerAdapter;
//import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;


import java.util.ArrayList;
import java.util.Date;

import javax.security.auth.login.LoginException;

public class Home extends AppCompatActivity {

    // private members
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
     //   new DataStore(this).testDB()
       /* Date d= new Date();
        final CharSequence doc  = DateFormat.format("yyyy-mm-dd hh:mm:ss", d.getTime());
        final CharSequence doc1  = DateFormat.format("yyyy-MM-dd hh:mm:ss", d.getTime());*/
        /*Log.v("doc:"," "+doc);
        Log.v("doc1"," "+doc1);*/
        Log.e("home", "callled");
        sessionManager= new SessionManager(this);
        setContentView(R.layout.activity_home);

        Init();
        View view=findViewById(R.id.toolbar);

     //   tester();

    }

    /*private void tester() {
        Log.e("tester"," testing");
        ArrayList<CollegareFeed> feeds= new ArrayList<>();
        Report report= new Report();
        InternetManager.getInstance(this).getFeeds();

    }
*/
    @Override
    public void onConfigurationChanged(Configuration configuration){

        super.onConfigurationChanged(configuration);
        bDrawerToggle.onConfigurationChanged(configuration);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id=item.getItemId();

        switch (id){
            case R.id.action_Profile :

               // bDrawerLayout.openDrawer(Gravity.RIGHT);

                Intent aboutUsIntent= new Intent(this, Profile.class);
                Log.e("inte", "");
                  startActivity(aboutUsIntent);
                break;
            case R.id.action_LogOut:
                        SessionManager.setLoginStatus(false);
                        finish();
                break;


        }
        return false;

    }


    public void Init() {

        bTitle = bDrawerTitle = getTitle();
        bDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        tabLayout=(TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Feeds"));
        tabLayout.addTab(tabLayout.newTab().setText("Messages"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        viewPager=(ViewPager) findViewById(R.id.pager);
        pagerAdapter =new BPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
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
        //getSupportActionBar().setIcon(R.drawable.icon);

        NavigationFragment navigationFragment= (NavigationFragment) getFragmentManager().findFragmentById(R.id.fragmentNav);
   //     NavigationFragment navigationFragmentRight= (NavigationFragment) getFragmentManager().findFragmentById(R.id.fragmentNavRight);
        Log.e("making drawer ready","");
       navigationFragment.makeReadyNav(this, bDrawerLayout, toolbar);
        Log.e("drawer made","");
        /*
        *
        *           setting up the floating action menus
        *
        * *//*

        ImageView menuImg=new ImageView(this);
        menuImg.setImageResource(R.drawable.edit);
        ImageView moveToTopImg = new ImageView(this);
        moveToTopImg.setImageResource(R.drawable.to_top);
        ImageView addImg= new ImageView(this);
        addImg.setImageResource(R.drawable.add2);
        ImageView  otherImg = new ImageView(this);
        otherImg.setImageResource(R.drawable.add1);

        FloatingActionButton fab= new FloatingActionButton.Builder(this)
                .setContentView(menuImg).build();
        SubActionButton moveToTopBtn = new SubActionButton.Builder(this).setContentView(moveToTopImg).build();
        SubActionButton sendBtn = new SubActionButton.Builder(this).setContentView(addImg).build();
        SubActionButton otherBtn = new SubActionButton.Builder(this).setContentView(otherImg).build();

        FloatingActionMenu actionMenu= new FloatingActionMenu.Builder(this)
                .attachTo(fab)
                .build();*/
/*
*
*
* setting up own fab
* */
        final SendDailoge sendDailoge= new SendDailoge(this);
        sendDailoge.setCancelable(true);
        sendDailoge.setTitle("Sending Post");
        fab=(FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 fragment= (Fragment) pagerAdapter.instantiateItem(viewPager,viewPager.getCurrentItem());
                if(fragment instanceof SendListener){
                    ((SendListener) fragment).send();
                }
            }
        });

    }

}