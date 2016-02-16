package com.collegare.com.collegare.Activity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
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
import com.collegare.com.collegare.Managers.CollegareParser;
import com.collegare.com.collegare.Managers.DataStore;
import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Models.CollegareUser;
import com.collegare.com.collegare.Models.Report;
import com.collegare.com.collegare.R;
import com.collegare.com.collegare.Managers.AppManager;
import com.collegare.com.collegare.Managers.App_Config;
import com.collegare.com.collegare.Managers.SessionManager;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DataTruncation;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Login extends AppCompatActivity implements View.OnClickListener {
    CheckBox showPass;  //Password Show CheckBo
    EditText pass;  //password text edit field
    EditText uID;   //user id text edit field
    Button loginButton; //login button
    SessionManager session;
    AppManager manager;
    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);    // show login page
        Log.e("at login", "");
        DatabaseManager.getInstance(this).IntiateDataBase();
        session = new SessionManager(getApplicationContext());
        session.setLastGroup("1");
        showPass = (CheckBox) findViewById(R.id.showPass);         //
        pass = (EditText) findViewById(R.id.passBox);              //  Set views by IDs
        uID = (EditText) findViewById(R.id.uIDBox);              //  from xml file
        loginButton = (Button) findViewById(R.id.loginButtonId);  //
        showPass.setOnClickListener(this);  //listener for show password checkbox
        loginButton.setOnClickListener(this);   //listener for login button click
        progress = new ProgressDialog(this);
        progress.setCancelable(false);

        if (session.isLoggedIn()) {
            Intent intent = new Intent(Login.this, Home.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

    //    startActivity(new Intent(this, Home.class));
       switch (id) {
            case R.id.showPass:
                toggleCheckBox();
                break;
            case R.id.loginButtonId:
                Log.e("login"," pressed");
                attemptLogin();

                break;
            default:
                break;
        }
    }

    private void attemptLogin() {

        loginButton.setEnabled(false);
        progress.setMessage("Taking you in...");
        progress.setIndeterminate(true);
        progress.show();
        if (Validate()) {
            if (InternetManager.getInstance(this).isConnectedToNet()) {
                String hashVal = getHash(pass.getText().toString());
                Authenticate(uID.getText().toString(), hashVal);
                loginButton.setEnabled(true);
            } else {
                loginButton.setEnabled(true);
                progress.hide();
                Snackbar.make(uID, "No Connection !!", Snackbar.LENGTH_LONG).show();

            }
        } else {
            loginButton.setEnabled(true);
        }


    }

    private void Authenticate(final String username, final String pass) {


        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Login_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e(s + "[response]", "");

                try {
                    JSONObject loginOBJ = new JSONObject(s);
                    int error_code = loginOBJ.getInt("status");
                    if (error_code == 0) {
                        Log.e("status", error_code + "");
                        session.setLoginStatus(true);
                        RequestUserInfo(loginOBJ.getString("username"), loginOBJ.getString("token"));
                    } else {
                        progress.hide();
                        Snackbar.make(uID, "Authenticatio Failed !!", Snackbar.LENGTH_LONG).show();
                    }
                } catch (JSONException e) {
                    progress.hide();
                    Snackbar.make(loginButton, "Something goes Wrong !!", Snackbar.LENGTH_LONG).show();
                    Log.e("Parsing error in Login ", " ");
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("volley error in login:", " " + volleyError);
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("username", username);
                params.put("password", pass);
                return params;
            }
        };
        Log.e("reqeust for login", "");
        AppManager.getInstance().addToRequestQueue(request, "login", this);
    }

    private void toggleCheckBox() {
        if (showPass.isChecked()) {
            pass.setInputType(InputType.TYPE_CLASS_TEXT);
        } else {
            pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }

    public boolean Validate() {
        View focusView = null;
        boolean cancel = false;

        if (uID.length() < 3) {
            focusView = uID;
            cancel = true;
        }
        if (pass.length() < 4 || pass.length() > 16) {
            focusView = pass;
            cancel = true;
        }

        if (cancel) {
            focusView.requestFocus();
            progress.hide();
            Snackbar.make(pass, "Fields Cannot Be Blank !!", Snackbar.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    public void RequestUserInfo(final String username, final String token) {
        Log.e("request came for user", "");
        final Intent intent = new Intent(this, Home.class);

        final CollegareUser user = null;
        StringRequest userReq = new StringRequest(Request.Method.POST, App_Config.USER_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e(s + "[response]", "");

                try {
                    JSONObject userOBJ = new JSONObject(s);
                    int error_code = userOBJ.getInt("status");
                    if (error_code == 0) {
                        Log.e("Ustatus>>", error_code + "");
                        DatabaseManager.getInstance(getApplicationContext())
                                .addUser(CollegareParser
                                        .getInstance(getApplicationContext())
                                        .parseUserInfos(s, token));
                        startActivity(intent);
                    }
                } catch (JSONException e) {
                    Log.e("Parse error in User", "");
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("[vol] user:", " " + volleyError);
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
        Log.e("reqeust for userinfo", "");
        AppManager.getInstance().addToRequestQueue(userReq, "userinfo", this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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

    public String getHash(String str) {
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(str.toString().getBytes("UTF-8"));
            byte[] ret = md.digest();
            for (int i = 0; i < ret.length; i++) {
                sb.append(Integer.toString((ret[i] & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}