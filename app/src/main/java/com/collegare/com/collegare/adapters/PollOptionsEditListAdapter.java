package com.collegare.com.collegare.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.collegare.com.collegare.R;

import java.util.ArrayList;

/**
 * Created by Ankit on 07-03-2016.
 */
public class PollOptionsEditListAdapter extends ArrayAdapter<String> {

    private Context context;
    private TextView title;
    private ArrayList<String> options;

    public void add(String value){
        options.add(value);
        notifyDataSetChanged();
    }

    public void remove(int pos){
        options.remove(pos);
        notifyDataSetChanged();
    }

    public void destroy(){
        options.clear();
    }

    public PollOptionsEditListAdapter(Context context){
        super(context,0);
        this.context=context;
        options=new ArrayList<>();
    }

    @Override
    public View getView(final int position,View view, ViewGroup parent) {
        View tempView=view;
        if(tempView==null){
            tempView= LayoutInflater.from(context).inflate(R.layout.poll_option_item,null);
        }
        TextView title= (TextView) tempView.findViewById(R.id.optionTitle);
        ImageView cross= (ImageView) tempView.findViewById(R.id.removeBtn);
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remove(position);
            }
        });
        title.setText(options.get(position));
        return tempView;
    }

    @Override
    public int getCount() {
        return options.size();
    }

}
