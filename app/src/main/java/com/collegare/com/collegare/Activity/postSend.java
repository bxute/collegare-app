package com.collegare.com.collegare.Activity;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Managers.AppManager;
import com.collegare.com.collegare.Managers.App_Config;
import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Models.CollegareUser;
import com.collegare.com.collegare.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class postSend extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    EditText postcontent;
    Button sendBtn;

    CheckBox anonyCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_send);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        postcontent= (EditText) findViewById(R.id.postContent);
        sendBtn= (Button) findViewById(R.id.send);
        anonyCheck= (CheckBox) findViewById(R.id.anonyCheck);
        sendBtn.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        int id=view.getId();

        if(id==R.id.send){
            String post=postcontent.getText().toString();
            if(post.length()>5){
                Toast.makeText(this,""+anonyCheck.isChecked(),Toast.LENGTH_LONG).show();

                if (InternetManager.getInstance(this).isConnectedToNet()) {
                    sendPost(post, anonyCheck.isChecked());
                }
                else{
                    Snackbar.make(postcontent,"No Internet Connectivity",Snackbar.LENGTH_SHORT).show();
                }


            }
        }

    }

    public void sendPost(final String content,final boolean isAnonymous  ){
        String TAG = "postReqSEND";


        CollegareUser user= DatabaseManager.getInstance(this).getUser();
        final String UserId= user.id;
        final String UserToken=user.token;

        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL,
                new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {

                try {
                    JSONObject object= new JSONObject(response);

                    if(object.getString("status").equals("0")){
                        Log.e("post sent","");
                    }
                    else{

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("" + volleyError.toString(), "[error reported]");

            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "set");
                params.put("id", UserId);
                params.put("content",content);
                params.put("token",UserToken);
                params.put("manke_anon",isAnonymous+"");
                return params;
            }

        };

        AppManager.getInstance().addToRequestQueue(request, "postSendReq", this);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_post_send, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
