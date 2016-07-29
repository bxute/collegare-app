package com.collegare.com.collegare.adapters;

/**
 * Created by Ankit on 03-10-2015.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.activities.Profile;
import com.collegare.com.collegare.activities.IndivisualPost;
import com.collegare.com.collegare.fragments.Feeds;
import com.collegare.com.collegare.volley.AppManager;
import com.collegare.com.collegare.utilities.App_Config;
import com.collegare.com.collegare.utilities.Contexter;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.network.InternetManager;
import com.collegare.com.collegare.interfaces.LogoutListener;
import com.collegare.com.collegare.interfaces.FABListener;
import com.collegare.com.collegare.SharedPreference.SessionManager;
import com.collegare.com.collegare.textUtils.TimeManager;
import com.collegare.com.collegare.interfaces.UpdateListener;
import com.collegare.com.collegare.models.CollegareFeed;
import com.collegare.com.collegare.models.CollegarePost;
import com.collegare.com.collegare.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vishal on 27-09-2015.
 */


public class FeedsAdapter extends RecyclerView
        .Adapter<RecyclerView.ViewHolder> implements LogoutListener, UpdateListener {

    static FeedsAdapter bInstance;
    public ArrayList<CollegareFeed> mDataset;
    public SessionManager sessionManager;
    Context context;

    private static int TYPE_POLL=0;
    private static int TYPE_POST=1;


    public FeedsAdapter(ArrayList<CollegareFeed> myDataset) {
        mDataset = myDataset;
        // polls = pollList;
    }

    public FeedsAdapter(Context context) {
        sessionManager = new SessionManager(context);
        this.context = context;
        //Log.e("PDA","constructor");
        mDataset=new ArrayList<>();
        SessionManager.setLastPostID(SessionManager.getLastGroup(),"0");



    }

    public static FeedsAdapter getInstance(Context context) {
        if (bInstance == null) {
            bInstance = new FeedsAdapter(context);
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

        if(insert){
            mDataset.add(0, feed);
           // Log.e("PDA"," pid:"+mDataset.get(0).postid+" iliked:"+mDataset.get(0).isLiked);
        }


        notifyDataSetChanged();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType==TYPE_POST){
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.post_layout, parent, false);
            return new PostHolder(view);
        }
        else {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.poll_card, parent, false);
            return new PollHolder(view);
        }


    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        Date d = new Date();
        final CharSequence doc  = DateFormat.format("yyyy-MM-dd hh:mm:ss", d.getTime());
        String timePast = TimeManager.getInstance().getDifference(doc.toString(), mDataset.get(position).doc);

        if(mDataset.get(position).pollid.equals("null")){
            ( (PostHolder) holder).post.setText(mDataset.get(position).content);
            ( (PostHolder) holder).commentCount.setText(mDataset.get(position).CommentCount);
            ( (PostHolder) holder).disLikeCount.setText(mDataset.get(position).dislikeCount);
            ( (PostHolder) holder).likeCount.setText(mDataset.get(position).likeCount);
            String tag = String.format("%c", mDataset.get(position).username.toUpperCase().charAt(0));
            ( (PostHolder) holder).tagChar.setText(tag);
            ( (PostHolder) holder).timeSpan.setText(timePast);
            ( (PostHolder) holder).userName.setText(mDataset.get(position).username);
            int resIdL = (mDataset.get(position).isLiked.equals("true")) ? R.drawable.upvote_48 : R.drawable.upvote_48_black;
            int resIdD = (mDataset.get(position).isDisliked.equals("true")) ? R.drawable.downvote_48 : R.drawable.downvote_48_black;
            // Log.e("PDA","pid:"+mDataset.get(position).content+" vote:"+mDataset.get(position).isLiked);
            ( (PostHolder) holder).like.setImageResource(resIdL);
            ( (PostHolder) holder).unlike.setImageResource(resIdD);
        }
        else{
            ((PollHolder) holder).content.setText(mDataset.get(position).content);
            ((PollHolder) holder).duration.setText(timePast);
            final PollOptionsAdapter adapter=
                    new PollOptionsAdapter(context,mDataset.get(position).pollOptions,mDataset.get(position).pollOptionSelected);
                    ((PollHolder) holder).pollOptions.setAdapter(adapter);
                    setListViewHeight(((PollHolder) holder).pollOptions);
            if(!mDataset.get(position).pollOptionSelected.equals("")){
                adapter.setSelected(Integer.parseInt(mDataset.get(position).pollOptionSelected));
                ((PollHolder) holder).lock.setImageResource(R.drawable.lock_pressed);

            }else{
                ((PollHolder) holder).lockHolder.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (adapter.getSelected() == -1) return;
                        ((PollHolder) holder).lock.setImageResource(R.drawable.lock_pressed);
                        adapter.show();

                    }
                });
            }



        }

    }

    @Override
    public int getItemCount() {
       // Log.e("size", mDataset.size() + "");
        return mDataset.size();

    }

    @Override
    public void reset() {
        Log.e("PDA","Done reset DataSet");
        mDataset.clear();
    }

    @Override
    public void update(CollegarePost post, int position) {
   // Log.e("size",""+mDataset.size());
        mDataset.get(position).isLiked=post.isLiked;
        mDataset.get(position).isDisliked=post.isDisliked;

        mDataset.get(position).likeCount=post.LikeCount;
        mDataset.get(position).dislikeCount=post.DisLikeCount;

        mDataset.get(position).CommentCount=post.comment.size()+"";
        notifyItemChanged(position);
    }

    @Override
    public int getItemViewType(int position){
        super.getItemViewType(position);
            if(mDataset.get(position).pollid.equals("null")){
                return TYPE_POST;
            }
       return TYPE_POLL;
    }


    public static class PostHolder extends RecyclerView.ViewHolder
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

        public PostHolder(View itemView) {
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

            FeedsAdapter instance = FeedsAdapter.getInstance(new Contexter().getContext());

            Fragment feedFragment= (Fragment)new Feeds();

            String Userid= DatabaseManager.getInstance(instance.context).getUser().id;
            String Usertoken=DatabaseManager.getInstance(instance.context).getUser().token;
            int id= v.getId();
            int currentPosition = getAdapterPosition();
            CollegareFeed feed = instance.mDataset.get(currentPosition);

          //  Log.e("crnt post >>", "" + currentPosition);
           // Log.e("gid ", ">>" + feed.postid);

            switch (id) {

                case R.id.usernameDisplay:
                    if(InternetManager.getInstance(instance.context).isConnectedToNet()){
                        Intent proIntent= new Intent(instance.context, Profile.class);
                        proIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        Bundle bundle= new Bundle();
                        bundle.putString("username",feed.username);
                        proIntent.putExtras(bundle);
                        instance.context.startActivity(proIntent);

                    }else
                    {
                        ((FABListener)feedFragment).alert("No Internet Connectivity",instance.context);
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
                        ((FABListener)feedFragment).alert("No Internet Connectivity",instance.context);
                    }
                    break;

               // case "likeBtn":

                case R.id.likeImg :
                    if(InternetManager.getInstance(instance.context).isConnectedToNet()){
                        if (feed.isLiked.equals("false") && feed.isDisliked.equals("false")) {

                                feed.likeCount = String.format("%s", Integer.parseInt(feed.likeCount)+1);
                                feed.isLiked="true";
                               // Log.e("liked ", " " + currentPosition);

                                like(feed.postid,Userid,Usertoken);

                                instance.notifyItemChanged(currentPosition);
                            }

                        else if (feed.isDisliked.equals("true")) {

                            //feed.likeCount = String.format("%s", Integer.parseInt(instance.mDataset.get(currentPosition).likeCount) + 1);
                            feed.dislikeCount = String.format("%s", Integer.parseInt(feed.dislikeCount) - 1);
                            //feed.isLiked="true";
                            feed.isDisliked="false";

                            backoff(feed.postid, Userid, Usertoken);

                          //  Log.e("nulled "," "+currentPosition);
                            instance.notifyItemChanged(currentPosition);

                        } else{ }
                    }
                    else{
                        ((FABListener)feedFragment).alert("No Internet Connectivity",instance.context);
                    }


                    break;
              //  case "unlikeBtn":
                case R.id.unlikeImg:
                    if(InternetManager.getInstance(instance.context).isConnectedToNet()){

                        if (feed.isLiked.equals("false") && feed.isDisliked.equals("false")) {

                            feed.dislikeCount = String.format("%s", Integer.parseInt(feed.dislikeCount)+1);
                            feed.isDisliked="true";
                          //  Log.e("disliked ", " " + currentPosition);

                            dislike(feed.postid, Userid, Usertoken);

                            instance.notifyItemChanged(currentPosition);

                        } else if (feed.isLiked.equals("true")) {

                            feed.likeCount = String.format("%s", Integer.parseInt(feed.likeCount) - 1);
                            feed.isLiked="false";

                            backoff(feed.postid, Userid, Usertoken);

                           // Log.e("nulled "," "+currentPosition);
                            instance.notifyItemChanged(currentPosition);

                        } else {

                        }

                    }else{
                        ((FABListener)feedFragment).alert("No Internet Connectivity",instance.context);
                    }

                    break;

                case R.id.textPost:

                    Intent i = new Intent(instance.context, IndivisualPost.class);
                  Bundle   bundle = new Bundle();
                    bundle.putString("postId", feed.postid);
                    bundle.putString("content",feed.content);
                    bundle.putString("likes",feed.likeCount);
                    bundle.putString("comments",feed.CommentCount);
                    bundle.putString("username",feed.username);
                    bundle.putString("isLiked",feed.isLiked);
                    bundle.putString("isDisliked",feed.isDisliked);
                    bundle.putString("weight", feed.weight);
                    bundle.putString("lc",feed.likeCount);
                    bundle.putString("dc",feed.dislikeCount);
                    bundle.putString("uid",feed.id);
                    bundle.putString("doc", feed.doc);
                    bundle.putString("position",currentPosition+"");
                    i.putExtras(bundle);
                   // instance.sessionManager.setLastGroup(feed.groupid);
                   // Log.e("stored gid", " " + feed.groupid);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    instance.context.startActivity(i);

                    break;
                case R.id.commentImg:
                    i = new Intent(instance.context, IndivisualPost.class);
                    bundle = new Bundle();
                    bundle.putString("postId", feed.postid);
                    bundle.putString("content",feed.content);
                    bundle.putString("likes",feed.likeCount);
                    bundle.putString("comments",feed.CommentCount);
                    bundle.putString("username",feed.username);
                    bundle.putString("isLiked",feed.isLiked);
                    bundle.putString("isDisliked",feed.isDisliked);
                    bundle.putString("weight", feed.weight);
                    bundle.putString("lc",feed.likeCount);
                    bundle.putString("dc",feed.dislikeCount);
                    bundle.putString("uid",feed.id);
                    bundle.putString("doc", feed.doc);
                    bundle.putString("position",currentPosition+"");
                    i.putExtras(bundle);
                    instance.sessionManager.setLastGroup(feed.groupid);
                   // Log.e("stored gid"," "+feed.groupid);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    instance.context.startActivity(i);


                    break;


            }


        }

        private void like(final String PostID,final String UserId,final String UserToken) {
            String TAG = "Up Vote";
            StringRequest request = new StringRequest(Request.Method.POST, App_Config.Vote_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                    Log.e("PDA","like>"+response);
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
                    params.put("action", "upvote");
                    params.put("id", UserId);
                    params.put("postid",PostID);
                    params.put("token",UserToken);
                    return params;
                }

            };

            AppManager.getInstance().addToRequestQueue(request, "likeReq", new Contexter().getContext());

        }

        private void backoff(final String PostID,final String UserId,final String UserToken){
            String TAG = "Backoff Vote";
            StringRequest request = new StringRequest(Request.Method.POST, App_Config.Vote_URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.e("PDA","backoff>"+response);
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
                    params.put("action", "none");
                    params.put("id", UserId);
                    params.put("postid",PostID);
                    params.put("token",UserToken);
                    return params;
                }

            };

            AppManager.getInstance().addToRequestQueue(request, "likeReq", new Contexter().getContext());
        }

        public void dislike(final String PostID,final String UserId,final String UserToken){
            String TAG = "Down Vote";

            StringRequest request = new StringRequest(Request.Method.POST, App_Config.Vote_URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                            Log.e("PDA","dislike >"+response);
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
                    params.put("action", "downvote");
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

    public static class PollHolder extends RecyclerView.ViewHolder{

        TextView content;
        TextView duration;
        ListView pollOptions;
        RelativeLayout lockHolder;
        ImageView lock;

        public PollHolder(View itemView) {
            super(itemView);
            content= (TextView) itemView.findViewById(R.id.content);
            duration= (TextView) itemView.findViewById(R.id.duration);
            pollOptions= (ListView) itemView.findViewById(R.id.Polloptions);
            lockHolder= (RelativeLayout) itemView.findViewById(R.id.lockHolder);
            lock = (ImageView) itemView.findViewById(R.id.lock);
        }

    }

    public void setListViewHeight(ListView listView){
        PollOptionsAdapter adapter = (PollOptionsAdapter) listView.getAdapter();
        if(adapter!=null){
            int items = adapter.getCount();
            //get total height of items
            int totalHeight = 0 ;
            for(int i = 0; i< items ; i++){
                View view = adapter.getView(i,null,listView);
                view.measure(0,0);
                totalHeight += view.getMeasuredHeight();
            }
            //get height of all dividers
            int dividersHeight = listView.getDividerHeight() * (items);

            ViewGroup.LayoutParams params = listView.getLayoutParams();
            params.height = totalHeight+dividersHeight;
            listView.setLayoutParams(params);
            listView.requestLayout();
        }

    }
}
