package com.collegare.com.collegare.SharedPreference;

/**
 * Created by Vishal on 03-10-2015.
 */
import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager
{
    private static final String KEY="isLoggedIn";
    private static final String PREF_NAME="collegare";
    private static final String TAG=SessionManager.class.getSimpleName();
    static SharedPreferences.Editor editor;
    static SharedPreferences preferences;
    int Mode=0;
    Context _context;

    public SessionManager(Context context)
    {
        this._context=context;
        preferences=context.getSharedPreferences(PREF_NAME,Mode);
        editor=preferences.edit();
    }

    public static void setLoginStatus(boolean state)
    {
        editor.putBoolean(KEY,state);
        editor.commit();
    }

    public static String getLastGroup(){
        return preferences.getString("gid","0");
    }

    public static void setLastGroup(String gid){
        editor.putString("gid", gid);
        editor.commit();
    }

    public static void setSendType(String type){
        editor.putString("sentType",type);
        editor.commit();
    }

    public static String getSendType(){
        return preferences.getString("sentType","0");
    }
    public static String getLastPostID(String GrpID){
        return preferences.getString("LPid"+GrpID,"0");
    }

    public static void setLastPostID(String lastPostID , String GrpID){
        editor.putString("LPid"+GrpID,lastPostID);
        editor.commit();
    }

    public static String getProPicPath(){
     return    preferences.getString("Propicpath","null");
    }

    public static void setProPicPath(String path){
        editor.putString("Propicpath",path);
        editor.commit();
    }

    public static String getPicPath(){
        return    preferences.getString("picpath","null");
    }

    public static void setPicPath(String path){
        editor.putString("picpath",path);
        editor.commit();
    }

    public boolean isLoggedIn()
    {
        return preferences.getBoolean(KEY,false);
    }

    public int getFeedSortType()
    {
        return preferences.getInt("sortType",0);
    }

    public void setFeedSortType(int t)
    {
        editor.putInt("sortType",t);
        editor.commit();
    }

    public static void setUserIdSequence(String seq){
        editor.putString("user_id_seq",seq);
        editor.commit();
    }

    public static String getUserIdSequence(){
        return preferences.getString("user_id_seq","");
    }

    public static void setTasksSequence(String sequence){
        editor.putString("task_seq",sequence);
        editor.commit();
    }

    public static String getTaskSequence(){
        return preferences.getString("task_seq","");
    }
}
