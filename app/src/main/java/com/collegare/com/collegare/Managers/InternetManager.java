package com.collegare.com.collegare.Managers;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Activity.Home;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.CollegareMessage;
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
        CollegareUser dbm = DatabaseManager.getInstance(context).getUser();
        UserId=dbm.id;
        UserToken=dbm.token;
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
    public void sendMessage(final String Receiver, final String content, final Report report) {


        if(!isConnectedToNet()){
            Log.e("netFor[msg send]>",""+isConnectedToNet());
            report.Status=App_Config.STATUS_ERROR;
            report.Description="not connectivity available !";
            return;
        }

        StringRequest sendMsgReq = new StringRequest(Request.Method.POST,
                App_Config.Message_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        Log.e("message sent", "");
                        // yet to be handled
                        try {
                            JSONObject object = new JSONObject(s);
                            String status = object.getString("status");
                            if (status.equals("0")) {
                                // report success
                                report.Description="message sent";
                                report.Status=App_Config.STATUS_OK;
                            } else {
                                // report error to the UI
                                report.Description="something happened while sending message!!";
                                report.Status=App_Config.STATUS_ERROR;
                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                // not handled yet
                report.Description="network error!!";
                report.Status=App_Config.STATUS_ERROR;
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("action", "send");
                params.put("id", UserId);
                params.put("token", UserToken);
                Log.e("token not sent", "  not set");
                params.put("to", Receiver);
                params.put("content", content);
                return params;
            }
        };

        AppManager.getInstance().addToRequestQueue(sendMsgReq, "msg req", context);

    }

    public void getMessage(final ArrayList<CollegareMessage> messages, final Report report) {

        if (!isConnectedToNet()){
            Log.e("netFor[msg get]>",""+isConnectedToNet());
            report.Status=App_Config.STATUS_ERROR;
            report.Description="not connectivity available !";
            return;
        }

        StringRequest getMsgReq = new StringRequest(Request.Method.POST,
                App_Config.Message_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        Log.e("message received:", "");
                        // yet to be handled
                        Report report1=new Report();
                        new CollegareParser().parseMessage(s, messages,report1);
                       if(report1.Status==App_Config.STATUS_OK) {
                           DatabaseManager.getInstance(context).appendMessage(messages);
                           return;
                       }
                        report.Description=report1.Description;
                        report.Status=App_Config.STATUS_ERROR;

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                // not handled yet
                report.Status=App_Config.STATUS_ERROR;
                report.Description="error  response["+this+"]";
                Log.e("[IM] ->","No Network Access !!!");
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("action", "feed");
                params.put("id", UserId);
                params.put("token", UserToken);
                Log.e("token not sent", "  not set");
                return params;
            }
        };


    }
    /*
    *
    *          Feeds      [status:OK][2]
    *
    * */
    public void getFeeds(final ArrayList<CollegareFeed> feeds, final Report report, final String gid) {
        String TAG = "feedReq";

        if (!isConnectedToNet()) {
            Log.e("netFor[feed get]>",""+isConnectedToNet());
            report.Status=App_Config.STATUS_ERROR;
            report.Description="not connectivity available !!";
            return;
        }
        report.Description="connecting";
        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("Respose{feeds}> "," "+feeds);
                Report report1= new Report();
                new CollegareParser().parseFeed(response, feeds, report1);
                if(report1.Status==App_Config.STATUS_OK){
                    // writing feeds to database
                    DatabaseManager.getInstance(context).appendFeed(feeds);
                    return;
                }
                report.Status=report1.Status;
                report.Description="error while parsing feed";
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("", "[error reported]");
                report.Status=App_Config.STATUS_OK;
                report.Description="network error";
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "feed");
                params.put("id", UserId);
                params.put("groupid",gid);
                // here id is the user id

                return params;
            }

        };

      //  Log.e("instanse", "" + AppManager.getInstance()+"in conte "+context);
        AppManager.getInstance().addToRequestQueue(request, TAG, context);


    }                                               // getting feeds for anonymous post

    public void getPost(final CollegarePost posts, final String PostID, final Report report){
        String TAG = "postReqGET";

        if (!isConnectedToNet()) {
            Log.e("netFor[post get]>",""+isConnectedToNet());
            report.Description="no internet";
            report.Status=App_Config.STATUS_ERROR;
            return;

        }
        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("net>>>>" + response, "");
                Report report1= new Report();
                new CollegareParser().parseIndividualPost(response, posts, report1);

                if(report1.Status==App_Config.STATUS_OK){
                    DatabaseManager.getInstance(context).appendComments(posts.comment);
                    return;
                }

                report.Status=App_Config.STATUS_ERROR;
                report.Description=report1.Description;

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("" + volleyError.toString(), "[error reported]");
                report.Status=App_Config.STATUS_ERROR;
                report.Description="network error";
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "feed");
                params.put("postid", PostID);

                return params;
            }

        };

        Log.e("instanse", "" + AppManager.getInstance());
        AppManager.getInstance().addToRequestQueue(request, TAG, context);


    }

    public void sendPost(final String content,final boolean isAnonymous , final Report report ){
        String TAG = "postReqSEND";

        if (!isConnectedToNet()) {
            Log.e("netFor[post send]>",""+isConnectedToNet());

                report.Status=App_Config.STATUS_ERROR;
            report.Description="no internet";
            return;
        }
        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("net>>>>" + response, "");
                try {
                    JSONObject object= new JSONObject(response);
                    if(object.getString("status").equals("0")){
                        // report the UI with success of the message
                        report.Description="sent";
                        report.Status=App_Config.STATUS_OK;
                    }
                    else{
                        report.Description="not sent";
                        report.Status=App_Config.STATUS_ERROR;

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

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
                params.put("action", "set");
                params.put("id", UserId);
                params.put("content",content);
                params.put("token",UserToken);
                params.put("manke_anon",isAnonymous+"");
                return params;
            }

        };

        Log.e("instanse", "" + AppManager.getInstance());
        AppManager.getInstance().addToRequestQueue(request, TAG, context);



    }

    public void like(final String PostID, final Report report){
        String TAG = "likeReqSEND";

        if (!isConnectedToNet()) {
            Log.e("netFor[like]>",""+isConnectedToNet());
            report.Status=App_Config.STATUS_ERROR;
            report.Description="no internet";
            return;
        }
        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("net>>>>" + response, "");
                try {
                    JSONObject object= new JSONObject(response);
                    if(object.getString("status").equals("0")){
                        // report the UI with success of the message
                        report.Description="liked";
                        report.Status=App_Config.STATUS_OK;
                    }
                    else{
                        report.Description="not liked";
                        report.Status=App_Config.STATUS_ERROR;

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

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
                params.put("action", "like");
                params.put("id", UserId);
                params.put("postid",PostID);
                params.put("token",UserToken);
                return params;
            }

        };

        Log.e("instanse", "" + AppManager.getInstance());
        AppManager.getInstance().addToRequestQueue(request, TAG, context);



    }

    public void dislike(final String PostID, final Report report){
        String TAG = "dislikeReqSEND";

        if (!isConnectedToNet()) {
            Log.e("netFor[dislike]>",""+isConnectedToNet());
            report.Status=App_Config.STATUS_ERROR;
            report.Description="no internet";
            return;
        }
        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("net>>>>" + response, "");
                try {
                    JSONObject object= new JSONObject(response);
                    if(object.getString("status").equals("0")){
                        // report the UI with success of the message
                        report.Description="disliked";
                        report.Status=App_Config.STATUS_OK;
                    }
                    else{
                        report.Description="not disliked";
                        report.Status=App_Config.STATUS_ERROR;

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

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
                params.put("action", "dislike");
                params.put("id", UserId);
                params.put("postid",PostID);
                params.put("token",UserToken);
                return params;
            }

        };

        Log.e("instanse", "" + AppManager.getInstance());
        AppManager.getInstance().addToRequestQueue(request, TAG, context);



    }

    /*
    *
    *
    *       User Infos
    *
    * */

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
                new CollegareParser().parseUserInfos(response, user,report1);
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
    }

    public void getUserPicFull( final Report report){
        String TAG = "post_Req_USER_IMAGE";

        if (!isConnectedToNet()) {
            Log.e("netFor[pic full get]>",""+isConnectedToNet());
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
                new CollegareParser().parsePicFullURL(report1);
                if(report1.Status==App_Config.STATUS_OK){
                    report.Description=report1.Description;
                    return;
                }
                report.Status=App_Config.STATUS_ERROR;
                report.Description="image not available";
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
                params.put("action", "getfullpic");
                params.put("id", UserId);
                return params;
            }

        };

        Log.e("instanse", "" + AppManager.getInstance());
        AppManager.getInstance().addToRequestQueue(request, TAG, context);
    }

    public void getUserPic(final Report report){
        String TAG = "post_Req_USER_GET";

        if (!isConnectedToNet()) {
            Log.e("netFor[user pic get]>",""+isConnectedToNet());
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
                new CollegareParser().parsePicURL(report1);
                if(report1.Status==App_Config.STATUS_OK){
                    report.Description=report1.Description;
                    return;
                }
                report.Status=App_Config.STATUS_ERROR;
                report.Description="image not available";
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
                params.put("action", "getpic");
                params.put("id", UserId);
                return params;
            }

        };

        Log.e("instanse", "" + AppManager.getInstance());
        AppManager.getInstance().addToRequestQueue(request, TAG, context);
    }

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
