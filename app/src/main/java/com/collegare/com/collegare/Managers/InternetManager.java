package com.collegare.com.collegare.Managers;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Activity.Home;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.CollegareMessage;
import com.collegare.com.collegare.Models.CollegareMessageSent;
import com.collegare.com.collegare.Models.CollegarePost;
import com.collegare.com.collegare.Models.CollegareUser;
import com.collegare.com.collegare.Models.Report;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InternetManager {
    SessionManager session;
    Context context;
    postDataAdapter adapter;
    String UserId = null;
    String UserToken = null;
    static InternetManager bInstance;
    public InternetManager(Context context) {
        this.context = context;

    }
    public static InternetManager getInstance(Context context){
        if(bInstance==null){
            bInstance= new InternetManager(context);
        }
        return bInstance;
    }

    public InternetManager(Context context, postDataAdapter adapter) {
        this.context = context;
        this.adapter = adapter;
    }

    public boolean isConnectedToNet() {

        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        final android.net.NetworkInfo mobileData = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        final android.net.NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (mobileData.isConnected()) {
            return true;
        } else if (wifi.isConnected()) {
            return true;
        }
        return false;
    }

    /*
    *
    *           MESSAGE SENDER              [STATUS: OK][2]
    *
    * */
    public void sendMessage(final String Receiver, final String content) {


        if(!isConnectedToNet()){
            return;
        }

        CollegareUser dbm = DatabaseManager.getInstance(context).getUser();
        UserId=dbm.id;
        UserToken=dbm.token;

        Date d = new Date();
        final CharSequence doc  = DateFormat.format("yyyy-mm-dd hh:mm:ss", d.getTime());

        StringRequest sendMsgReq = new StringRequest(Request.Method.POST,
                App_Config.Message_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Log.e("msg rpt ", "" + s);
                        /*CollegareParser.getInstance(context).parseSentMessage(s,new CollegareMessageSent(content,Receiver,
                                ""+doc,UserId*/

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("action", "send");
                params.put("id", UserId);
                params.put("token", UserToken);
                params.put("recid", Receiver);
                params.put("content", content);
                return params;
            }
        };

        AppManager.getInstance().addToRequestQueue(sendMsgReq, "msg req", context);

    }

   //[1**]
    public void getMessage() {

        if (!isConnectedToNet()){
            return;
        }

        CollegareUser dbm = DatabaseManager.getInstance(context).getUser();
        UserId=dbm.id;
        UserToken=dbm.token;

        StringRequest getMsgReq = new StringRequest(Request.Method.POST,
                App_Config.Message_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        Log.e("IM", ""+s);
                        CollegareParser.getInstance(context).parseMessage(s);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                // not handled yet
                Log.e("[IM] ->","No Network Access !!!");
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

            AppManager.getInstance().addToRequestQueue(getMsgReq,"msgReq",context);
    }
    /*
    *
    *          Feeds      [status:OK][2]
    *
    * */

    public void getFeeds(final String gid, final String lastId) {

        String TAG = "feedReq";

        if (!isConnectedToNet()) {
            Log.e("IM",""+isConnectedToNet());
            return;
        }

        CollegareUser dbm = DatabaseManager.getInstance(context).getUser();
        UserId=dbm.id;
        UserToken=dbm.token;


        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("IM",""+response);
                CollegareParser.getInstance(context).parseFeed(response);
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "feed");

                params.put("id", UserId);

                params.put("gid", gid);
                params.put("lastid",lastId);
                return params;
            }
        };
      //  Log.e("instanse", "" + AppManager.getInstance()+"in conte "+context);
        AppManager.getInstance().addToRequestQueue(request, TAG, context);

    }                                               // getting feeds for anonymous post


    public void getUserInfo(final CollegareUser user, final Report report){
        String TAG = "post_Req_USER_GET";

        if (!isConnectedToNet()) {
            Log.e("netFor[user info get]>",""+isConnectedToNet());
            report.Status=App_Config.STATUS_ERROR;
            report.Description="not connectivity available !";
            return;
        }
        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("net>>>>" + response, "");
                Report report1= new Report();
//                CollegareParser.getInstance(context).parseUserInfos(response, user, report1);
                if(report1.Status==App_Config.STATUS_OK){
                    DatabaseManager.getInstance(context).addUser(user);
                    return;
                }
                report.Status=App_Config.STATUS_ERROR;
                report.Description=report1.Description;


            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("" + volleyError.toString(), "[error reported]");
                report.Description="network error !";
                report.Status=App_Config.STATUS_ERROR;
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "get");
                params.put("id", UserId);
                return params;
            }

        };

        Log.e("instanse", "" + AppManager.getInstance());
        AppManager.getInstance().addToRequestQueue(request, TAG, context);
    }           // [ABANDONED FUNCTION]


    public void uploadPic(final String filePath,Report report){
        int serverResponseCode=-1;
        String fileName = filePath;

        // setting up the stuffs for future use
        HttpURLConnection conn = null;
        DataOutputStream dos = null;
        String lineEnd = "\r\n";
        String twoHyphens = "--";
        String boundary = "*****";
        int bytesRead, bytesAvailable, bufferSize;
        byte[] buffer;
        int maxBufferSize = 1 * 1024 * 1024;
        File sourceFile = new File(filePath);

        if (!sourceFile.isFile()) {

            // something should be prompted for error

            Log.e("uploadFile", "Source File not exist :"
                    + fileName);
            return;
        } else {
            if(isConnectedToNet()) {
                try {

                    // open a URL connection to the Servlet
                    FileInputStream fileInputStream = new FileInputStream(sourceFile);
                    URL url = new URL("url of remote server");

                    // Open a HTTP  connection to  the URL
                    conn = (HttpURLConnection) url.openConnection();
                    conn.setDoInput(true); // Allow Inputs
                    conn.setDoOutput(true); // Allow Outputs
                    conn.setUseCaches(false); // Don't use a Cached Copy
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Connection", "Keep-Alive");
                    conn.setRequestProperty("ENCTYPE", "multipart/form-data");
                    conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
                    conn.setRequestProperty("uploaded_file", fileName);

                    dos = new DataOutputStream(conn.getOutputStream());

                    dos.writeBytes(twoHyphens + boundary + lineEnd);
                    dos.writeBytes("Content-Disposition: form-data; name=" + fileName + ";filename="
                            + fileName + "" + lineEnd);

                    dos.writeBytes(lineEnd);

                    // create a buffer of  maximum size
                    bytesAvailable = fileInputStream.available();

                    bufferSize = Math.min(bytesAvailable, maxBufferSize);
                    buffer = new byte[bufferSize];

                    // read file and write it into form...
                    bytesRead = fileInputStream.read(buffer, 0, bufferSize);

                    while (bytesRead > 0) {

                        dos.write(buffer, 0, bufferSize);
                        bytesAvailable = fileInputStream.available();
                        bufferSize = Math.min(bytesAvailable, maxBufferSize);
                        bytesRead = fileInputStream.read(buffer, 0, bufferSize);

                    }

                    // send multipart form data necesssary after file data...
                    dos.writeBytes(lineEnd);
                    dos.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);

                    // Responses from the server (code and message)
                    serverResponseCode = conn.getResponseCode();
                    String serverResponseMessage = conn.getResponseMessage();

                    Log.i("uploadFile", "HTTP Response is : "
                            + serverResponseMessage + ": " + serverResponseCode);

                    if (serverResponseCode == 200) {
                        report.Status = App_Config.STATUS_OK;
                        report.Description = "uploaded successfully !";
                        // do something ... i.e. pic is uploaded successfully
                    }

                    //close the streams //
                    fileInputStream.close();
                    dos.flush();
                    dos.close();

                } catch (MalformedURLException ex) {

                    report.Status = App_Config.STATUS_ERROR;
                    report.Description = "error while uploading !";
                    ex.printStackTrace();

                    Log.e("Upload file to server", "error: " + ex.getMessage(), ex);
                } catch (Exception e) {
                    e.printStackTrace();
                    report.Status = App_Config.STATUS_ERROR;
                    report.Description = "Exception occured while uploading !";
                }
            }
            else{
                Log.e("netFor[pic send]>",""+isConnectedToNet());
            }
            return;

        } // End else block
    }


}
