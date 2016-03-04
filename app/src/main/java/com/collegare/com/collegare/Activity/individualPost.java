package com.collegare.com.collegare.Activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
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
import com.collegare.com.collegare.Managers.CommentsAdapter;
import com.collegare.com.collegare.Managers.Contexter;
import com.collegare.com.collegare.Managers.DataStore;
import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Managers.RecyclerViewDecorator;
import com.collegare.com.collegare.Managers.UpdateListener;
import com.collegare.com.collegare.Managers.postDataAdapter;
import com.collegare.com.collegare.Models.CollegareComment;
import com.collegare.com.collegare.Models.CollegarePost;
import com.collegare.com.collegare.Models.CollegareUser;
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
    ImageView userPic, likeImg, unlikeImg;
    TextView nameDisplay, userId, contentText, likeText, unlikeText, commentCount;
    CollegarePost post;
    DataStore dataStore;
    String pID;
    ProgressDialog progressDialoge;
    private Toolbar toolbar;
    private int position;
    private postDataAdapter pda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Initialize();

        if (getIntent() != null)
            pID = getIntent().getExtras().getString("postId");

        if (!InternetManager.getInstance(this).isConnectedToNet()) {

            post = DatabaseManager.getInstance(this).getPost(pID);
            userId.setText(post.id);
            userPic.setImageResource(R.drawable.user_pic);
            likeText.setText(post.LikeCount);
            unlikeText.setText(post.DisLikeCount);
            nameDisplay.setText(post.username);
            contentText.setText(post.content);
            commentCount.setText(post.comment.size() + "");
            getSupportActionBar().setTitle(post.username + "`s Post");
            int resIdL = (post.isLiked.equals("true")) ? R.drawable.upvote_48 : R.drawable.upvote_48_black;
            int resIdD = (post.isDisliked.equals("true")) ? R.drawable.downvote_48 : R.drawable.downvote_48_black;
            likeImg.setImageResource(resIdL);
            unlikeImg.setImageResource(resIdD);
            adapter.setComments(post.comment);

        } else {
            progressDialoge.show();
            RequestData();
        }

    }

    private void Initialize() {
        setContentView(R.layout.activity_individual_post);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        userId = (TextView) findViewById(R.id.userId);
        userPic = (ImageView) findViewById(R.id.userPic);
        nameDisplay = (TextView) findViewById(R.id.nameDisplay);
        contentText = (TextView) findViewById(R.id.contentText);
        likeText = (TextView) findViewById(R.id.likeText);
        unlikeText = (TextView) findViewById(R.id.unlikeText);
        likeImg = (ImageView) findViewById(R.id.likeImg);
        unlikeImg = (ImageView) findViewById(R.id.unlikeImg);
        commentCount = (TextView) findViewById(R.id.commentCount);

        dataStore = new DataStore(individualPost.this);
        pda=postDataAdapter.getInstance(this);
        progressDialoge = new ProgressDialog(this);
        progressDialoge.setIndeterminate(true);
        progressDialoge.setMessage("Crunching latest data...");
        progressDialoge.setCancelable(false);


        Bundle bucket = getIntent().getExtras();
        userId.setText(bucket.getString("uid"));
        nameDisplay.setText(bucket.getString("username"));
        contentText.setText(bucket.getString("content"));
        likeText.setText(bucket.getString("lc"));
        unlikeText.setText(bucket.getString("dc"));
        commentCount.setText(bucket.getString("comments"));
        toolbar.setTitle(bucket.getString("username") + "`s Post");
        int resIdL = (bucket.getString("isLiked").equals("true")) ? R.drawable.upvote_48 : R.drawable.upvote_48_black;
        int resIdD = (bucket.getString("isDisliked").equals("true")) ? R.drawable.downvote_48 : R.drawable.downvote_48_black;
        likeImg.setImageResource(resIdL);
        unlikeImg.setImageResource(resIdD);
        position = Integer.parseInt(bucket.getString("position"));
        post = new CollegarePost(
                bucket.getString("postid"),
                bucket.getString("content"),
                bucket.getString("username"),
                bucket.getString("doc"),
                bucket.getString("groupid"),
                bucket.getString("id"),
                bucket.getString("weight"),
                bucket.getString("pollid"),
                bucket.getString("lc"),
                bucket.getString("dc"),
                bucket.getString("isLiked"),
                bucket.getString("isDisliked"),
                null
        );

        likeImg.setOnClickListener(this);
        unlikeImg.setOnClickListener(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        adapter = new CommentsAdapter(this);
        comments = (RecyclerView) findViewById(R.id.commentHolder);
        comments.setLayoutManager(new LinearLayoutManager(this));
        comments.addItemDecoration(new RecyclerViewDecorator(this, 5, true, R.drawable.post_divider));
        comments.setAdapter(adapter);

    }

    @Override
    public void onPause(){
        Log.e("IP","onPause()");
        super.onPause();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.e("IP","thread dispatched");
                ((UpdateListener) pda).Update(post, position);
            }
        },100);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        CollegareUser curr = DatabaseManager.getInstance(this).getUser();
        switch (id) {

            // case "likeBtn":
            case R.id.likeImg:
                if (InternetManager.getInstance(this).isConnectedToNet()) {

                    if (post.isDisliked.equals("true")) {
                        post.isDisliked = "false";
                        post.DisLikeCount = String.valueOf(Integer.parseInt(post.DisLikeCount) - 1);

                        unlikeImg.setImageResource(R.drawable.downvote_48_black);
                        unlikeText.setText(post.DisLikeCount);

                        backoff(post.postid, curr.id, curr.token);
                    } else if (post.isLiked.matches("false")) {
                        post.isLiked = "true";
                        post.LikeCount = String.valueOf(Integer.parseInt(post.LikeCount) + 1);

                        likeImg.setImageResource(R.drawable.upvote_48);
                        likeText.setText(post.LikeCount);

                        like(post.postid, curr.id, curr.token);
                    }

                } else {
                    Snackbar.make(commentCount, "No Internet Connectivity", Snackbar.LENGTH_LONG).show();
                }
                break;

            //  case "unlikeBtn":
            case R.id.unlikeImg:

                if (InternetManager.getInstance(this).isConnectedToNet()) {

                    if (post.isLiked.matches("true")) {
                        post.isLiked = "false";
                        post.LikeCount = String.valueOf(Integer.parseInt(post.LikeCount) - 1);

                        likeImg.setImageResource(R.drawable.upvote_48_black);
                        likeText.setText(post.LikeCount);

                        backoff(post.postid, curr.id, curr.token);
                    } else if (post.isDisliked.matches("false")) {
                        post.isDisliked = "true";
                        post.DisLikeCount = String.valueOf(Integer.parseInt(post.DisLikeCount) + 1);

                        unlikeImg.setImageResource(R.drawable.downvote_48);
                        unlikeText.setText(post.DisLikeCount);

                        dislike(post.postid, curr.id, curr.token);
                    }

                } else {
                    Snackbar.make(contentText, "No Internet Connectivity", Snackbar.LENGTH_LONG).show();
                }


        }

    }


    private void like(final String PostID, final String UserId, final String UserToken) {

        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Vote_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("IP", ""+response);
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("IP",""+volleyError);
                Snackbar.make(userId, "Connection Problem ! ", Snackbar.LENGTH_LONG).show();


            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "upvote");
                Log.e("IP", UserId);
                params.put("id", UserId);
                params.put("postid", PostID);
                Log.e("IP", PostID);
                params.put("token", UserToken);
                Log.e("IP", UserToken);;
                return params;
            }

        };

       // Log.e("instanse", "" + AppManager.getInstance());
        AppManager.getInstance().addToRequestQueue(request, "lrq",this);

    }


    private void backoff(final String PostID,final String UserId,final String UserToken){
        String TAG = "Backoff Vote";
        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Vote_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("IP","backoff>"+response);
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("IP",""+volleyError);
                Snackbar.make(userId,"Connection Problem !",Snackbar.LENGTH_LONG).show();



            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "none");
                params.put("id", UserId);
                params.put("postid",PostID);
                params.put("token", UserToken);
                return params;
            }

        };

        AppManager.getInstance().addToRequestQueue(request, "likeReq", new Contexter().getContext());
    }


    public void dislike(final String PostID, final String UserId, final String UserToken) {
        String TAG = "dislikeReqSEND";

        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Vote_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Log.e("Response", response);
                try {
                    JSONObject object = new JSONObject(response);
                    if (object.getString("status").equals("0")) {
                      //  ((UpdateListener) pda).Update(post, position);
                    } else {


                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("IP",""+volleyError);
                Snackbar.make(userId, "Connection Problem ! ", Snackbar.LENGTH_LONG).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "downvote");

                params.put("id", UserId);

                params.put("postid", PostID);

                params.put("token", UserToken);

                return params;
            }

        };

        AppManager.getInstance().addToRequestQueue(request, "drq", this);


    }


    private void RequestData() {

        final CollegareUser user = DatabaseManager.getInstance(this).getUser();
       // Log.e("TT", "user id :" + user.id);
        StringRequest request = new StringRequest(Request.Method.POST, App_Config.Post_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Toast.makeText(context,response,Toast.LENGTH_LONG).show();
                Log.e("IP", response + "");
                ParseAndSet(response);
                progressDialoge.hide();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                TimeOut();
                Log.e("volley", volleyError + "");

            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "get");
                params.put("postid", pID);
                params.put("id", user.id);

                return params;
            }

        };

        AppManager.getInstance().addToRequestQueue(request, "reqPostSingle", this);

    }


    private void TimeOut(){
        progressDialoge.dismiss();
        Snackbar.make(userId,"TimeOut !!",Snackbar.LENGTH_LONG).show();

    }


    private void ParseAndSet(String response) {
        ArrayList<CollegareComment> comments = new ArrayList<>();

        try {
            JSONObject postObj = new JSONObject(response);

            JSONArray comment = postObj.getJSONArray("comments");
            // comments parsing
            for (int i = 0; i < comment.length(); i++) {
                JSONObject temp = (JSONObject) comment.get(i);
                comments.add(new CollegareComment(
                        postObj.getString("postid"),
                        temp.getString("commentid"),
                        temp.getString("id"),
                        temp.getString("username"),
                        temp.getString("content"),
                                temp.getString("doc"))
                );
                CommentsAdapter.getInstance(this).setComments(comments);
            }
            post.comment=comments;
            post.DisLikeCount = postObj.getString("downcount");
            post.LikeCount = postObj.getString("upcount");
            post.content = postObj.getString("content");
            post.postid = postObj.getString("postid");

            userId.setText(postObj.getString("id"));
            userPic.setImageResource(R.drawable.user_pic);
            likeText.setText(postObj.getString("upcount"));

            unlikeText.setText(postObj.getString("downcount"));

            nameDisplay.setText(postObj.getString("username"));
            contentText.setText(postObj.getString("content"));
            commentCount.setText(postObj.getString("commentcount"));
            int resIdL = (postObj.getString("vote").equals("1")) ? R.drawable.upvote_48 : R.drawable.upvote_48_black;
            int resIdD = (postObj.getString("vote").equals("-1")) ? R.drawable.downvote_48 : R.drawable.downvote_48_black;

            likeImg.setImageResource(resIdL);
            unlikeImg.setImageResource(resIdD);


            return;


        } catch (JSONException e) {
            e.printStackTrace();
            return;
        }
    }

}
