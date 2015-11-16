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

import com.collegare.com.collegare.Managers.App_Config;
import com.collegare.com.collegare.Managers.CommentsAdapter;
import com.collegare.com.collegare.Managers.DataStore;
import com.collegare.com.collegare.Managers.InternetManager;
import com.collegare.com.collegare.Managers.MessageAdapter;
import com.collegare.com.collegare.Managers.NavigationDrawerRecyclerViewAdapter;
import com.collegare.com.collegare.Managers.RecyclerViewDecorator;
import com.collegare.com.collegare.Models.CollegareComment;
import com.collegare.com.collegare.Models.CollegarePost;
import com.collegare.com.collegare.Models.Report;
import com.collegare.com.collegare.R;

import java.util.ArrayList;

public class individualPost extends AppCompatActivity implements View.OnClickListener {

    RecyclerView comments;
    CommentsAdapter adapter;
    ImageView userPic,likeImg,unlikeImg;
    TextView nameDisplay,userId,contentText,likeText,unlikeText,commentCount;
    CollegarePost post;
    Report report;
    DataStore dataStore;
    String pID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Initialize();
    }

    private void Initialize() {
        setContentView(R.layout.activity_individual_post);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        userId= (TextView) findViewById(R.id.userId);
        userPic= (ImageView) findViewById(R.id.userPic);
        nameDisplay= (TextView) findViewById(R.id.nameDisplay);
        contentText= (TextView) findViewById(R.id.contentText);
        likeText= (TextView) findViewById(R.id.likeText);
        unlikeText= (TextView) findViewById(R.id.unlikeText);
        likeImg = (ImageView) findViewById(R.id.likeImg);
        unlikeImg= (ImageView) findViewById(R.id.unlikeImg);
        commentCount= (TextView) findViewById(R.id.commentCount);
        report= new Report();
        dataStore= new DataStore(getApplicationContext());

        likeImg.setOnClickListener(this);
        unlikeImg.setOnClickListener(this);
        if(getIntent()!=null){
            pID=getIntent().getExtras().getString("postId");
        }
        post=dataStore.getPost(pID);
        toolbar.setTitle(post.username+"`s Post");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        int resIdL=(post.isLiked.equals("true"))?R.drawable.upvote_48:R.drawable.upvote_48_black;
        int resIdD= (post.isDisliked.equals("true"))?R.drawable.downvote_48:R.drawable.downvote_48_black;
        userId.setText(post.id);
        userPic.setImageResource(R.drawable.user_pic);
        nameDisplay.setText(post.username);
        contentText.setText(post.content);
        likeText.setText(post.LikeCount);
        unlikeText.setText(post.DisLikeCount);
        likeImg.setImageResource(resIdL);
        unlikeImg.setImageResource(resIdD);
        commentCount.setText(post.comment.size() + "");
        adapter=new CommentsAdapter(this,post.comment);
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
            case R.id.likeImg :
                if (post.isLiked.equals("false") && post.isDisliked.equals("false")) {
                    post.LikeCount = String.format("%s", Integer.parseInt(post.LikeCount)+1);
                    post.isLiked="true";
                    Log.e("liked ", " ");
                    likeText.setText(post.LikeCount);
                    likeImg.setImageResource(R.drawable.upvote_48);
                    /*InternetManager.getInstance(this).like(post.postid,report);
                    if(report.Status== App_Config.STATUS_OK){
                       likeText.setText(post.LikeCount);
                        likeImg.setImageResource(R.drawable.upvote_48);
                    }
                    else{
                        Snackbar.make(likeImg,"Cannot Perform Action !!",Snackbar.LENGTH_SHORT).show();
                    }
                    */


                }
                else if (post.isDisliked.equals("true")) {

                    //feed.likeCount = String.format("%s", Integer.parseInt(instance.mDataset.get(currentPosition).likeCount) + 1);
                    post.DisLikeCount = String.format("%s", Integer.parseInt(post.DisLikeCount) - 1);
                    //feed.isLiked="true";
                    post.isDisliked="false";
                    Log.e("nulled "," ");
                    unlikeText.setText(post.DisLikeCount);
                    unlikeImg.setImageResource(R.drawable.downvote_48_black);
                    /*InternetManager.getInstance(this).like(post.postid,report);
                    if(report.Status== App_Config.STATUS_OK){
                       unlikeText.setText(post.DisLikeCount);
                    unlikeImg.setImageResource(R.drawable.upvote_48_black);
                    }
                    else{
                        Snackbar.make(likeImg,"Cannot Perform Action !!",Snackbar.LENGTH_SHORT).show();
                    }
                    */

                } else {

                }


                break;
            //  case "unlikeBtn":
            case R.id.unlikeImg:
                if (post.isLiked.equals("false") && post.isDisliked.equals("false")) {

                    post.DisLikeCount = String.format("%s", Integer.parseInt(post.DisLikeCount)+1);
                    post.isDisliked="true";
                    Log.e("disliked ", " ");
                    unlikeText.setText(post.DisLikeCount);
                    unlikeImg.setImageResource(R.drawable.downvote_48);
                    /*InternetManager.getInstance(this).dislike(post.postid,report);
                    if(report.Status== App_Config.STATUS_OK){
                        unlikeText.setText(post.DisLikeCount);
                    unlikeImg.setImageResource(R.drawable.downvote_48);
                    }
                    else{
                        Snackbar.make(likeImg,"Cannot Perform Action !!",Snackbar.LENGTH_SHORT).show();
                    }
                    */

                } else if (post.isLiked.equals("true")) {

                    post.LikeCount = String.format("%s", Integer.parseInt(post.LikeCount) - 1);
                    post.isLiked="false";
                    Log.e("nulled ", " ");
                    likeText.setText(post.LikeCount);
                    likeImg.setImageResource(R.drawable.upvote_48_black);
                    /*InternetManager.getInstance(this).dislike(post.postid,report);
                    if(report.Status== App_Config.STATUS_OK){
                       likeText.setText(post.LikeCount);
                    likeImg.setImageResource(R.drawable.upvote_48_black);
                    }
                    else{
                        Snackbar.make(likeImg,"Cannot Perform Action !!",Snackbar.LENGTH_SHORT).show();
                    }
                    */


                } else {


                }

                break;

        }
}
}
