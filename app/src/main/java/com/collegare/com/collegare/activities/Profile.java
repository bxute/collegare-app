package com.collegare.com.collegare.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.volley.AppManager;
import com.collegare.com.collegare.utilities.App_Config;
import com.collegare.com.collegare.network.InternetManager;
import com.collegare.com.collegare.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Profile extends AppCompatActivity implements OnClickListener {
    ImageView v;
    Toolbar toolbar;
    String username;
    CollapsingToolbarLayout toolbarLayout;
    TextView bio;
    TextView contact;
    TextView email;
    TextView holiness;
    RelativeLayout callBtn,emailBtn;
    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbar.setExpandedTitleColor(Color.WHITE);
        progress= new ProgressDialog(this);
        v= (ImageView) findViewById(R.id.profile_image);
        toolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        bio= (TextView) findViewById(R.id.shortbio);
        contact= (TextView) findViewById(R.id.phone);
        email= (TextView) findViewById(R.id.email);
        holiness= (TextView) findViewById(R.id.holiness);
        callBtn= (RelativeLayout) findViewById(R.id.callBtn);
        emailBtn= (RelativeLayout) findViewById(R.id.emailBtn);
        username=getIntent().getExtras().getString("username");
        Log.e("Profile",""+username);
        collapsingToolbar.setTitle(username);
        callBtn.setOnClickListener(this);
        emailBtn.setOnClickListener(this);

        /*if(Imager.getInstance(this).isProfileImageAvailable()){
            Log.e("img","available");
            v.setImageBitmap(Imager.getInstance(this).getFullImage());
        }
        else{
            RequestAndSet();
        }*/

        if(InternetManager.getInstance(this).isConnectedToNet()){
            requestAndSetPic();
            requestUserInfo(username);
        }

        toolbarLayout.setTitle(username);
        progress.setMessage("Retrieving Infos");
        progress.setIndeterminate(true);

    }


    public void requestAndSetPic(){

        StringRequest userReq = new StringRequest(Request.Method.POST, App_Config.USER_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
               Log.e("Profile",""+s);

                try {
                    JSONObject userOBJ = new JSONObject(s);
                    int error_code = userOBJ.getInt("status");

               //     Log.e("pro pic ",""+s);
                    parseAndSetPic(s);
                } catch (JSONException e) {
                    Log.e("Profile",""+e);
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }}){
            @Override
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<String, String>();
                params.put("action","getfullpic");
                params.put("username", username);
                return params;
            }};

        AppManager.getInstance().addToRequestQueue(userReq, "userinfo", this);
    }

    private void parseAndSetPic(String response) {

        String url=null;
        try {
            JSONObject urlObj=new JSONObject(response);
            url="http://collegare.eu5.org/"+urlObj.getString("url");
            //Log.e("PIC url ",">"+url);
        } catch (JSONException e) {
            e.printStackTrace();
        }

            ImageRequest request = new ImageRequest(url,
                    new Response.Listener<Bitmap>() {
                        @Override
                        public void onResponse(Bitmap bitmap) {
                            v.setImageBitmap(bitmap);
                           // Imager.getInstance(Profile.this).saveFullImage(bitmap);
                        }
                    }, 0, 0, null,
                    new Response.ErrorListener() {
                        public void onErrorResponse(VolleyError error) {
                           // Log.e("errop laodf","img");
                        }
                    });

            AppManager.getInstance().addToRequestQueue(request,"imgReq",Profile.this);

        }


    public void requestUserInfo(final String username) {

        StringRequest userReq = new StringRequest(Request.Method.POST, App_Config.USER_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("Profile", ""+s);

                try {
                    JSONObject userOBJ = new JSONObject(s);
                    int error_code = userOBJ.getInt("status");
                    if (error_code == 0) {
                        progress.dismiss();
                       // bio.setText();
                        //contact.setText(userOBJ.getString("contact"));
                        holiness.setText(userOBJ.getString("holiness"));
                        email.setText(userOBJ.getString("email"));

                    }
                } catch (JSONException e) {
                    Log.e("Profile",""+e);
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("Profile", " " + volleyError);
                Snackbar.make(callBtn,"Cannot update Infos",Snackbar.LENGTH_LONG).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "get");
                params.put("username", username);
                return params;
            }
        };
        //Log.e("reqeust for userinfo", "");
        AppManager.getInstance().addToRequestQueue(userReq, "userinfo", this);


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

    @Override
    public void onClick(View view) {
        int id=view.getId();

        if(id==R.id.emailBtn){
          //  Log.e("a", "sdf");

            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_EMAIL, "" + email.getText());
            intent.putExtra(Intent.EXTRA_EMAIL, "" + email.getText());
            startActivity(Intent.createChooser(intent,"Choose For Email"));

        }
        if(id==R.id.callBtn){
            Intent intent=new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+contact.getText()));
            startActivity(intent);

        }

    }
}
