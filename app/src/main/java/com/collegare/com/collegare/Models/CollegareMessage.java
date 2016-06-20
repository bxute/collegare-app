package com.collegare.com.collegare.Models;

public class CollegareMessage
{
    public String msgid, content, username, doc, user_id;
    public String read,sent,type;
    public CollegareMessage(String msgid, String content, String username, String doc, String id,String read,String type , String sent )
    {
        this.msgid = msgid;
        this.content = content;
        this.username = username;
        this.doc = doc;
        this.user_id = id;
        this.read = read;
        this.sent = sent;
        this.type = type;
    }
}