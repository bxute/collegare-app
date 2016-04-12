package com.collegare.com.collegare.Managers;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.collegare.com.collegare.Models.Message;
import com.collegare.com.collegare.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ankit on 17-03-2016.
 */
public class MessageWallRecylerAdapter extends RecyclerView.Adapter<MessageWallRecylerAdapter.MessageHolder> {

    private static Context context;
    HashMap<Integer,String> msgMap;
    ArrayList<Message> msgOrder;
    private static MessageWallRecylerAdapter mInstance;

    public MessageWallRecylerAdapter(Context context){
        this.context=context;
        msgMap= new HashMap<>();
        msgOrder=new ArrayList<>();
    }

    public static MessageWallRecylerAdapter getmInstance(Context context){
        if(mInstance==null){
            mInstance=new MessageWallRecylerAdapter(context);
        }
        return mInstance;
    }

    public int getIndex(int id){
        int index=-1;
        for(int i=1;i<msgOrder.size();i++){
            if(msgOrder.get(i).id==id){
                Log.e("indez:",""+i);
                index=i;
            }
        }

        return index;
    }

    public void remove(int index){
        msgOrder.remove(index);
    }

    public void addMessage(Message msg){
        msgMap.put(msg.id, msg.msg);
        msgOrder.add(0,msg);
        if(getIndex(msg.id)!=-1){
            msgOrder.get(0).count+= msgOrder.get(getIndex(msg.id)).count;
            remove(getIndex(msg.id));
        }
        notifyItemInserted(0);
    }

    public void setSeen(int pos){
        msgOrder.get(pos).count=0;
        for(int i=0;i<msgOrder.size();i++){
            Log.e("" + i, " co>>" + msgOrder.get(i).count);
        }

    }

    @Override
    public MessageWallRecylerAdapter.MessageHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new MessageHolder(LayoutInflater.from(context).inflate(R.layout.msg_item,parent,false));
    }

    @Override
    public void onBindViewHolder(MessageWallRecylerAdapter.MessageHolder holder, int position) {

        holder.sender.setText(msgOrder.get(position).username+"");
        holder.msg.setText(msgMap.get(msgOrder.get(position).id));
        holder.time.setText(msgOrder.get(position).time);
        holder.tagBgImage.setBackgroundColor(Color.parseColor(new com.collegare.com.collegare.Managers.Color().getColor()));
        String tag = String.format("%c", msgOrder.get(position).username.toUpperCase().charAt(0));
        holder.userTag.setText(tag);

        if(msgOrder.get(position).count>0){
            holder.tag.setVisibility(View.VISIBLE);
            holder.tag.setText(msgOrder.get(position).count + "");
            holder.msg.setTextColor(Color.parseColor("#000011"));
        }

    }

    @Override
    public int getItemCount() {
        return msgOrder.size();
    }

    public class MessageHolder extends RecyclerView.ViewHolder {

        TextView sender,msg,tag,time,userTag;
        ImageView tagBgImage;
        public MessageHolder(View tempView) {
            super(tempView);
            sender= (TextView) tempView.findViewById(R.id.sender);
            msg= (TextView) tempView.findViewById(R.id.msg);
            tag= (TextView) tempView.findViewById(R.id.msgCount);
            time= (TextView) tempView.findViewById(R.id.lTime);
            userTag= (TextView) tempView.findViewById(R.id.msgTag);
            tagBgImage= (ImageView) tempView.findViewById(R.id.MsgTag_bg);
        }
    }
}
