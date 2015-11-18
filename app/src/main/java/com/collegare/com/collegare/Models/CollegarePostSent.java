package com.collegare.com.collegare.Models;

/**
 * Created by RadhePC on 17-11-2015.
 */
public class CollegarePostSent {
    String content,id,doc,gid,username,likes,dislikes,comments;

    public CollegarePostSent(String content,String id,String doc,
                             String gid,String username,String likes,
                             String dislikes,String comments){
        this.content=content;
        this.id=id;
        this.doc=doc;
        this.gid=gid;
        this.username=username;
        this.likes=likes;
        this.dislikes=dislikes;
        this.comments=comments;

    }

}
