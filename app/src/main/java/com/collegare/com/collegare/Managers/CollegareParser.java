package com.collegare.com.collegare.Managers;

import com.collegare.com.collegare.Models.CollegareComment;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.CollegareMessage;
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
    void parseFeed(String response, ArrayList<CollegareFeed> feedList,Report report) {
        feedList = null;
        try {
            JSONObject feedObj = new JSONObject(response);

            if (feedObj.getInt("status") != 0)
            {
                report.Description="something is wrong!";
                report.Status=App_Config.STATUS_ERROR;
            }
            feedList = new ArrayList<>();
            JSONArray posts = feedObj.getJSONArray("posts");
            for (int i = 0; i < posts.length(); i++) {
                JSONObject post = (JSONObject) posts.get(i);
                feedList.add(
                        new CollegareFeed(
                                post.getString("postid"),
                                post.getString("content"),
                                post.getString("username"),
                                post.getString("doc"),
                                post.getString("groupid"),
                                post.getString("id"),
                                post.getString("weight"),
                                post.getString("pollid"),
                                post.getString("commentcount"),
                                post.getString("likecount"),
                                post.getString("dislikecount"),
                                post.getString("isliked"),
                                post.getString("isdisliked")
                        )
                );
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

    void parseMessage(String response, ArrayList<CollegareMessage> messages,Report report)
    {
        messages = null;

        try {
            JSONObject msgObj = new JSONObject(response);

            if (msgObj.getInt("status") != 0){
                report.Description="something goes wrong";
                report.Status=App_Config.STATUS_ERROR;
                return;
            }
            JSONArray msgArray = msgObj.getJSONArray("messages");
            for (int i = 0; i < msgArray.length(); i++) {
                JSONObject temp = (JSONObject) msgArray.get(i);
                messages.add(
                        new CollegareMessage(
                                temp.getString("msgid"),
                                temp.getString("content"),
                                temp.getString("username"),
                                temp.getString("doc"),
                                temp.getString("id")
                        )
                );
            }
            report.Description="all ok";
            report.Status=App_Config.STATUS_OK;
            return;
        } catch (JSONException e) {
            e.printStackTrace();
            report.Description="error while parsing";
            report.Status=App_Config.STATUS_ERROR;
        }
        return;
    }

    public void parsePicFullURL(Report report1)
    {
    }

    public void parsePicURL(Report report1)
    {
    }

    public void parseUserInfos(String response, CollegareUser user, Report report1)
    {
    }
}