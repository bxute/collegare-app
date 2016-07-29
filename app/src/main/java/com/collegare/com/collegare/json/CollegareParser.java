package com.collegare.com.collegare.json;

import android.content.Context;

import com.collegare.com.collegare.SharedPreference.SessionManager;
import com.collegare.com.collegare.adapters.FeedsAdapter;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.models.CollegareFeed;
import com.collegare.com.collegare.models.CollegareGroup;
import com.collegare.com.collegare.models.CollegareMessage;
import com.collegare.com.collegare.models.CollegarePollOption;
import com.collegare.com.collegare.models.CollegareUser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CollegareParser {

    /*
    *          parse feed i.e complete posts     do not confuse this with posts     [STATUS: OK][1]
    *
    * */
    public static CollegareParser bInstance;
    private Context context;

    public CollegareParser(Context context){
        this.context=context;
        bInstance=this;
    }

    public static CollegareParser getInstance(Context context){
        if(bInstance ==null){
            bInstance= new CollegareParser(context);
        }
        return bInstance;
    }

    public void parseFeed(String response) {
        ArrayList<CollegareFeed> feedlist= new ArrayList<>();
        try {
            JSONObject feedObj = new JSONObject(response);
        //    Log.e("mmm res>>",""+response);
            if (feedObj.getInt("status") != 0)
            {
                return;
            }
            else {
                CollegareFeed feed =null;

                JSONArray posts = feedObj.getJSONArray("posts");

                for (int i = posts.length()-1; i >= 0; i--) {
                    JSONObject post = (JSONObject) posts.get(i);

                    if(post.getString("pollid").equals("null")){
                        String isLiked=(post.getString("vote").equals("1"))?"true":"false";
                        String isDisLiked=(post.getString("vote").equals("-1"))?"true":"false";
                        //          Log.e("CP","vote:"+post.getString("vote")+" pid:"+post.getString("postid"));
                        feed =new CollegareFeed(
                                post.getString("postid"),
                                post.getString("content"),
                                post.getString("username"),
                                post.getString("doc"),
                                post.getString("gid"),
                                post.getString("id"),
                                post.getString("weight"),
                                post.getString("pollid"),
                                post.getString("commentcount"),
                                post.getString("upcount"),
                                post.getString("downcount"),
                                isLiked,
                                isDisLiked,null,null
                        );
                    }else{          // else it is poll

                        JSONArray pollOptions = post.getJSONArray("options");
                        ArrayList<CollegarePollOption> options= new ArrayList<>();

                        for(i=pollOptions.length()-1;i>=0;i--){
                            JSONObject op= (JSONObject) pollOptions.get(i);
                            options.add(new CollegarePollOption(op.getString("pollid"),op.getString("tagValue"),op.getString("optionValue")));
                        }

                        feed =new CollegareFeed(
                                post.getString("postid"),
                                post.getString("content"),
                                post.getString("username"),
                                post.getString("doc"),
                                post.getString("gid"),
                                post.getString("id"),
                                post.getString("weight"),
                                post.getString("pollid"),
                                null,
                                null,
                                null,
                                null,
                                null,options,post.getString("selected")
                        );
                    }




                    FeedsAdapter.getInstance(context).addToPostDataList(feed);
                    feedlist.add(feed);
            //        Log.e("lll hiesght id is",""+SessionManager.getLastPostID());
                    if(Integer.parseInt(SessionManager.getLastPostID(SessionManager.getLastGroup())) < Integer.parseInt(post.getString("postid"))){
                        SessionManager.setLastPostID(SessionManager.getLastGroup(),post.getString("postid"));
                        //          Log.e("lll now highest is :",""+post.getString("postid"));
                    }

                }

                DatabaseManager.getInstance(context).appendFeed(feedlist);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    /*
    *
    *           parse data for a single post with its commets ,,,    used for displaying in indivisual post page        [STATUS: OK][1]
    * */
    /*
    *
    *           parse messages          [STATUS: OK][1]
    * */

    public void parseMessage(String response)
    {
       CollegareMessage message = null;

        try {
            JSONObject msgObj = new JSONObject(response);

            if (msgObj.getInt("status") != 0){
                return;
            }
            JSONArray msgArray = msgObj.getJSONArray("messages");
            for (int i = msgArray.length()-1; i >= 0 ; i--) {
                JSONObject temp = (JSONObject) msgArray.get(i);
                message= new CollegareMessage(
                                temp.getString("msgid"),
                                temp.getString("content"),
                                temp.getString("username"),
                                temp.getString("doc"),
                                temp.getString("id"),
                                temp.getString("read"),
                                "201451065",
                                "ME",
                                "R","false"
                        );
                //Log.e("msg parser","msg:"+temp.getString("content"));
               // MessageWallListAdapter.getInstance(context).addMessage(new Message(Integer.parseInt(message.msgid),Integer.parseInt(message.id),message.username, 1,message.doc,message.content ));
              // MessageRoomAdapter.getInstance(context).addMessageToList(message);
               DatabaseManager.getInstance(context).appendMessage(message);
            }

            return;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return;
    }



//(String firstname, String lastname, String username, String id, String email, String sex,
// ArrayList<CollegareGroup> groups, String dob,String token)

    public CollegareUser parseUserInfos(String response,String token) {
        //Log.e("request in for parsenU","");
        CollegareUser user=null;
        ArrayList<CollegareGroup> groups= new ArrayList<>();
        try {
            JSONObject userObj= new JSONObject(response);
          //  Log.e("qqq rec-token:",""+token);
//            Log.e("qqq rec-id:", userObj.getString("id"));

  //          Log.e("fname",(userObj.getString("firstname")));
            user=new CollegareUser(userObj.getString("firstname"),userObj.getString("lastname"),userObj.getString("username"),
                    userObj.getString("id"),userObj.getString("email"),userObj.getString("sex"),groups,userObj.getString("dob"),token);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return user;
    }
}