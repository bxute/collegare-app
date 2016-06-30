package com.collegare.com.collegare.adapters;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.collegare.com.collegare.activities.MessageRoom;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.textUtils.TimeManager;
import com.collegare.com.collegare.models.CollegareWallMessageModel;
import com.collegare.com.collegare.R;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ankit on 17-03-2016.
 */
public class MessageWallListAdapter extends ArrayAdapter<CollegareWallMessageModel> {

    private  Context context;
    private static MessageWallListAdapter mInstance;
    private ArrayList<CollegareWallMessageModel> wallMessages;

    public MessageWallListAdapter(Context context) {
        super(context, 0);
        this.context = context;
        wallMessages = new ArrayList<>();
    }


    public static MessageWallListAdapter getInstance(Context context){
        if(mInstance==null){
            mInstance=new MessageWallListAdapter(context);
        }
        return mInstance;
    }


    public void setMessageList(final ArrayList<CollegareWallMessageModel> msgs){
        this.wallMessages = msgs;

        DatabaseManager.getInstance(context).setOnMessageReadListener(new DatabaseManager.MessageReadListesner() {
            @Override
            public void onRead(String user_id) {
                for (CollegareWallMessageModel msg : msgs) {
                    if (msg.userID.equals(user_id)) {
                        msg.unread_count = 0;
                        notifyDataSetChanged();
                    }
                }
            }
        });
        for (CollegareWallMessageModel msg : msgs) {
            Log.e("MsgAda user order", msg.user_name+" unread count "+msg.unread_count);
        }
        notifyDataSetInvalidated();
    }


    @Override
    public View getView(final int position , View container , ViewGroup parent){

        View tempView = LayoutInflater.from(context).inflate(R.layout.msg_item,null,false);

        TextView sender,msg,unread_tag,time,wall_user_tag;
        ImageView wall_user_tag_img , sentIndicator;
        LinearLayout block;

            sender = (TextView) tempView.findViewById(R.id.sender);
            msg = (TextView) tempView.findViewById(R.id.msg);
            unread_tag = (TextView) tempView.findViewById(R.id.unread_tag);
            time = (TextView) tempView.findViewById(R.id.wall_msg_time);
            wall_user_tag = (TextView) tempView.findViewById(R.id.wall_user_tag_char);
            wall_user_tag_img = (ImageView) tempView.findViewById(R.id.wall_user_tag_img);
            block = (LinearLayout) tempView.findViewById(R.id.msg_wall_block);
            sentIndicator = (ImageView) tempView.findViewById(R.id.msgSendIndicator);

            block.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String user_id = wallMessages.get(position).userID;
                    Intent intent = new Intent(context,MessageRoom.class);
                    intent.putExtra("user_id", user_id);
                    context.startActivity(intent);

                }
            });

            Date d = new Date();
            final CharSequence doc  = DateFormat.format("yyyy-MM-dd hh:mm:ss", d.getTime());
           String timePast = TimeManager.getInstance().getDifference(doc.toString(), wallMessages.get(position).time);

            String wall_user_tag_char = String.format("%c", wallMessages.get(position).user_name.toUpperCase().charAt(0));
            CollegareWallMessageModel wallMessageModel = wallMessages.get(position);

            wall_user_tag.setText(wall_user_tag_char);
            msg.setText(wallMessageModel.message);
            time.setText(timePast);
           // Log.e("MsgAda user order[bind]", wallMessageModel.user_name + " unread count " + wallMessageModel.unread_count);

            if(wallMessageModel.unread_count>0){
              //  Log.e("uC",""+wallMessageModel.unread_count);
                unread_tag.setVisibility(View.VISIBLE);
                unread_tag.setText(wallMessageModel.unread_count+"");
            }

            if(wallMessageModel.sent){
                sentIndicator.setVisibility(View.VISIBLE);
            }
            sender.setText(wallMessageModel.user_name);

        return tempView;
    }

    @Override
    public int getCount() {
        return wallMessages.size();
    }

    }

