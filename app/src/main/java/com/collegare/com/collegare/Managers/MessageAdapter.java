package com.collegare.com.collegare.Managers;

/**
 * Created by RadhePC on 10-11-2015.
 */

import android.app.ActionBar;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.collegare.com.collegare.Models.CollegareMessage;
import com.collegare.com.collegare.Models.CollegareUser;
import com.collegare.com.collegare.R;


import java.util.ArrayList;
import java.util.Date;


public class MessageAdapter extends RecyclerView
        .Adapter<RecyclerView.ViewHolder> {

    private static int MESSAGE_IN=0;
    private static int MESSAGE_OUT=1;
    String userID;
    Context context;
    private static MessageAdapter bInstance;
    public ArrayList<CollegareMessage> mDataset;

    public static MessageAdapter getInstance(Context context){
        if(bInstance==null){
            bInstance=new MessageAdapter(context);
        }
        return bInstance;
    }


    public void setMessageDataList(ArrayList<CollegareMessage> list) {
        this.mDataset = list;
        Log.e("MessageAdapter","msg list set:size:"+list.size());
        notifyDataSetChanged();
    }

    public void addMessageToList(CollegareMessage collegareMessage){
        mDataset.add(0,collegareMessage);
        Log.e("Msg Adapter", "msg added");
        Log.e("MessageAdapter", "msg list set:size:" + mDataset.size());
        notifyDataSetChanged();
        notifyItemInserted(0);
    }

    public static class IncomingMessageHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {

        TextView sender_name;
        TextView timeSpan;
        TextView message;
        ImageView send_receiveImg;

        public IncomingMessageHolder(View itemView) {
            super(itemView);
            send_receiveImg= (ImageView) itemView.findViewById(R.id.indicator);
            sender_name = (TextView) itemView.findViewById(R.id.sender_name);
            message = (TextView) itemView.findViewById(R.id.messageText);
            timeSpan = (TextView) itemView.findViewById(R.id.pastTime);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
    public static class OutgoingMessageHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {

        TextView receiver_name;
        TextView timeSpan;
        TextView message;
        ImageView send_receiveImg;


        public OutgoingMessageHolder(View itemView) {
            super(itemView);
            send_receiveImg= (ImageView) itemView.findViewById(R.id.indicator);
            receiver_name = (TextView) itemView.findViewById(R.id.receiver_name);
            message = (TextView) itemView.findViewById(R.id.messageText);
            timeSpan = (TextView) itemView.findViewById(R.id.pastTime);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }

    public MessageAdapter(Context context) {
        mDataset = new ArrayList<>();
        this.context=context;
        CollegareUser user=DatabaseManager.getInstance(context).getUser();

        if(user!=null){
            userID=user.id;
        }
    }

    public MessageAdapter(ArrayList<CollegareMessage> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public int getItemViewType(int position) {
         super.getItemViewType(position);


        Log.e("Msg Adapter","uid:"+userID+" msg_Uid"+mDataset.get(position).id);
        int type=(mDataset.get(position).id.equals(userID))?MESSAGE_OUT:MESSAGE_IN;
       // Log.e("Msg Adapter","msg type:"+type);
        return type;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType==MESSAGE_IN){
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.message_layout_in, parent, false);
            Log.e("Msg Adapter","msg in inflation");
            return new IncomingMessageHolder(view);
        }
        else{

            View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_layout_out, parent, false);
            Log.e("Msg Adapter","msg out inflation");
            return new OutgoingMessageHolder(view);

        }


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Date d = new Date();
        Log.e("Msg Adapter","binding");
        final CharSequence doc  = DateFormat.format("yyyy-MM-dd hh:mm:ss", d.getTime());
        String timePast = TimeManager.getInstance().convert(doc.toString(), mDataset.get(position).doc);

        if(holder instanceof IncomingMessageHolder){

            ((IncomingMessageHolder) holder).message.setText(mDataset.get(position).content);
            ((IncomingMessageHolder) holder).timeSpan.setText(timePast);
            ((IncomingMessageHolder) holder).sender_name.setText(mDataset.get(position).username);



        }
        else{
            ((OutgoingMessageHolder) holder).message.setText(mDataset.get(position).content);
            ((OutgoingMessageHolder) holder).timeSpan.setText(timePast);
            ((OutgoingMessageHolder) holder).receiver_name.setText(mDataset.get(position).username);
        }


    }

    @Override
    public int getItemCount() {


        return mDataset.size();
    }
}