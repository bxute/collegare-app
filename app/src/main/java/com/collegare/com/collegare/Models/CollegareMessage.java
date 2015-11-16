package com.collegare.com.collegare.Models;

public class CollegareMessage
{
    public String msgid, content, username, doc, id;
    public CollegareMessage(String msgid, String content, String username, String doc, String id)
    {
        this.msgid = msgid;
        this.content = content;
        this.username = username;
        this.doc = doc;
        this.id = id;
    }
}