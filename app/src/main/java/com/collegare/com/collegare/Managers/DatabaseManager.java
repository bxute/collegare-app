package com.collegare.com.collegare.Managers;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.collegare.com.collegare.Models.*;
import com.collegare.com.collegare.Models.CollegareComment;
import com.collegare.com.collegare.Models.CollegareFeed;
import com.collegare.com.collegare.Models.CollegareMessage;
import com.collegare.com.collegare.Models.CollegarePost;
import com.collegare.com.collegare.Models.CollegareUser;

import java.util.ArrayList;
import java.util.HashMap;

public class DatabaseManager extends SQLiteOpenHelper {
    private static DatabaseManager instance;
    String TAG;

    /*
    *
    *           must doie operations
    *
    * */

    public DatabaseManager(Context context) {
        super(context, App_Config.DATABASE_NAME, null, App_Config.DATABASE_VERSION);
        TAG = "DM";
    }

    public static DatabaseManager getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseManager(context);
        }
        return instance;
    }

    public void IntiateDataBase(){
        SQLiteDatabase db= getWritableDatabase();
        rolldown_Tables(db);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        rolldown_Tables(db);
    }

    public void dropTable(SQLiteDatabase db, String tableName) {
        db.execSQL("DROP TABLE IF EXISTS " + tableName + ";");
        Log.e("table " + tableName, "droped");
    }

    public void rolldown_Tables(SQLiteDatabase db){
        try {
            db.execSQL(
                    "CREATE TABLE IF NOT EXISTS LoginInfo (" +
                            "FIRSTNAME TEXT, " +
                            "LASTNAME TEXT, " +
                            "USERNAME TEXT, " +
                            "ID INTEGER PRIMARY KEY, " +
                            "EMAIL TEXT, " +
                            "SEX TEXT, " +
                            "DOB TEXT , " +
                            "TOKEN TEXT" +
                            ");"
            );
            Log.e(TAG, "LoginInfo table created!");
            db.execSQL("CREATE TABLE IF NOT EXISTS Groups (" +
                            "GROUPID INTEGER PRIMARY KEY ," +
                            "TITLE TEXT ," +
                            "DOC TEXT ," +
                            "ID TEXT );"
            );
            Log.e("Groups table created !", "");

            db.execSQL("CREATE TABLE IF NOT EXISTS Members (" +
                            "GROUPID TEXT ," +
                            "NAME TEXT ," +
                            "ID TEXT );"
            );
            Log.e("Members table created !", "");

            db.execSQL("CREATE TABLE IF NOT EXISTS Admins (" +
                            "GROUPID TEXT ," +
                            "NAME TEXT ," +
                            "ID TEXT );"
            );
            Log.e("Admins table created !", "");

            db.execSQL(
                    "CREATE TABLE IF NOT EXISTS Posts (" +
                            "POSTID INTEGER PRIMARY KEY, " +
                            "CONTENT TEXT, " +
                            "USERNAME TEXT, " +
                            "DOC TEXT, " +
                            "GROUPID TEXT, " +
                            "ID TEXT, " +
                            "WEIGHT TEXT, " +
                            "POLLID TEXT, " +
                            "CommentCount TEXT, " +
                            " DisLikeCount TEXT," +
                            " LikeCount TEXT, " +
                            "LIKED TEXT, " +
                            "DISLIKED TEXT  " +
                            ");"
            );
            Log.e(TAG, "Posts table created!");
            db.execSQL(
                    "CREATE TABLE IF NOT EXISTS Comments (" +
                            "COMMENTID INTEGER PRIMARY KEY, " +
                            "POSTID TEXT , " +
                            "ID TEXT , " +
                            "USERNAME TEXT , " +
                            "CONTENT TEXT , " +
                            "DOC TEXT " +
                            ");"
            );
            Log.e(TAG, "Comments table created!");
            db.execSQL(
                    //msgid, content, username, doc, id;
                    "CREATE TABLE IF NOT EXISTS Messages (" +
                            "MESSAGEID INTEGER PRIMARY KEY, " +
                            "CONTENT TEXT, " +
                            "USERNAME TEXT, " +
                            "DOC TEXT, " +
                            "ID TEXT" +
                            ");"
            );
            Log.e(TAG, "Messages table created!");
        } catch (Exception e) {
            Log.e("[TABLE CREATION ERROR]", e.toString());
        }
    }

    public void rollback_Database(){
        SQLiteDatabase db= getWritableDatabase();
        //dropTable(db,"LoginInfo");
        db.execSQL("DELETE FROM LoginInfo;");
        Log.e("DM", "deleted all cols: LoginInfo");
        db.execSQL("DELETE FROM Members;");
        Log.e("DM", "deleted all cols: Members");
        db.execSQL("DELETE FROM Admins;");
        Log.e("DM", "deleted all cols: Admins");
        db.execSQL("DELETE FROM Posts;");
        Log.e("DM", "deleted all cols: Posts");
        db.execSQL("DELETE FROM Comments;");
        Log.e("DM", "deleted all cols: Comments");
        db.execSQL("DELETE FROM Messages;");
        Log.e("DM", "deleted all cols: Messages");
        db.execSQL("DELETE FROM Groups;");
        Log.e("DM", "deleted all cols: Groups");
        Log.e("DM","Successfully deleted all tables datas !!!");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        dropTable(db, App_Config.TABLE_POST);
        dropTable(db, App_Config.TABLE_MESSAGES);
        dropTable(db, App_Config.TABLE_LOGIN);
        dropTable(db, App_Config.TABLE_COMMENTS);
        dropTable(db, App_Config.TABLE_GROUPS);
        onCreate(db);
        Log.e("database up graded", "");
    }
    /*
    *
    *
    *       Part for user info          [READ/WRITE]    OPERATION
    *
    *
    */

    public void addUser(CollegareUser user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        ContentValues members= new ContentValues();
        ContentValues admins= new ContentValues();

        values.put("FIRSTNAME", user.firstname);
        values.put("LASTNAME", user.lastname);
        values.put("USERNAME", user.username);
        values.put("ID", user.id);
        values.put("EMAIL", user.email);
        values.put("SEX", user.sex);
        values.put("DOB", user.dob);
        values.put("TOKEN", user.token);
        long ins = db.insert("LoginInfo", null, values);
    Log.e("lll inserted ","user >"+ins);
        int size = user.groups.size();
        int j = 0;
        for (int i = 0; i < size; i++) {
            values.clear();
            values.put("GROUPID", user.groups.get(i).GroupID);
            values.put("TITLE", user.groups.get(i).Title);
            values.put("DOC", user.groups.get(i).CreationDate);
            values.put("ID", user.id);
            if (db.insert(App_Config.TABLE_GROUPS, null, values) != -1) {
                j++;
            }

            int k=0;
            ArrayList<CollegareAdmin> admins1= user.groups.get(i).admins;
            for(k=0;k<admins1.size();k++){
                admins.put("GROUPID", admins1.get(k).GroupId);
                admins.put("ID", admins1.get(k).id);
                admins.put("NAME", admins1.get(k).Name);
                ins=db.insert(App_Config.TABLE_ADMINS,null,admins);
                Log.e(" inseted admin"," "+ins);

            }
            ArrayList<CollegareGroupMember> mem= user.groups.get(i).memebers;
            for(k=0;k<mem.size();k++){
                admins.put("GROUPID", mem.get(k).GroupId);
                admins.put("ID", mem.get(k).id);
                admins.put("NAME", mem.get(k).Name);
                ins=db.insert(App_Config.TABLE_MEMBERS,null,admins);
                Log.e(" inseted member "," "+ins);

            }




        }


    }

    // for profile activity ,, when the user is offline data is pulled out form database
    public CollegareUser getUser() {
        SQLiteDatabase db = this.getReadableDatabase();
        CollegareUser user = null;
        String qString = "SELECT * FROM " + App_Config.TABLE_LOGIN;
        Cursor cursor = db.rawQuery(qString, null);

        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            user=new CollegareUser(cursor.getString(cursor.getColumnIndex("FIRSTNAME")),
                    cursor.getString(cursor.getColumnIndex("LASTNAME")),
                    cursor.getString(cursor.getColumnIndex("USERNAME")),
                    cursor.getString(cursor.getColumnIndex("ID")),
                    cursor.getString(cursor.getColumnIndex("EMAIL")),
                    cursor.getString(cursor.getColumnIndex("SEX")),
                    getGroups(cursor.getString(cursor.getColumnIndex("ID"))),
                    cursor.getString(cursor.getColumnIndex("DOB")),
                    cursor.getString(cursor.getColumnIndex("TOKEN"))
            );
        }
        Log.e("lll Retrieved ", cursor.getCount() + " User");
        return user;
    }

    public ArrayList<CollegareAdmin> getAdmins(String grpId) {
      //  Log.e("call for grp id "," "+grpId+" admin");
        SQLiteDatabase db = getReadableDatabase();
        boolean hasNext = true;
        ArrayList<CollegareAdmin> admins = new ArrayList<>();

        Cursor cursor = db.query(App_Config.TABLE_ADMINS, new String[]{"GROUPID", "ID", "NAME"}, "GROUPID = ?", new String[]{grpId}, null, null, null);
        cursor.moveToFirst();
        while (hasNext && cursor.getCount() > 0) {
            admins.add(new CollegareAdmin(cursor.getString(cursor.getColumnIndex("GROUPID")),
                    cursor.getString(cursor.getColumnIndex("ID")),
                    cursor.getString(cursor.getColumnIndex("NAME"))));
            hasNext=cursor.moveToNext();
        }
        Log.e("retrieved ", " " + admins.size() + " admins");
        return admins;
    }

    public ArrayList<CollegareGroupMember> getMembers(String grpId) {
      //  Log.e("call for grp id "," "+grpId+" members");
        SQLiteDatabase db = getReadableDatabase();
        boolean hasNext = true;
        ArrayList<CollegareGroupMember> members = new ArrayList<>();

        Cursor cursor = db.query(App_Config.TABLE_MEMBERS, new String[]{"GROUPID", "ID", "NAME"}, "GROUPID = ?", new String[]{grpId}, null, null, null);
        cursor.moveToFirst();
        while (hasNext && cursor.getCount() > 0) {
            members.add(new CollegareGroupMember(cursor.getString(cursor.getColumnIndex("GROUPID")),
                    cursor.getString(cursor.getColumnIndex("ID")),
                    cursor.getString(cursor.getColumnIndex("NAME"))));
            hasNext=cursor.moveToNext();
        }
        Log.e("retrieved ", " " + members.size() + " members");
        return members;
    }

    public ArrayList<CollegareGroup> getGroups(String Id) {
        Log.e("call for groups "," id>"+Id);
        SQLiteDatabase db = getReadableDatabase();
        boolean hasNext = true;
        ArrayList<CollegareGroup> members = new ArrayList<>();

        Cursor cursor = db.query(App_Config.TABLE_GROUPS, new String[]{"GROUPID", "ID", "TITLE","DOC"},
                "ID = ?", new String[]{Id}, null, null, null);
        //Log.e(" size "," "+cursor.getCount());
        cursor.moveToFirst();
        while (hasNext && cursor.getCount() > 0) {
         //   Log.e(" grp id "," "+cursor.getString(1));
            members.add(new CollegareGroup(cursor.getString(cursor.getColumnIndex("GROUPID")),
                            cursor.getString(cursor.getColumnIndex("TITLE")),
                            cursor.getString(cursor.getColumnIndex("ID")),
                            getAdmins(cursor.getString(cursor.getColumnIndex("GROUPID"))),
                            getMembers(cursor.getString(cursor.getColumnIndex("GROUPID"))))
            );
            hasNext=cursor.moveToNext();
        }
        Log.e("retrieved ", " " + members.size() + " groups");
        return members;
    }



    /*
    *
    *
    *           Part for Posts   [R/W]
    *
    *
    *
    */


    // appending the collegare post i.e. public posts
    public void appendFeed(ArrayList<CollegareFeed> feeds) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        long id = 0;
        for (int i = 0; i < feeds.size(); i++) {

            /*
            * "POSTID INTEGER UNIQUE, " +
                            "CONTENT TEXT, " +
                            "USERNAME TEXT, " +
                            "DOC TEXT, " +
                            "GROUPID TEXT, " +
                            "ID TEXT, " +
                            "WEIGHT TEXT, " +
                            "POLLID TEXT, " +
                            "CommentCount TEXT, " +
                            " DisLikeCount ," +
                            " LikeCount " +*/
            values.put("POSTID", feeds.get(i).postid);
            values.put("CONTENT", feeds.get(i).content);
            values.put("USERNAME", feeds.get(i).username);
            values.put("DOC", feeds.get(i).doc);
            values.put("GROUPID", feeds.get(i).groupid);
            values.put("ID", feeds.get(i).id);
            values.put("WEIGHT", feeds.get(i).weight);
            values.put("POLLID", feeds.get(i).pollid);
            values.put("CommentCount", feeds.get(i).CommentCount);
            values.put("DisLikeCount", feeds.get(i).likeCount);
            values.put("LikeCount", feeds.get(i).dislikeCount);
            values.put("LIKED", feeds.get(i).isLiked);
            values.put("DISLIKED", feeds.get(i).isDisliked);
            if (db.insert(App_Config.TABLE_POST, null, values) != -1) {
                id++;
            }
        }


        db.close();
        Log.e("lll Added ", id + " Feeds");

    }

    // getting a single complete post with comments
    public CollegarePost getPost(String PostId) {
        SQLiteDatabase db = getReadableDatabase();
        CollegarePost feed = null;

        Cursor cursor = db.query("Posts", new String[]{"POSTID", "CONTENT", "USERNAME",
                        "DOC", "GROUPID", "ID", "WEIGHT", "POLLID", "LikeCount",
                        "DisLikeCount", "DISLIKED", "LIKED"}, "POSTID=?",
                new String[]{PostId}, null, null, null);


        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            feed = new CollegarePost(
                    cursor.getString(cursor.getColumnIndex("POSTID")),
                    cursor.getString(cursor.getColumnIndex("CONTENT")),
                    cursor.getString(cursor.getColumnIndex("USERNAME")),
                    cursor.getString(cursor.getColumnIndex("DOC")),
                    cursor.getString(cursor.getColumnIndex("GROUPID")),
                    cursor.getString(cursor.getColumnIndex("ID")),
                    cursor.getString(cursor.getColumnIndex("WEIGHT")),
                    cursor.getString(cursor.getColumnIndex("POLLID")),
                    cursor.getString(cursor.getColumnIndex("LikeCount")),
                    cursor.getString(cursor.getColumnIndex("DisLikeCount")),
                    cursor.getString(cursor.getColumnIndex("LIKED")),
                    cursor.getString(cursor.getColumnIndex("DISLIKED")),
                    getComments(PostId));

        }
        Log.e("Retrieved ", cursor.getCount() + " Post");
        return feed;
    }

    public ArrayList<CollegareFeed> getPosts(String gid) {
        boolean hasMore = true;
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<CollegareFeed> posts = new ArrayList<>();
        //ArrayList<CollegareComment> comments = new ArrayList<>();
        Cursor cursor = db.query(App_Config.TABLE_POST, new String[]{"POSTID", "CONTENT", "USERNAME", "DOC", "GROUPID",
                        "ID", "WEIGHT", "POLLID", "CommentCount", "LikeCount", "DisLikeCount", "LIKED", "DISLIKED"},
                "GROUPID = ? ", new String[]{gid}, null, null, null);
        cursor.moveToFirst();
        while (hasMore && cursor.getCount() > 0) {
            posts.add(new CollegareFeed(cursor.getString(cursor.getColumnIndex("POSTID")),
                    cursor.getString(cursor.getColumnIndex("CONTENT")),
                    cursor.getString(cursor.getColumnIndex("USERNAME")),
                    cursor.getString(cursor.getColumnIndex("DOC")),
                    cursor.getString(cursor.getColumnIndex("GROUPID")),
                    cursor.getString(cursor.getColumnIndex("ID")),
                    cursor.getString(cursor.getColumnIndex("WEIGHT")),
                    cursor.getString(cursor.getColumnIndex("POLLID")),
                    cursor.getString(cursor.getColumnIndex("CommentCount")),
                    cursor.getString(cursor.getColumnIndex("LikeCount")),
                    cursor.getString(cursor.getColumnIndex("DisLikeCount")),
                    cursor.getString(cursor.getColumnIndex("LIKED")),
                    cursor.getString(cursor.getColumnIndex("DISLIKED"))

            ));
            hasMore = cursor.moveToNext();
        }
        Log.e("lll Retrieved ", posts.size() + " Posts");
        return posts;
    }

    /*
    *
    *
    *           COMMENTS [R/W] OPERATION
    *
    *
    * */

    ArrayList<CollegareComment> getComments(String PostID) {
        Log.e("for post id", " " + PostID);
        boolean hasMore = true;
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<CollegareComment> comments = new ArrayList<>();
        String[] cols = {"COMMENTID", "POSTID", "ID", "USERNAME", "CONTENT", "DOC"};
        String[] args = {PostID};
        Cursor cr = db.query(App_Config.TABLE_COMMENTS, cols, " POSTID = ? ", args, null, null, null);
        cr.moveToFirst();
        Log.e("cursor size ", " " + cr.getCount());
        while (hasMore && cr.getCount() > 0) {
            comments.add(new CollegareComment(cr.getString(cr.getColumnIndex("COMMENTID")),
                    cr.getString(cr.getColumnIndex("POSTID")),
                    cr.getString(cr.getColumnIndex("ID")),
                    cr.getString(cr.getColumnIndex("USERNAME")),
                    cr.getString(cr.getColumnIndex("CONTENT")),
                    cr.getString(cr.getColumnIndex("DOC"))
            ));
            hasMore = cr.moveToNext();
        }
        Log.e("Retrieved ", comments.size() + " Comments");
        return comments;

    }

    public void appendComments(ArrayList<CollegareComment> comments) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cmts = new ContentValues();
        long rowInserted = 0;
        for (int i = 0; i < comments.size(); i++) {
            cmts.clear();
            cmts.put("POSTID", comments.get(i).PostId);
            cmts.put("COMMENTID", comments.get(i).commentid);
            cmts.put("ID", comments.get(i).id);
            cmts.put("USERNAME", comments.get(i).username);
            cmts.put("CONTENT", comments.get(i).content);
            cmts.put("DOC", comments.get(i).doc);
            if (db.insert(App_Config.TABLE_COMMENTS, null, cmts) != -1) {
                rowInserted++;
            }
        }

        Log.e("Added ", rowInserted + " comments");
    }

    /*
    *
    *
    *           MESSAGES    [R/W]
    *
    *
    * */

    public void appendMessage(CollegareMessage messages) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues msg = new ContentValues();
        long messagesDone = 0;
            msg.put("MESSAGEID", messages.msgid);
            msg.put("CONTENT", messages.content);
            msg.put("USERNAME", messages.username);
            msg.put("DOC", messages.doc);
            msg.put("ID", messages.id);
            if (db.insert(App_Config.TABLE_MESSAGES, null, msg) != -1) {
                messagesDone++;
            }
        Log.e("Added ", messagesDone + " message");
    }

    public ArrayList<CollegareMessage> getMessages() {
        boolean hasMore = true;
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<CollegareMessage> messages = new ArrayList<>();
        Cursor cursor = db.query(App_Config.TABLE_MESSAGES,
                new String[]{"MESSAGEID", "CONTENT", "USERNAME", "DOC", "ID"},
                null, null, null, null, null);

        cursor.moveToFirst();
        while (hasMore && cursor.getCount() > 0) {
            messages.add(new CollegareMessage(cursor.getString(cursor.getColumnIndex("MESSAGEID")),
                    cursor.getString(cursor.getColumnIndex("CONTENT")),
                    cursor.getString(cursor.getColumnIndex("USERNAME")),
                    cursor.getString(cursor.getColumnIndex("DOC")),
                    cursor.getString(cursor.getColumnIndex("ID"))
            ));
            hasMore = cursor.moveToNext();
        }
        Log.e("Retrived ", messages.size() + " messages");
        return messages;
    }



    /*
    *           OTHER SECTIONS
    * */

    // getting any individual item if needed in short time      [part time helper method]
    public String getItem(String itemName) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM LoginInfo", null);
        String data = "";
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            data = cursor.getString(cursor.getColumnIndex(itemName));
        }
        return data;
    }


}