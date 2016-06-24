package com.collegare.com.collegare.models;

public class CollegareMessage
{
    public String msgid, content, sender_name , doc, sender_id , receiver_name, receiver_id;
    public String read,sent,type;
    public CollegareMessage(String msgid, String content, String sender_name, String doc, String sender_id,String receiver_id, String receiver_name,String read,String type , String sent )
    {
        this.msgid = msgid;
        this.content = content;
        this.sender_name = sender_name;
        this.doc = doc;
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.receiver_name = receiver_name;
        this.read = read;
        this.sent = sent;
        this.type = type;
    }
}