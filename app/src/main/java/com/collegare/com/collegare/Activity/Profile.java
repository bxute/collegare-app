package com.collegare.com.collegare.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Managers.AppManager;
import com.collegare.com.collegare.Managers.App_Config;
import com.collegare.com.collegare.Managers.CollegareParser;
import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Models.Report;
import com.collegare.com.collegare.R;
import com.collegare.com.collegare.Managers.postDataAdapter;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Profile extends AppCompatActivity {
    ImageView v;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("ankit");
        collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbar.setExpandedTitleColor(Color.WHITE);

        v= (ImageView) findViewById(R.id.profile_image);
        RequestAndSet();


    }

    public void RequestAndSet(){

        if (!InternetManager.getInstance(this).isConnectedToNet()) {
            return;
        }

        StringRequest userReq = new StringRequest(Request.Method.POST, App_Config.USER_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e(s + "[response]", "");

                try {
                    JSONObject userOBJ = new JSONObject(s);
                    int error_code = userOBJ.getInt("status");

                    Log.e("pro pic ",""+s);
                    parseAndSetPic(s);
                } catch (JSONException e) {
                    Log.e("Parse error in User","");
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
                params.put("action","getfullpic");
                String username= DatabaseManager.getInstance(Profile.this).getUser().username;
                params.put("username", username);
                return params;
            }};
        Log.e("reqeust for userinfo","");
        AppManager.getInstance().addToRequestQueue(userReq, "userinfo", this);
    }

    private void parseAndSetPic(String response) {

        String url=null;
        try {
            JSONObject urlObj=new JSONObject(response);
            url="http://collegare.eu5.org/"+urlObj.getString("url");
            Log.e("PIC url ",">"+url);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        ImageRequest request = new ImageRequest(url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap bitmap) {
                        v.setImageBitmap(bitmap);
                    }
                }, 0, 0, null,
                new Response.ErrorListener() {
                    public void onErrorResponse(VolleyError error) {
                       Log.e("errop laodf","img");
                    }
                });

        AppManager.getInstance().addToRequestQueue(request,"imgReq",Profile.this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_editProfile) {
            startActivity(new Intent(this,EditProfile.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
