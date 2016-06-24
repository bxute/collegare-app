package com.collegare.com.collegare.models;

import java.util.ArrayList;

public class CollegarePost
{
    public String postid, content, username, doc, groupid, id, weight, pollid,LikeCount,DisLikeCount;
    public String  isLiked;
    public String  isDisliked;
    public ArrayList<CollegareComment> comment;
    public CollegarePost(){comment=new ArrayList<>();}
    public CollegarePost(String postid, String content, String username, String doc, String groupid, String id, String weight, String pollid,String like,String dislike,String isLiked,String  isDisliked, ArrayList<CollegareComment> comment)
    {
        this.isDisliked=isDisliked;
        this.isLiked=isLiked;
        this.postid = postid;
        this.content = content;
        this.username = username;
        this.doc = doc;
        this.groupid = groupid;
        this.id = id;
        this.weight = weight;
        this.pollid = pollid;
        this.LikeCount=like;
        this.DisLikeCount=dislike;
        this.comment = comment;
    }
}