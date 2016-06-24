package com.collegare.com.collegare.models;

import java.util.ArrayList;

public class CollegareUser
{
    public String firstname, lastname, username, id, email, sex, dob,token;
    public ArrayList<CollegareGroup> groups;
    public CollegareUser(String firstname, String lastname, String username, String id, String email, String sex, ArrayList<CollegareGroup> groups, String dob,String token)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.id = id;
        this.email = email;
        this.sex = sex;
        this.groups = groups;
        this.dob = dob;
        this.token=token;
    }
}