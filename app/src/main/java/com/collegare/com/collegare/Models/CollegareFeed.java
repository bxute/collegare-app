package com.collegare.com.collegare.Models;

public class CollegareFeed
{
    public String postid, content, username, doc, groupid, id, weight, pollid,CommentCount,likeCount,dislikeCount;
    public String isLiked;
    public String isDisliked;

    public CollegareFeed(){}
    public CollegareFeed(String postid, String content, String username, String doc, String groupid, String id, String weight, String pollid,String CommentCount,String like,String dislike,String isLiked,String isDisliked)
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
        this.CommentCount=CommentCount;
        this.likeCount=like;
        this.dislikeCount=dislike;
    }
}
