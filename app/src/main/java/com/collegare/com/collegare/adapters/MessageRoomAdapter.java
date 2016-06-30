package com.collegare.com.collegare.adapters;

/**
 * Created by RadhePC on 10-11-2015.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.collegare.com.collegare.interfaces.LogoutListener;
import com.collegare.com.collegare.models.CollegareMessage;
import com.collegare.com.collegare.R;


import java.util.ArrayList;
import java.util.Date;


public class MessageRoomAdapter extends RecyclerView
        .Adapter<RecyclerView.ViewHolder> implements LogoutListener {

    private static int MESSAGE_IN=0;
    private static int MESSAGE_OUT=1;
    private static MessageRoomAdapter bInstance;
    public ArrayList<CollegareMessage> mDataset;
    Context context;

    public MessageRoomAdapter(Context context) {
        mDataset = new ArrayList<>();
        this.context=context;
    }


    public MessageRoomAdapter(ArrayList<CollegareMessage> myDataset) {
        mDataset = myDataset;
    }

    public static MessageRoomAdapter getInstance(Context context){
        if(bInstance==null){
            bInstance=new MessageRoomAdapter(context);
        }
        return bInstance;
    }

    public void setMessageDataList(ArrayList<CollegareMessage> list) {
        this.mDataset = list;
        notifyDataSetChanged();
    }

    public void addMessageToList(CollegareMessage collegareMessage){
        mDataset.add(collegareMessage);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
         super.getItemViewType(position);
        int type=(mDataset.get(position).type.equals("S"))?MESSAGE_OUT:MESSAGE_IN;
        return type;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType==MESSAGE_IN){
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.message_layout_in, parent, false);
            //Log.e("Msg Adapter","msg in inflation");
            return new IncomingMessageHolder(view);
        }
        else{

            View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_layout_out, parent, false);
          //  Log.e("Msg Adapter","msg out inflation");
            return new OutgoingMessageHolder(view);

        }


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Date d = new Date();
        //Log.e("Msg Adapter","binding");
        String doc = mDataset.get(position).doc;
        if(holder instanceof IncomingMessageHolder){

            ((IncomingMessageHolder) holder).msg_text.setText(mDataset.get(position).content);
            ((IncomingMessageHolder) holder).time_stamp.setText(doc);

        }
        else{
            ((OutgoingMessageHolder) holder).msg_text.setText(mDataset.get(position).content);
            ((OutgoingMessageHolder) holder).time_stamp.setText(doc);
            Log.e("MsgAdap"," sent stat"+mDataset.get(position).sent);
            if(mDataset.get(position).sent.equals("true")){
                ((OutgoingMessageHolder) holder).sentIndicator.setVisibility(View.VISIBLE);
            }
        }


    }

    @Override
    public int getItemCount() {

        return mDataset.size();
    }

    @Override
    public void reset() {

        mDataset.clear();
        Log.e("MA", "cleared data with size:" + mDataset.size());
    }

    public static class IncomingMessageHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView msg_text,time_stamp;

        public IncomingMessageHolder(View itemView) {
            super(itemView);
             msg_text = (TextView) itemView.findViewById(R.id.msg_text_in);
             time_stamp = (TextView) itemView.findViewById(R.id.time_stamp);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }

    public static class OutgoingMessageHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {

        TextView msg_text  ,time_stamp;
        ImageView sentIndicator;
        public OutgoingMessageHolder(View itemView) {
            super(itemView);
             msg_text = (TextView) itemView.findViewById(R.id.msg_text_out);
             time_stamp = (TextView) itemView.findViewById(R.id.time_stamp);
             sentIndicator = (ImageView) itemView.findViewById(R.id.msgSendIndicator);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}