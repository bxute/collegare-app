package com.collegare.com.collegare.database;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.collegare.com.collegare.utilities.App_Config;
import com.collegare.com.collegare.models.CollegareAdmin;
import com.collegare.com.collegare.models.CollegareComment;
import com.collegare.com.collegare.models.CollegareFeed;
import com.collegare.com.collegare.models.CollegareGroup;
import com.collegare.com.collegare.models.CollegareGroupMember;
import com.collegare.com.collegare.models.CollegareMessage;
import com.collegare.com.collegare.models.CollegarePollOption;
import com.collegare.com.collegare.models.CollegarePost;
import com.collegare.com.collegare.models.CollegareTask;
import com.collegare.com.collegare.models.CollegareUser;

import java.util.ArrayList;

public class DatabaseManager extends SQLiteOpenHelper {

    public interface NewMessageListener{
         void onMessageAdd();
    }

    public interface MessageReadListesner{
        void onRead(String user_id);
    }

    public interface TaskListener{
        void onAdd();
    }

    public interface MessageSentListener{
        void onMessageSent();
    }
    public MessageReadListesner msgRead_listener;
    public NewMessageListener listener;
    public TaskListener mTaskListener;
    public MessageSentListener sentListener;

    public void setOnNewMessageAdditionListener(NewMessageListener listener){
        this.listener = listener;
    }

    public void setOnMessageReadListener(MessageReadListesner listener){
        this.msgRead_listener = listener;
    }

    public void setOnTaskAdditionListener(TaskListener listener){
        this.mTaskListener = listener;
    }

