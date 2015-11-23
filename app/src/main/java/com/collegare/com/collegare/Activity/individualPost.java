package com.collegare.com.collegare.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Managers.AppManager;
import com.collegare.com.collegare.Managers.App_Config;
import com.collegare.com.collegare.Managers.CollegareParser;
import com.collegare.com.collegare.Managers.CommentsAdapter;
import com.collegare.com.collegare.Managers.Contexter;
import com.collegare.com.collegare.Managers.DataStore;
import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Managers.MessageAdapter;
import com.collegare.com.collegare.Managers.NavigationDrawerRecyclerViewAdapter;
import com.collegare.com.collegare.Managers.RecyclerViewDecorator;
import com.collegare.com.collegare.Models.CollegareComment;
import com.collegare.com.collegare.Models.CollegarePost;
import com.collegare.com.collegare.Models.Report;
import com.collegare.com.collegare.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class individualPost extends AppCompatActivity implements View.OnClickListener {

    RecyclerView comments;
    CommentsAdapter adapter;
    ImageView userPic,likeImg,unlikeImg;
    TextView nameDisplay,userId,contentText,likeText,unlikeText,commentCount;
    CollegarePost post;
    DataStore dataStore;
    String pID;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Initialize();

        if(getIntent()!=null){
            pID=getIntent().getExtras().getString("postId");
        }

        if(!InternetManager.getInstance(this).isConnectedToNet()){
            //
            // database reading for offline data loading
            //
            post= DatabaseManager.getInstance(this).getPost(pID);

            userId.setText(post.id);
            userPic.setImageResource(R.drawable.user_pic);
            likeText.setText(post.LikeCount);
            unlikeText.setText(post.DisLikeCount);
            nameDisplay.setText(post.username);
            contentText.setText(post.content);
            commentCount.setText(post.comment.size()+"");
            getSupportActionBar().setTitle(post.username + "`s Post");
            int resIdL=(post.isLiked.equals("true"))?R.drawable.upvote_48:R.drawable.upvote_48_black;
            int resIdD= (post.isDisliked.equals("true"))?R.drawable.downvote_48:R.drawable.downvote_48_black;

            likeImg.setImageResource(resIdL);
            unlikeImg.setImageResource(resIdD);

            adapter.setComments(post.comment);



        }else{
            RequestData();
        }

    }

    private void Initialize() {
        setContentView(R.layout.activity_individual_post);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        userId= (TextView) findViewById(R.id.userId);
        userPic= (ImageView) findViewById(R.id.userPic);
        nameDisplay= (TextView) findViewById(R.id.nameDisplay);
        contentText= (TextView) findViewById(R.id.contentText);
        likeText= (TextView) findViewById(R.id.likeText);
        unlikeText= (TextView) findViewById(R.id.unlikeText);
        likeImg = (ImageView) findViewById(R.id.likeImg);
        unlikeImg= (ImageView) findViewById(R.id.unlikeImg);
        commentCount= (TextView) findViewById(R.id.commentCount);

        dataStore= new DataStore(individualPost.this);

        likeImg.setOnClickListener(this);
        unlikeImg.setOnClickListener(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        adapter=new CommentsAdapter(this);
        comments= (RecyclerView) findViewById(R.id.commentHolder);
        comments.setLayoutManager(new LinearLayoutManager(this));
        comments.addItemDecoration(new RecyclerViewDecorator(this, 5, true, R.drawable.post_divider));
        comments.setAdapter(adapter);

    }


    @Override
    public void onClick(View view) {

        int id= view.getId();
        switch (id) {

            // case "likeBtn":
            case R.id.likeImg:
                if (InternetManager.getInstance(this).isConnectedToNet()) {


                    if (post.isLiked.equals("false") && post.isDisliked.equals("false")) {

                        String Userid = DatabaseManager.getInstance(this).getUser().id;
                        String Usertoken = DatabaseManager.getInstance(this).getUser().token;

                        likeText.setText(String.format("%s", Integer.parseInt(post.LikeCount) + 1));
                        Log.e("liked ", " ");
                        like(post.postid, Userid, Usertoken);

                    }


                 else if (post.isDisliked.equals("true")) {

                    if (InternetManager.getInstance(this).isConnectedToNet()) {
                        String Userid = DatabaseManager.getInstance(this).getUser().id;
                        String Usertoken = DatabaseManager.getInstance(this).getUser().token;

                        unlikeText.setText(String.format("%s", Integer.parseInt(post.LikeCount) - 1));
                        Log.e("nulled ", " ");
                        like(post.postid, Userid, Usertoken);
                    }
                } else {
                }}
         else{
            Snackbar.make(commentCount,"No Internet Connectivity",Snackbar.LENGTH_LONG).show();
         }


                break;
            //  case "unlikeBtn":
            case R.id.unlikeImg:

                if(InternetManager.getInstance(this).isConnectedToNet()){

                    if (post.isLiked.equals("false") && post.isDisliked.equals("false")) {


                        String Userid=DatabaseManager.getInstance(this).getUser().id;
                        String Usertoken=DatabaseManager.getInstance(this).getUser().token;

                        unlikeText.setText(String.format("%s", Integer.parseInt(post.LikeCount) + 1));
                        Log.e("disliked ", " ");
                        dislike(post.postid, Userid, Usertoken);



                    } else if (post.isLiked.equals("true")) {

                        String Userid=DatabaseManager.getInstance(this).getUser().id;
                        String Usertoken=DatabaseManager.getInstance(this).getUser().token;

                        likeText.setText(String.format("%s", Integer.parseInt(post.LikeCount) - 1));
                        Log.e("disliked ", " ");
                        dislike(post.postid, Userid, Usertoken);

                    } else {
                    }
                }
                else{
                    Snackbar.make(contentText,"No Internet Connectivity",Snackbar.LENGTH_LONG).show();
                }





        }

}

    private void like(final String PostID,final String UserId,final String UserToken) {

        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("net>>>>" + response, "");
                try {
                    JSONObject object= new JSONObject(response);
                    if(object.getString("status").equals("0")){
                        // report the UI with success of the message
                        Log.e("liked","");
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
                params.put("action", "like");
                params.put("id", UserId);
                params.put("postid",PostID);
                params.put("token",UserToken);
                return params;
            }

        };

        Log.e("instanse", "" + AppManager.getInstance());
        AppManager.getInstance().addToRequestQueue(request, "likeReq", new Contexter().getContext());

    }

    public void dislike(final String PostID,final String UserId,final String UserToken){
        String TAG = "dislikeReqSEND";

        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("net>>>>" + response, "");
                try {
                    JSONObject object= new JSONObject(response);
                    if(object.getString("status").equals("0")){
                        // report the UI with success of the message
                        Log.e("disliked","");
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
        }){
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
        AppManager.getInstance().addToRequestQueue(request, "dislikeReq",new Contexter().getContext());



    }

    private void RequestData(){

        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("www net>>>>" + response, "");
               ParseAndSet(response);
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
                params.put("action", "feed");
                params.put("postid",pID);

                return params;
            }

        };

        AppManager.getInstance().addToRequestQueue(request, "reqPostSingle",this);

    }

    private void ParseAndSet(String response) {
        CollegareComment comments;

        try {
            JSONObject postObj = new JSONObject(response);

            JSONArray comment = postObj.getJSONArray("comments");
            // comments parsing
            for (int i = 0; i < comment.length(); i++) {
                JSONObject temp = (JSONObject) comment.get(i);
                comments=new CollegareComment(
                                postObj.getString("postid"),
                                temp.getString("commentid"),
                                temp.getString("id"),
                                temp.getString("username"),
                                temp.getString("content"),
                                temp.getString("doc"));
                    CommentsAdapter.getInstance(this).addComment(comments);

            }

        /*
        *

        * */


            /*
            {
    "postid": "12",
    "content": "Some stupid not post",
    "username": "test3",
    "doc": "2015-09-15 09:17:16",
    "groupid": 1,
    "id": "3",
    "weight": "12",
    "pollid": null,
    "upcount": 1,
    "downcount": 0,
    "commentcount": 1,
    "vote": 0,

    "comments": [
        {
            "commentid": "$COMMENTID",
            "id": "$ID",
            "username": "$USERNAME",
            "content": "$CONTENT",
            "doc": "$date"
        }
    ]
}
            * */
            userId.setText(postObj.getString("id"));
            userPic.setImageResource(R.drawable.user_pic);
            likeText.setText(postObj.getString("upcount"));
            unlikeText.setText(postObj.getString("downcount"));
            nameDisplay.setText(postObj.getString("username"));
            contentText.setText(postObj.getString("content"));
            commentCount.setText(postObj.getString("commentcount"));
            toolbar.setTitle(postObj.getString("username") + "`s Post");
            int resIdL=(postObj.getString("vote").equals("1"))?R.drawable.upvote_48:R.drawable.upvote_48_black;
            int resIdD= (postObj.getString("vote").equals("-1"))?R.drawable.downvote_48:R.drawable.downvote_48_black;


            likeImg.setImageResource(resIdL);
            unlikeImg.setImageResource(resIdD);

            return;


        } catch (JSONException e) {
            e.printStackTrace();
            return;
        }
    }

}
