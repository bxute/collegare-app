package com.collegare.com.collegare.Models;

/**
 * Created by Harry_RJ on 3/17/2016.
 */
public class Message {
    public int id;
    public int userID;
    public String time;
    public int count;
    public String msg,username;
    public Message(int msgid,int userID,String username,int count,String time,String msg){
        this.id=msgid;
        this.userID=userID;
        this.count=count;
        this.time=time;
        this.msg=msg;
        this.username=username;
    }
}
