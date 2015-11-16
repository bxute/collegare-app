package com.collegare.com.collegare.Managers;

/**
 * Created by Vishal on 03-10-2015.
 */

public class App_Config{

    public static String Login_URL="http://collegare.eu5.org/login.php";
    public static String Post_URL="http://collegare.eu5.org/post.php";
    public static String Message_URL="http://collegare.eu5.org/message.php";
    public static String Vote_URL="http://collegare.eu5.org/vote.php";
    public static final int TYPE_ANONYMOUS=0;
    public static final int TYPE_GROUP=0;
    public static final String STATUS_OK="ok";
    public static final String STATUS_ERROR="error";


    //TABLES
    public static final String TABLE_POST="Posts";
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="userDb";
    public static final String TABLE_LOGIN = "LoginInfo";
    public static final String TABLE_COMMENTS = "Comments";
    public static final String TABLE_MESSAGES = "Messages";
    public static final String TABLE_GROUPS="Groups";
    public static final String TABLE_MEMBERS="Members";
    public static final String TABLE_ADMINS="Admins";
}
