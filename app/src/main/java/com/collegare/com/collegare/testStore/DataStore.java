package com.collegare.com.collegare.testStore;

import android.content.Context;
import android.util.Log;

import com.collegare.com.collegare.adapters.PostDataAdapter;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.models.CollegareAdmin;
import com.collegare.com.collegare.models.CollegareComment;
import com.collegare.com.collegare.models.CollegareFeed;
import com.collegare.com.collegare.models.CollegareGroup;
import com.collegare.com.collegare.models.CollegareGroupMember;
import com.collegare.com.collegare.models.CollegareMessage;
import com.collegare.com.collegare.models.CollegareUser;
import com.collegare.com.collegare.models.Report;
import com.collegare.com.collegare.network.InternetManager;

import java.util.ArrayList;

/**
 * Created by ankit on 03-10-2015.
 */
public class DataStore {

    int dataFor;

    public DataStore(int dataFor) {
        this.dataFor = dataFor;
    }

    // this is the place where async call will be done for remote data
    // for fast loading of data this should be instansiated at the app begening or in the splash even
/*
    public ArrayList<CollegarePost> getData() {
        ArrayList<CollegarePost> list = new ArrayList<>();
        ArrayList<CollegareComment> comments = new ArrayList<>();
//String postid, String content, String username,
// String doc, String groupid, String id,
// String weight, String pollid, ArrayList<CollegareComment> comment
        list.add(0, new CollegarePost("1", "hello anit", "ankit", "sdfd:dsfdf", "2", "23323", "12", "121", comments));
        return list;

    }*/

    Context context;

    DataStore() {
    }

    public DataStore(Context context) {
        this.context = context;
    }

    /*
    *
    *       getting public feed                     [STATUS :  OK][1]
    * */