    public void setOnMessageSentListener(MessageSentListener listener){
        this.sentListener = listener;
    }


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
        listener = null;
    }

    public static DatabaseManager getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseManager(context);
        }
        return instance;
    }

    public void intiateDataBase() {
        SQLiteDatabase db = getWritableDatabase();
        rolldownTables(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        rolldownTables(db);
    }

    public void dropTable(SQLiteDatabase db, String tableName) {
        db.execSQL("DROP TABLE IF EXISTS " + tableName + ";");
        Log.e("DM" + tableName, "droped");
    }

    public void rolldownTables(SQLiteDatabase db) {
        try {

            db.execSQL(
                    "CREATE TABLE if not exists LoginInfo (" +
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
            Log.e("DM", "LoginInfo table created!");

            db.execSQL(
                    "CREATE TABLE if not exists Groups (" +
                            "GROUPID INTEGER PRIMARY KEY ," +
                            "TITLE TEXT ," +
                            "DOC TEXT ," +
                            "ID TEXT );"
            );
            Log.e("DM", "Groups table created !");


            db.execSQL("CREATE TABLE if not exists Members (" +
                            "GROUPID TEXT ," +
                            "NAME TEXT ," +
                            "ID TEXT );"
            );
            Log.e("DM", "Members table created !");


            db.execSQL("CREATE TABLE IF NOT EXISTS Admins (" +
                            "GROUPID TEXT ," +
                            "NAME TEXT ," +
                            "ID TEXT );"
            );
            Log.e("DM", "Admins table created !");


            db.execSQL(
                    "CREATE TABLE  if not exists Posts (" +
                            "POSTID TEXT, " +
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
            Log.e("DM", "Posts table created!");


            db.execSQL(
                    "CREATE TABLE if not exists Comments (" +
                            "COMMENTID INTEGER PRIMARY KEY, " +
                            "POSTID TEXT , " +
                            "ID TEXT , " +
                            "USERNAME TEXT , " +
                            "CONTENT TEXT , " +
                            "DOC TEXT " +
                            ");"
            );
            Log.e("DM", "Comments table created!");


            db.execSQL(
                    "CREATE TABLE if not exists Messages (" +
                            "MESSAGEID TEXT, " +
                            "CONTENT TEXT, " +
                            "DOC TEXT, " +
                            "ID TEXT," +
                            "READ TEXT," +
                            "TYPE TEXT," +
                            "SENT TEXT," +
                            "SENDERNAME TEXT," +
                            "SENDERID TEXT," +
                            "RECEIVERNAME TEXT," +
                            "RECEIVERID TEXT" +
                            ");"
            );
            Log.e("DM", "Messages table created!");

            db.execSQL(
                    "CREATE TABLE if not exists PollOptions (" +
                            "POLLID INTEGER, " +
                            "CONTENT TEXT, " +
                            "TAG TEXT " +
                            ");"
            );
            Log.e("DM", "PollOptions table created!");

            db.execSQL(
                    "CREATE TABLE if not exists Tasks (" +
                            "TASK_ID TEXT," +
                            "TASK_PAYLOAD TEXT," +
                            "TASK_RECEIVER TEXT," +
                            "TASK_TIMESTAMP TEXT" +
                            ");"
            );
            Log.e("DM","Tasks Table created!");

        } catch (Exception e) {
            Log.e("DM","[TABLE CREATION ERROR]");
        }
    }

    public void rollbackDatabase() {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("drop table LoginInfo;");
        db.execSQL("drop table Members;");
        db.execSQL("drop table Admins;");
        db.execSQL("drop table Posts;");
        db.execSQL("drop table Comments;");
        db.execSQL("drop table Messages;");
        db.execSQL("drop table Groups;");
        db.execSQL("drop table PollOptions;");
        db.execSQL("drop table Tasks;");
        rolldownTables(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        dropTable(db, App_Config.TABLE_POST);
        dropTable(db, App_Config.TABLE_MESSAGES);
        dropTable(db, App_Config.TABLE_LOGIN);
        dropTable(db, App_Config.TABLE_COMMENTS);
        dropTable(db, App_Config.TABLE_GROUPS);
        dropTable(db, App_Config.TABLE_GROUPS);
        onCreate(db);
        Log.e("DM","database up graded");
    }

    public void addUser(CollegareUser user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        //ContentValues members = new ContentValues();
        ContentValues admins = new ContentValues();

        values.put("FIRSTNAME", user.firstname);
        values.put("LASTNAME", user.lastname);
        values.put("USERNAME", user.username);
        values.put("ID", user.id);
        values.put("EMAIL", user.email);
        values.put("SEX", user.sex);
        values.put("DOB", user.dob);
        values.put("TOKEN", user.token);

        long ins = db.insert("LoginInfo", null, values);
        Log.e("lll inserted ", "user >" + ins);
        int size = user.groups.size();

        for (int i = 0; i < size; i++) {
            values.clear();
            values.put("GROUPID", user.groups.get(i).GroupID);
            values.put("TITLE", user.groups.get(i).Title);
            values.put("DOC", user.groups.get(i).CreationDate);
            values.put("ID", user.id);
            db.insert(App_Config.TABLE_GROUPS, null, values);

            int k;
            ArrayList<CollegareAdmin> admins1 = user.groups.get(i).admins;
            for (k = 0; k < admins1.size(); k++) {
                admins.put("GROUPID", admins1.get(k).GroupId);
                admins.put("ID", admins1.get(k).id);
                admins.put("NAME", admins1.get(k).Name);
                ins = db.insert(App_Config.TABLE_ADMINS, null, admins);
                Log.e(" inserted admin", " " + ins);

            }
            ArrayList<CollegareGroupMember> mem = user.groups.get(i).memebers;
            for (k = 0; k < mem.size(); k++) {
                admins.put("GROUPID", mem.get(k).GroupId);
                admins.put("ID", mem.get(k).id);
                admins.put("NAME", mem.get(k).Name);
                ins = db.insert(App_Config.TABLE_MEMBERS, null, admins);
                Log.e(" inserted member ", " " + ins);

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
            user = new CollegareUser(cursor.getString(cursor.getColumnIndex("FIRSTNAME")),
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
       cursor.close();
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
            hasNext = cursor.moveToNext();
        }
      //  Log.e("retrieved ", " " + admins.size() + " admins");
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
            hasNext = cursor.moveToNext();
        }
        //Log.e("retrieved ", " " + members.size() + " members");
        return members;
    }

    public ArrayList<CollegareGroup> getGroups(String Id) {
        //Log.e("call for groups ", " id>" + Id);
        SQLiteDatabase db = getReadableDatabase();
        boolean hasNext = true;
        ArrayList<CollegareGroup> members = new ArrayList<>();

        Cursor cursor = db.query(App_Config.TABLE_GROUPS, new String[]{"GROUPID", "ID", "TITLE", "DOC"},
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
            hasNext = cursor.moveToNext();
        }
        //Log.e("retrieved ", " " + members.size() + " groups");
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

    public void appendPollOptions(ArrayList<CollegarePollOption> pollOptionList){

        SQLiteDatabase db =getWritableDatabase();
        ContentValues pollValues= new ContentValues();
        for(int i=0;i<pollOptionList.size();i++){
            CollegarePollOption option=pollOptionList.get(i);
            pollValues.put("POLLID",option.pollId);
            pollValues.put("CONTENT",option.optionValue);
            pollValues.put("TAG",option.tagValue);
            db.insert("PollOptions",null,pollValues);
        }
        Log.e("DM", "appended poll options");

    }

    public ArrayList<CollegarePollOption> getPollOptions(String pollId){
        SQLiteDatabase db = getReadableDatabase();
        boolean hasMore = true;

        ArrayList<CollegarePollOption> options =  new ArrayList<>();
        Cursor cursor= db.query("PollOptions",new String[]{"POLLID","CONTENT","TAG"},"POLLID = ?",new String[]{pollId},null,null,null);
        cursor.moveToFirst();
        while(hasMore && cursor.getCount()>0){
            options.add(new CollegarePollOption(
                    cursor.getString(cursor.getColumnIndex("POLLID")),
                    cursor.getString(cursor.getColumnIndex("CONTENT")),
                    cursor.getString(cursor.getColumnIndex("TAG"))

            ));
            hasMore=cursor.moveToNext();
        }
        Log.e("DM", options.size() + " Options from db");
        return options;

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
        //Log.e("Retrieved ", cursor.getCount() + " Post");
        return feed;
    }

    public ArrayList<CollegareFeed> getPosts(String gid) {
        boolean hasMore = true;
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<CollegareFeed> posts = new ArrayList<>();
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
                    cursor.getString(cursor.getColumnIndex("DISLIKED")),null,null

            ));
            hasMore = cursor.moveToNext();
        }
        Log.e("DM", posts.size() + " Posts from db");
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
       // Log.e("for post id", " " + PostID);
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
        cr.close();
        return comments;

    }

    public void appendComments(ArrayList<CollegareComment> comments) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cmts = new ContentValues();
        for (int i = 0; i < comments.size(); i++) {
            cmts.clear();
            cmts.put("POSTID", comments.get(i).PostId);
            cmts.put("COMMENTID", comments.get(i).commentid);
            cmts.put("ID", comments.get(i).id);
            cmts.put("USERNAME", comments.get(i).username);
            cmts.put("CONTENT", comments.get(i).content);
            cmts.put("DOC", comments.get(i).doc);
            db.insert(App_Config.TABLE_COMMENTS, null, cmts);
        }

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
        msg.put("DOC", messages.doc);
        msg.put("SENDERNAME",messages.sender_name);
        msg.put("SENDERID",messages.sender_id);
        msg.put("RECEIVERNAME",messages.receiver_name);
        msg.put("RECEIVERID",messages.receiver_id);
        msg.put("READ", messages.read);
        msg.put("TYPE",messages.type);
        msg.put("SENT",messages.sent);
        if (db.insert(App_Config.TABLE_MESSAGES, null, msg) != -1) {
            messagesDone++;
        }
        this.listener.onMessageAdd();        // callback to listeners
        Log.e("DM","Added "+ messagesDone + " message");
    }

    public ArrayList<CollegareMessage> getMessages() {
        boolean hasMore = true;
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<CollegareMessage> messages = new ArrayList<>();
        Cursor cursor = db.query(App_Config.TABLE_MESSAGES,
                new String[]{"MESSAGEID", "CONTENT", "SENDERNAME", "DOC", "SENDERID","RECEIVER_NAME","RECEIVERID" ,"READ", "TYPE", "SENT"},
                null, null, null, null, null);

        cursor.moveToFirst();
        while (hasMore && cursor.getCount() > 0) {
            messages.add(new CollegareMessage(
                    cursor.getString(cursor.getColumnIndex("MESSAGEID")),
                    cursor.getString(cursor.getColumnIndex("CONTENT")),
                    cursor.getString(cursor.getColumnIndex("SENDERNAME")),
                    cursor.getString(cursor.getColumnIndex("DOC")),
                    cursor.getString(cursor.getColumnIndex("SENDERID")),
                    cursor.getString(cursor.getColumnIndex("RECEIVERID")),
                    cursor.getString(cursor.getColumnIndex("RECEIVERNAME")),
                    cursor.getString(cursor.getColumnIndex("READ")),
                    cursor.getString(cursor.getColumnIndex("TYPE")),
                    cursor.getString(cursor.getColumnIndex("SENT"))
            ));
            hasMore = cursor.moveToNext();
        }
     //   Log.e("DM", "Retrived " + messages.size() + " messages");
        return messages;
    }

    public ArrayList<CollegareMessage> getMessages(String id) {
        boolean hasMore = true;
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<CollegareMessage> messages = new ArrayList<>();
        Cursor cursor = db.query(App_Config.TABLE_MESSAGES,
                new String[]{"MESSAGEID", "CONTENT", "SENDERNAME", "DOC", "SENDERID","RECEIVERNAME","RECEIVERID" ,"READ", "TYPE", "SENT"},
                "SENDERID=? OR RECEIVERID =?", new String[]{id,id}, null, null, null);

        cursor.moveToFirst();
        while (hasMore && cursor.getCount() > 0) {

            messages.add(new CollegareMessage(
                    cursor.getString(cursor.getColumnIndex("MESSAGEID")),
                    cursor.getString(cursor.getColumnIndex("CONTENT")),
                    cursor.getString(cursor.getColumnIndex("SENDERNAME")),
                    cursor.getString(cursor.getColumnIndex("DOC")),
                    cursor.getString(cursor.getColumnIndex("SENDERID")),
                    cursor.getString(cursor.getColumnIndex("RECEIVERID")),
                    cursor.getString(cursor.getColumnIndex("RECEIVERNAME")),
                    cursor.getString(cursor.getColumnIndex("READ")),
                    cursor.getString(cursor.getColumnIndex("TYPE")),
                    cursor.getString(cursor.getColumnIndex("SENT"))
            ));
            hasMore = cursor.moveToNext();
        }
       cursor.close();
        return messages;
    }

    public void setMessageRead(String user_id){
        boolean hasMore = true;
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<CollegareMessage> messages = new ArrayList<>();
        Cursor cursor = db.query(App_Config.TABLE_MESSAGES,
                new String[]{"MESSAGEID", "CONTENT", "SENDERNAME", "DOC", "SENDERID","RECEIVERNAME","RECEIVERID" ,"READ", "TYPE", "SENT"},
                "SENDERID=?", new String[]{user_id}, null, null, null);

        cursor.moveToFirst();
        while (hasMore && cursor.getCount() > 0) {

            messages.add(new CollegareMessage(cursor.getString(cursor.getColumnIndex("MESSAGEID")),
                    cursor.getString(cursor.getColumnIndex("CONTENT")),
                    cursor.getString(cursor.getColumnIndex("SENDERNAME")),
                    cursor.getString(cursor.getColumnIndex("DOC")),
                    cursor.getString(cursor.getColumnIndex("SENDERID")),
                    cursor.getString(cursor.getColumnIndex("RECEIVERID")),
                    cursor.getString(cursor.getColumnIndex("RECEIVERNAME")),
                    cursor.getString(cursor.getColumnIndex("READ")),
                    cursor.getString(cursor.getColumnIndex("TYPE")),
                    cursor.getString(cursor.getColumnIndex("SENT"))
            ));
            hasMore = cursor.moveToNext();
        }

        ContentValues msg_cv= new ContentValues();

        for (CollegareMessage msg : messages) {
            Log.e("DM","setting read to "+msg.content);
            msg_cv.put("READ", "true");
            db.update(App_Config.TABLE_MESSAGES, msg_cv, "SENDERID=?", new String[]{user_id});
        }
        // callback to subscribers
        cursor.close();
        msgRead_listener.onRead(user_id);
    }

    public void setMessageSent(String msg_id){
        boolean hasMore = true;
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<CollegareMessage> messages = new ArrayList<>();
        Cursor cursor = db.query(App_Config.TABLE_MESSAGES,
                new String[]{"MESSAGEID", "CONTENT", "SENDERNAME", "DOC", "SENDERID","RECEIVERNAME","RECEIVERID" ,"READ", "TYPE", "SENT"},
                "MESSAGEID=? AND TYPE=?", new String[]{msg_id,"S"}, null, null, null);

        cursor.moveToFirst();
        while (hasMore && cursor.getCount() > 0) {

            messages.add(new CollegareMessage(cursor.getString(cursor.getColumnIndex("MESSAGEID")),
                    cursor.getString(cursor.getColumnIndex("CONTENT")),
                    cursor.getString(cursor.getColumnIndex("SENDERNAME")),
                    cursor.getString(cursor.getColumnIndex("DOC")),
                    cursor.getString(cursor.getColumnIndex("SENDERID")),
                    cursor.getString(cursor.getColumnIndex("RECEIVERID")),
                    cursor.getString(cursor.getColumnIndex("RECEIVERNAME")),
                    cursor.getString(cursor.getColumnIndex("READ")),
                    cursor.getString(cursor.getColumnIndex("TYPE")),
                    cursor.getString(cursor.getColumnIndex("SENT"))
            ));
            hasMore = cursor.moveToNext();
        }

        ContentValues msg_cv= new ContentValues();

        for (CollegareMessage msg : messages) {
            Log.e("DM","setting read to "+msg.content);
            msg_cv.put("SENT", "true");
            db.update(App_Config.TABLE_MESSAGES, msg_cv, "MESSAGEID=?", new String[]{msg_id});
        }
        // callback to subscribers
        sentListener.onMessageSent();
        cursor.close();

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

    public CollegareTask getTask(String _id){

        SQLiteDatabase db = getReadableDatabase();
        CollegareTask collegareTask;
        Cursor cursor = db.query(App_Config.TABLE_TASKS,
                new String[]{"TASK_ID , TASK_PAYLOAD , TASK_RECEIVER , TASK_TIMESTAMP"},
                "TASK_ID=?", new String[]{_id}, null, null, null);
        cursor.moveToFirst();
        collegareTask = new CollegareTask(  cursor.getString(cursor.getColumnIndex("TASK_ID")),
                                            cursor.getString(cursor.getColumnIndex("TASK_PAYLOAD")),
                                            cursor.getString(cursor.getColumnIndex("TASK_RECEIVER")),
                                            cursor.getString(cursor.getColumnIndex("TASK_TIMESTAMP"))
                                        );
        cursor.close();
        return collegareTask;
    }

    public void addTask(CollegareTask task){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues tasks = new ContentValues();

        tasks.put("TASK_ID",task.taskID);
        tasks.put("TASK_PAYLOAD",task.payload);
        tasks.put("TASK_RECEIVER",task.receiver);
        tasks.put("TASK_TIMESTAMP", task.timeStamp);

        long _s  = db.insert(App_Config.TABLE_TASKS, null, tasks);

        Log.e("DM", "Added " + _s + " task");
        mTaskListener.onAdd();

    }

    public void removeTask(String _tid){
        SQLiteDatabase db = getWritableDatabase();
        long id = db.delete(App_Config.TABLE_TASKS,"TASK_ID=?",new String[]{_tid});
        Log.e("DM","setting msgid "+_tid.substring(3)+ " seen");
        setMessageSent(_tid.substring(3));
        Log.e("DM"," deleted "+id+ "Task");
    }




}