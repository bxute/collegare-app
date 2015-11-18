package com.collegare.com.collegare.Managers;

import android.content.Context;
import android.util.Log;

import com.collegare.com.collegare.Models.CollegareAdmin;
import com.collegare.com.collegare.Models.CollegareComment;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.CollegareGroup;
import com.collegare.com.collegare.Models.CollegareMessage;
import com.collegare.com.collegare.Models.CollegareMessageSent;
import com.collegare.com.collegare.Models.CollegarePost;
import com.collegare.com.collegare.Models.CollegareUser;
import com.collegare.com.collegare.Models.Report;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CollegareParser {

    /*
    *          parse feed i.e complete posts     do not confuse this with posts     [STATUS: OK][1]
    *
    * */
    public static CollegareParser bInstance;
    private Context context;

    public CollegareParser(Context context){
        this.context=context;
        bInstance=this;
    }

    public static CollegareParser getInstance(Context context){
        if(bInstance ==null){
            bInstance= new CollegareParser(context);
        }
        return bInstance;
    }








    void parseFeed(String response) {

        try {
            JSONObject feedObj = new JSONObject(response);

            if (feedObj.getInt("status") != 0)
            {
                return;
            }
            else {
                CollegareFeed feed =null;
                JSONArray posts = feedObj.getJSONArray("posts");
                for (int i = 0; i < posts.length(); i++) {
                    JSONObject post = (JSONObject) posts.get(i);
                    feed =new CollegareFeed(
                                    post.getString("postid"),
                                    post.getString("content"),
                                    post.getString("username"),
                                    post.getString("doc"),
                                    post.getString("groupid"),
                                    post.getString("id"),
                                    post.getString("weight"),
                                    post.getString("pollid"),
                                    post.getString("commentcount"),
                                    post.getString("upcount"),
                                    post.getString("downcount"),
                                    "true",
                                    "false"
                            );
                    postDataAdapter.getInstance(context).addToPostDataList(feed);
                }

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    /*
    *
    *           parse data for a single post with its commets ,,,    used for displaying in indivisual post page        [STATUS: OK][1]
    * */
    void parseIndividualPost(String response, CollegarePost currentPost,Report report) {
        currentPost = null;
        try {
            JSONObject postObj = new JSONObject(response);

            if (postObj.getInt("status") != 0){
                report.Description="something is received wrong";
                report.Status=App_Config.STATUS_ERROR;
                return;
            }
            ArrayList<CollegareComment> comments = new ArrayList<>();
            JSONArray comment = postObj.getJSONArray("comments");
            for (int i = 0; i < comment.length(); i++) {
                JSONObject temp = (JSONObject) comment.get(i);
                comments.add(new CollegareComment(
                                temp.getString("postid"),
                                temp.getString("commentid"),
                                temp.getString("id"),
                                temp.getString("username"),
                                temp.getString("content"),
                                temp.getString("doc")
                        )
                );
            }
            currentPost = new CollegarePost(
                    postObj.getString("postid"),
                    postObj.getString("content"),
                    postObj.getString("username"),
                    postObj.getString("doc"),
                    postObj.getString("groupid"),
                    postObj.getString("id"),
                    postObj.getString("weight"),
                    postObj.getString("pollid"),
                    postObj.getString("like"),
                    postObj.getString("dislike"),
                    postObj.getString("isliked"),
                    postObj.getString("isdisliked"),
                    comments);

            report.Description="all is fine";
            report.Status=App_Config.STATUS_OK;
            return;


        } catch (JSONException e) {
            e.printStackTrace();
            report.Description="parsing error";
            report.Status=App_Config.STATUS_ERROR;
            return;
        }
    }

    /*
    *
    *           parse messages          [STATUS: OK][1]
    * */

    void parseMessage(String response)
    {
       CollegareMessage message = null;

        try {
            JSONObject msgObj = new JSONObject(response);

            if (msgObj.getInt("status") != 0){
                return;
            }
            JSONArray msgArray = msgObj.getJSONArray("messages");
            for (int i = 0; i < msgArray.length(); i++) {
                JSONObject temp = (JSONObject) msgArray.get(i);
                message= new CollegareMessage(
                                temp.getString("msgid"),
                                temp.getString("content"),
                                temp.getString("username"),
                                temp.getString("doc"),
                                temp.getString("id")
                        );
               MessageAdapter.getInstance(context).addMessageToList(message);
               DatabaseManager.getInstance(context).appendMessage(message);
            }

            return;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return;
    }

    public void parseSentMessage(String response,CollegareMessageSent msg){

        CollegareMessage ms=new CollegareMessage("1",msg.content,msg.username,msg.doc,msg.id);

        try {
            JSONObject obj= new JSONObject(response);
            if(obj.getInt("status")==0){
                MessageAdapter.getInstance(context).addMessageToList(ms);
                DatabaseManager.getInstance(context).appendMessage(ms);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void parsePicFullURL(Report report1)
    {
    }

    public void parsePicURL(Report report1)
    {
    }
//(String firstname, String lastname, String username, String id, String email, String sex,
// ArrayList<CollegareGroup> groups, String dob,String token)

    public CollegareUser parseUserInfos(String response,String token) {
        Log.e("request in for parsenU","");
        CollegareUser user=null;
        ArrayList<CollegareGroup> groups= new ArrayList<>();
        try {
            JSONObject userObj= new JSONObject(response);
            Log.e("parsing res:",""+response);
            Log.e("fname",(userObj.getString("firstname")));
            user=new CollegareUser(userObj.getString("firstname"),userObj.getString("lastname"),userObj.getString("username"),
                    userObj.getString("id"),userObj.getString("email"),userObj.getString("sex"),groups,userObj.getString("dob"),token);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return user;
    }
}