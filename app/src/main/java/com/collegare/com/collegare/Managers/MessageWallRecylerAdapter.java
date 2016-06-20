package com.collegare.com.collegare.Managers;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.collegare.com.collegare.Activity.MessageRoom;
import com.collegare.com.collegare.Models.CollegareWallMessageModel;
import com.collegare.com.collegare.Models.Message;
import com.collegare.com.collegare.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Ankit on 17-03-2016.
 */
public class MessageWallRecylerAdapter extends RecyclerView.Adapter<MessageWallRecylerAdapter.MessageHolder> {

    private static Context context;
    private static MessageWallRecylerAdapter mInstance;
    private ArrayList<CollegareWallMessageModel> wallMessages;

    public MessageWallRecylerAdapter(Context context){
        this.context=context;
        this.wallMessages = new ArrayList<>();
    }

    public static MessageWallRecylerAdapter getInstance(Context context){
        if(mInstance==null){
            mInstance=new MessageWallRecylerAdapter(context);
        }
        return mInstance;
    }

//    public int getIndex(int id){
//        int index=-1;
//        for(int i=1;i<msgOrder.size();i++){
//            if(msgOrder.get(i).id==id){
//                Log.e("indez:",""+i);
//                index=i;
//            }
//        }
//
//        return index;
//    }

//    public void remove(int index){
//        msgOrder.remove(index);
//    }
//
    public void addMessage(CollegareWallMessageModel msg){
        wallMessages.add(msg);
        notifyItemInserted(0);
    }

    public void setMessageList(ArrayList<CollegareWallMessageModel> msgs){
        this.wallMessages = msgs;
        Log.e("MesgAda","new list set");
        notifyDataSetChanged();
    }


    @Override
    public MessageWallRecylerAdapter.MessageHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new MessageHolder(LayoutInflater.from(context).inflate(R.layout.msg_item,parent,false));
    }

    @Override
    public void onBindViewHolder(MessageWallRecylerAdapter.MessageHolder holder, int position) {
        Date d = new Date();
        final CharSequence doc  = DateFormat.format("yyyy-MM-dd hh:mm:ss", d.getTime());
        String timePast = TimeManager.getInstance().convert(doc.toString(), wallMessages.get(position).time);

        String wall_user_tag = String.format("%c", wallMessages.get(position).user_name.toUpperCase().charAt(0));
        CollegareWallMessageModel wallMessageModel = wallMessages.get(position);

        holder.wall_user_tag.setText(wall_user_tag);
        holder.msg.setText(wallMessageModel.message);
        holder.time.setText(timePast);
        if(wallMessageModel.unread_count>0){
            holder.unread_tag.setVisibility(View.VISIBLE);
            holder.unread_tag.setText(wallMessageModel.unread_count+"");
        }
        holder.sender.setText(wallMessageModel.user_name);


    }

    @Override
    public int getItemCount() {
        return wallMessages.size();
    }

    public class MessageHolder extends RecyclerView.ViewHolder {

        TextView sender,msg,unread_tag,time,wall_user_tag;
        ImageView wall_user_tag_img;

        public MessageHolder(View tempView) {
            super(tempView);

            sender = (TextView) tempView.findViewById(R.id.sender);
            msg = (TextView) tempView.findViewById(R.id.msg);
            unread_tag = (TextView) tempView.findViewById(R.id.unread_tag);
            time = (TextView) tempView.findViewById(R.id.wall_msg_time);
            wall_user_tag = (TextView) tempView.findViewById(R.id.wall_user_tag_char);
            wall_user_tag_img = (ImageView) tempView.findViewById(R.id.wall_user_tag_img);

        }
    }
}
