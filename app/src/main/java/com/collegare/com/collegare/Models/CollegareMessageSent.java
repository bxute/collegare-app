package com.collegare.com.collegare.Models;

/**
 * Created by RadhePC on 17-11-2015.
 */
public class CollegareMessageSent
{
    public String rec, content, username, doc, id;
    public CollegareMessageSent( String content, String rec, String doc, String id)
    {
        this.rec = rec;
        this.content = content;
        this.doc = doc;
        this.id = id;
    }
}