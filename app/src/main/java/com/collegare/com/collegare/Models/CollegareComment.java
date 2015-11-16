package com.collegare.com.collegare.Models;

public class CollegareComment
{
    public String commentid, id;
    public String username, content, doc,PostId,Count;

    public CollegareComment(){}
    public CollegareComment(String PostId,String commentid, String id, String username, String content, String doc)
    {
        this.commentid = commentid;
        this.id = id;
        this.username = username;
        this.content = content;
        this.PostId=PostId;
        this.doc = doc;
    }
}