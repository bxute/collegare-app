package com.collegare.com.collegare.Models;

import java.util.ArrayList;

/**
 * Created by RadhePC on 15-11-2015.
 */
public class CollegareGroup {
    public String GroupID,Title,CreationDate;
   public ArrayList<CollegareAdmin> admins;
    public  ArrayList<CollegareGroupMember> memebers;


    public CollegareGroup(String GroupID,String title,String doc,ArrayList<CollegareAdmin> admins,ArrayList<CollegareGroupMember> memebers){
        this.GroupID=GroupID;
        this.Title=title;
        this.CreationDate=doc;
        this.admins=admins;
        this.memebers=memebers;
    }
}
