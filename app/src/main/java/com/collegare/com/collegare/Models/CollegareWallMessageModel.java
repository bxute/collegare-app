package com.collegare.com.collegare.Models;

/**
 * Created by Ankit on 6/18/2016.
 */
public class CollegareWallMessageModel {

    public String userID;
    public String user_name;
    public int unread_count;
    public String message;
    public String time;

    public CollegareWallMessageModel(String userID,String user_name, int unread_count, String message, String time){
        this.userID = userID;
        this.user_name = user_name;
        this.unread_count = unread_count;
        this.message = message;
        this.time = time;
    }

}
