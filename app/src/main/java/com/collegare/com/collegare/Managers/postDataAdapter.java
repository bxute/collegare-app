package com.collegare.com.collegare.Managers;

/**
 * Created by Vishal on 03-10-2015.
 */

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Vishal on 27-09-2015.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Activity.Home;
import com.collegare.com.collegare.Activity.Profile;
import com.collegare.com.collegare.Activity.individualPost;
import com.collegare.com.collegare.Fragments.Feeds;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.CollegarePost;
import com.collegare.com.collegare.R;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class postDataAdapter extends RecyclerView
        .Adapter<postDataAdapter
        .DataObjectHolder> {

    static postDataAdapter bInstance;
    public ArrayList<CollegareFeed> mDataset;
    public SessionManager sessionManager;
    Context context;

    public postDataAdapter(ArrayList<CollegareFeed> myDataset) {
        mDataset = myDataset;
    }

    public postDataAdapter(Context context) {
        sessionManager = new SessionManager(context);
        this.context = context;
        mDataset=new ArrayList<>();
    }

    public static postDataAdapter getInstance(Context context) {
        if (bInstance == null) {
            bInstance = new postDataAdapter(context);
        }
        return bInstance;
    }

    public void setPostDataList(ArrayList<CollegareFeed> list) {
        //Log.e("ccc","postlist set");
        this.mDataset = list;
        notifyDataSetChanged();
    }

    public void addToPostDataList(CollegareFeed feed) {
        // Log.e("ccc feed added to adapter","");
        boolean insert = true;

        int i = 0;

        while(insert && (i < mDataset.size()))
        {
            if(mDataset.get(i).postid.equals(feed.postid)) {
                insert = false;
            }
            i++;
        }

        if(insert)
            mDataset.add(0,feed);

        notifyDataSetChanged();
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_layout, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        Date d = new Date();
        final CharSequence doc  = DateFormat.format("yyyy-MM-dd hh:mm:ss", d.getTime());
        String timePast = TimeManager.getInstance().convert(doc.toString(), mDataset.get(position).doc);
        holder.post.setText(mDataset.get(position).content);
        holder.commentCount.setText(mDataset.get(position).CommentCount);
        holder.disLikeCount.setText(mDataset.get(position).dislikeCount);
        holder.likeCount.setText(mDataset.get(position).likeCount);
        String tag = String.format("%c", mDataset.get(position).username.toUpperCase().charAt(0));
        holder.tagChar.setText(tag);
        holder.timeSpan.setText(timePast);
        holder.userName.setText(mDataset.get(position).username);

        int resIdL = (mDataset.get(position).isLiked.equals("true")) ? R.drawable.upvote_48 : R.drawable.upvote_48_black;
        int resIdD = (mDataset.get(position).isDisliked.equals("true")) ? R.drawable.downvote_48 : R.drawable.downvote_48_black;

        holder.like.setImageResource(resIdL);
        holder.unlike.setImageResource(resIdD);

    }

    @Override
    public int getItemCount() {
       // Log.e("size", mDataset.size() + "");
        return mDataset.size();

    }

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView likeCount;
        TextView disLikeCount;
        TextView group;
        TextView tagChar;
        TextView timeSpan;
        TextView post;
        TextView commentCount;
        TextView userName;
        ImageView like;
        ImageView unlike;
        ImageView comment;

        public DataObjectHolder(View itemView) {
            super(itemView);
            likeCount = (TextView) itemView.findViewById(R.id.likeText);
            disLikeCount = (TextView) itemView.findViewById(R.id.unlikeText);
            tagChar = (TextView) itemView.findViewById(R.id.TagChar);
            post = (TextView) itemView.findViewById(R.id.textPost);
            timeSpan = (TextView) itemView.findViewById(R.id.pastTime);
            commentCount = (TextView) itemView.findViewById(R.id.commentCount);
            userName = (TextView) itemView.findViewById(R.id.usernameDisplay);

            comment = (ImageView) itemView.findViewById(R.id.commentImg);
            like = (ImageView) itemView.findViewById(R.id.likeImg);
            unlike = (ImageView) itemView.findViewById(R.id.unlikeImg);

            itemView.setOnClickListener(this);
            like.setOnClickListener(this);
            unlike.setOnClickListener(this);
            comment.setOnClickListener(this);
            post.setOnClickListener(this);
            tagChar.setOnClickListener(this);
            userName.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            postDataAdapter instance = postDataAdapter.getInstance(new Contexter().getContext());

            Fragment feedFragment= (Fragment)new Feeds();

            String Userid= DatabaseManager.getInstance(instance.context).getUser().id;
            String Usertoken=DatabaseManager.getInstance(instance.context).getUser().token;
            int id= v.getId();
            int currentPosition = getAdapterPosition();
            CollegareFeed feed = instance.mDataset.get(currentPosition);

            Log.e("crnt post >>", "" + currentPosition);
            Log.e("gid ", ">>" + feed.postid);

            switch (id) {

                case R.id.usernameDisplay:
                    if(InternetManager.getInstance(instance.context).isConnectedToNet()){
                        Intent proIntent= new Intent(instance.context, Profile.class);
                        proIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        Bundle bundle= new Bundle();
                        bundle.putString("username","test1");
                        proIntent.putExtras(bundle);
                        instance.context.startActivity(proIntent);

                    }else
                    {
                        ((SendListener)feedFragment).alert("No Internet Connectivity",instance.context);
                    }


                    break;

                case R.id.TagChar :
                    if(InternetManager.getInstance(instance.context).isConnectedToNet()){
                    Intent proIntent= new Intent(instance.context, Profile.class);
                    proIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    Bundle bundle= new Bundle();
                    bundle.putString("username","test1");
                    proIntent.putExtras(bundle);
                    instance.context.startActivity(proIntent);
                    }else
                    {
                        ((SendListener)feedFragment).alert("No Internet Connectivity",instance.context);
                    }
                    break;

               // case "likeBtn":

                case R.id.likeImg :
                    if(InternetManager.getInstance(instance.context).isConnectedToNet()){
                        if (feed.isLiked.equals("false") && feed.isDisliked.equals("false")) {

                                feed.likeCount = String.format("%s", Integer.parseInt(feed.likeCount)+1);
                                feed.isLiked="true";
                                Log.e("liked ", " " + currentPosition);

                                like(feed.postid,Userid,Usertoken);

                                instance.notifyItemChanged(currentPosition);
                            }

                        else if (feed.isDisliked.equals("true")) {

                            //feed.likeCount = String.format("%s", Integer.parseInt(instance.mDataset.get(currentPosition).likeCount) + 1);
                            feed.dislikeCount = String.format("%s", Integer.parseInt(feed.dislikeCount) - 1);
                            //feed.isLiked="true";
                            feed.isDisliked="false";

                            like(feed.postid,Userid,Usertoken);

                            Log.e("nulled "," "+currentPosition);
                            instance.notifyItemChanged(currentPosition);

                        } else{ }
                    }
                    else{
                        ((SendListener)feedFragment).alert("No Internet Connectivity",instance.context);
                    }


                    break;
              //  case "unlikeBtn":
                case R.id.unlikeImg:
                    if(InternetManager.getInstance(instance.context).isConnectedToNet()){

                        if (feed.isLiked.equals("false") && feed.isDisliked.equals("false")) {

                            feed.dislikeCount = String.format("%s", Integer.parseInt(feed.dislikeCount)+1);
                            feed.isDisliked="true";
                            Log.e("disliked ", " " + currentPosition);

                            dislike(feed.postid, Userid, Usertoken);

                            instance.notifyItemChanged(currentPosition);

                        } else if (feed.isLiked.equals("true")) {

                            feed.likeCount = String.format("%s", Integer.parseInt(feed.likeCount) - 1);
                            feed.isLiked="false";

                            dislike(feed.postid,Userid,Usertoken);

                            Log.e("nulled "," "+currentPosition);
                            instance.notifyItemChanged(currentPosition);

                        } else {

                        }

                    }else{
                        ((SendListener)feedFragment).alert("No Internet Connectivity",instance.context);
                    }

                    break;

                case R.id.textPost:

                    Intent i = new Intent(instance.context, individualPost.class);
                  Bundle   bundle = new Bundle();
                    bundle.putString("postId", feed.postid);
                    bundle.putString("content",feed.content);
                    bundle.putString("likes",feed.likeCount);
                    bundle.putString("dislikes",feed.dislikeCount);
                    bundle.putString("comments",feed.CommentCount);
                    bundle.putString("username",feed.username);
                    bundle.putString("isLiked",feed.isLiked);
                    bundle.putString("isDisliked",feed.isDisliked);
                    bundle.putString("lc",feed.likeCount);
                    bundle.putString("dc",feed.dislikeCount);
                    bundle.putString("uid",feed.id);
                    i.putExtras(bundle);
                   // instance.sessionManager.setLastGroup(feed.groupid);
                   // Log.e("stored gid", " " + feed.groupid);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    instance.context.startActivity(i);

                    break;
                case R.id.commentImg:
                    i = new Intent(instance.context, individualPost.class);
                    bundle = new Bundle();
                    bundle.putString("postId", feed.postid);
                    i.putExtras(bundle);
                    instance.sessionManager.setLastGroup(feed.groupid);
                    Log.e("stored gid"," "+feed.groupid);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    instance.context.startActivity(i);


                    break;


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
            AppManager.getInstance().addToRequestQueue(request, "dislikeReq", new Contexter().getContext());



        }
    }

}