    public void testDB(){
        //firstname, lastname, username, id, email, sex, groups, dob,token;
        //String postid, content, username, doc, groupid, id, weight, pollid,CommentCount,likeCount,dislikeCount;

       // feeds.add(new CollegareFeed("1","hello ankit","xute","2014-12-03 12:14:45","none","201451065","12","1","1","1","2"));
      //  DatabaseManager.getInstance(context).appendFeed(feeds);
      /*  ArrayList<CollegareMessage> msgs= new ArrayList<>();
        ArrayList<CollegareComment> comments= new ArrayList<>();
        feeds.add(new CollegareFeed("1","hello ankit","xute","1212121212","none","201451065","12","1","1","1","2"));
         msgs.add(new CollegareMessage("1", "hello ankit", "xute", "21121212", "201451065"));
       comments.add(new CollegareComment("1", "12", "201451065", "xute", "fake", "201291289"));*/
        //Log.e("get user {", DatabaseManager.getInstance(context).getUser().get("FIRSTNAME") + "}");
       // Log.e("get post {", DatabaseManager.getInstance(context).getPost("1") + "}");
        //Log.e("get posts {", DatabaseManager.getInstance(context).getPosts().get(0) + "}");
       // Log.e("get comments {", DatabaseManager.getInstance(context).getComments("1").get(0).content + "}");
        //Log.e("get message {", DatabaseManager.getInstance(context).getMessages().get(0).content + "}");

      //  DatabaseManager.getInstance(context).addUser(new CollegareUser("ankit", "kumar", "xute", "201451061", "ankit@collegare.com", "m", "none", "12121994", "asdfkjhjdshfkjhdf"));
        /*DatabaseManager.getInstance(context).appendFeed(feeds);
        DatabaseManager.getInstance(context).appendComments(comments);
        DatabaseManager.getInstance(context).appendMessage(msgs);*/

        ArrayList<CollegareFeed> feeds= new ArrayList<>();
        ArrayList<CollegareMessage> msgs= new ArrayList<>();
        ArrayList<CollegareComment> cmnts= new ArrayList<>();
        ArrayList<CollegareGroup> groups= new ArrayList<>();
        ArrayList<CollegareGroupMember> members= new ArrayList<>();
        ArrayList<CollegareAdmin> admins= new ArrayList<>();
       // String msgid, String content, String username, String doc, String id
//        msgs.add(new CollegareMessage("232", "hello ankit \n fine this", "Rahul", "2014-12-03 12:13:45", "201451062"));
//        msgs.add(new CollegareMessage("821", "how are you ????", "Raju Kaushik", "2014-12-03 12:11:45", "201451061"));
//        msgs.add(new CollegareMessage("3281", "im fine !!!", "xute", "2014-12-03 12:09:45", "201451065"));
//        msgs.add(new CollegareMessage("1282", "and you \n hi dear how ", "Radhe", "2014-12-03 12:07:45", "201451069"));
//String postid, String content, String username, String doc, String groupid, String id, String weight, String pollid,String CommentCount,String like,String dislike,String isLiked,String isDisliked,ArrayList<CollegarePollOption> pollOptions,String pollOptionSelected
        feeds.add(new CollegareFeed("2","hello ankit","xute","2015-12-11 12:13:23","1","201451065","12","null","1","1","4","false","true",null,""));
//
//        cmnts.add(new CollegareComment("1","1","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//        cmnts.add(new CollegareComment("1","2","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//        cmnts.add(new CollegareComment("2","3","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//        cmnts.add(new CollegareComment("2","4","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//        cmnts.add(new CollegareComment("3","5","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//        cmnts.add(new CollegareComment("4","6","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//        cmnts.add(new CollegareComment("3","7","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//        cmnts.add(new CollegareComment("2","8","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//        cmnts.add(new CollegareComment("4","9","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//        cmnts.add(new CollegareComment("1","10","201451065","ankit","not this is fake","2014-12-03 10:12:45"));
//
//        members.add(new CollegareGroupMember("2","201451065","Ankit"));
//        members.add(new CollegareGroupMember("2","201452065","Xute"));


        admins.add(new CollegareAdmin("2","201451065","Ankit"));
        admins.add(new CollegareAdmin("2","201452065","Xute"));

        groups.add(new CollegareGroup("2","Fun Grp","1212-12-12 12:12:12",admins,members));

        DatabaseManager.getInstance(context).appendFeed(feeds);
        //DatabaseManager.getInstance(context).addUser(new CollegareUser("ankit", "kumar", "xute", "201451065", "ankit@collegare.com", "m",groups , "12121994", "asdfkjhjdshfkjhdf"));
       // DatabaseManager.getInstance(context).appendComments(cmnts);
        for(int i = 0;i<msgs.size();i++){
            DatabaseManager.getInstance(context).appendMessage(msgs.get(i));
        }


    }


   public ArrayList<CollegareFeed> getFeeds(String gid) {
       ArrayList<CollegareFeed> feeds=new ArrayList<>();

            if(!InternetManager.getInstance(context).isConnectedToNet()){
                feeds = DatabaseManager.getInstance(context).getPosts(gid);
                Log.e("DS",""+feeds.size());
                PostDataAdapter.getInstance(context).setPostDataList(feeds);
            }

            return feeds;
    }

    /*
    *
    *
    * */
    /*
    *
    *       getting messages                        [STATUS : OK] [1]
    * */
   public ArrayList<CollegareMessage> getMessages(){
        ArrayList<CollegareMessage> messages=new ArrayList<>();

        // first trying to get messages from server
       // InternetManager.getInstance(context).getMessage(messages,report1);
       if(!InternetManager.getInstance(context).isConnectedToNet()){
           messages=DatabaseManager.getInstance(context).getMessages();

       }
               return messages;
    }

    /*
    *
    *       sending messages
    * */

    public void submitMessage(String rec,String msg,Report report){

        // trying to send message

        InternetManager.getInstance(context).sendMessage(rec, msg);

    }

    /*
    *
    *       sending post
    * */


    public ArrayList<CollegareFeed> getFeedsFromAdmins(Report rp) {
        /*public String postid, content, username, doc, groupid, id, weight, pollid,CommentCount,likeCount,dislikeCount;
    public String isLiked;
    public String isDisliked;
        * */
        ArrayList<CollegareFeed> adminFeeds= new ArrayList<>();


        return  adminFeeds;
    }

    public CollegareUser getUser(){

       return DatabaseManager.getInstance(context).getUser();

    }




}
