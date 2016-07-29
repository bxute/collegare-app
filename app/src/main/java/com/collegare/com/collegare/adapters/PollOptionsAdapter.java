package com.collegare.com.collegare.adapters;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.collegare.com.collegare.models.CollegarePollOption;
import com.collegare.com.collegare.R;

import java.util.ArrayList;

/**
 * Created by Radhe on 05-03-2016.
 */

public class PollOptionsAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<CollegarePollOption> pollOptions;
    private int selected = -1;
    private boolean isLocked = false;
    private View retView;

    public PollOptionsAdapter(Context context) {
        super(context, 0);
        this.context = context;
        pollOptions = new ArrayList<>();
    }

    public PollOptionsAdapter(Context context, ArrayList<CollegarePollOption> optionsList, String selected) {
        super(context, 0);
        pollOptions = optionsList;
        this.selected = Integer.parseInt(selected);
        this.context = context;
    }

    public void addPollOption(CollegarePollOption option) {
        pollOptions.add(option);

    }

    public void setSelected(int value) {
        selected = value;
        //lock();
        notifyDataSetInvalidated();
    }

    public int getSelected() {
        return selected;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        retView = view;
        //if(retView==null){
        retView = LayoutInflater.from(context).inflate(R.layout.poll_option, null);
        // }
        final TextView tagValue = (TextView) retView.findViewById(R.id.tag);
        TextView optionValue = (TextView) retView.findViewById(R.id.optionValue);
        RelativeLayout optionHolder = (RelativeLayout) retView.findViewById(R.id.optionHolder);
        optionValue.setText(pollOptions.get(position).optionValue);

        if (isLocked) {
            /*final RotateAnimation anim= new RotateAnimation(90.0f,360.0f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            anim.setInterpolator(new LinearInterpolator());
            anim.setRepeatCount(0);
            anim.setDuration(2000);*/

            Animation anim= AnimationUtils.loadAnimation(context,android.R.anim.fade_in);
            anim.setInterpolator(new DecelerateInterpolator(3f));
            anim.setDuration(4000);
            anim.setInterpolator(new DecelerateInterpolator());
            tagValue.startAnimation(anim);

            tagValue.setText(pollOptions.get(position).tagValue);
        }
        if (position == selected) {
            optionHolder.setBackgroundColor(Color.parseColor("#00aa33"));
            optionValue.setTextColor(Color.WHITE);
        }

        retView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isLocked) return;

                if (getSelected() != -1)
                    pollOptions.get(getSelected()).tagValue = (Integer.parseInt(pollOptions.get(getSelected()).tagValue) - 1) + "";
                pollOptions.get(position).tagValue = (Integer.parseInt(pollOptions.get(position).tagValue) + 1) + "";
                setSelected(position);
            }
        });
        return retView;
    }

    @Override
    public int getCount() {
        return pollOptions.size();
    }

    public void show() {
        if(isLocked)return;

        isLocked = true;
        notifyDataSetChanged();

    }
    public void lock(){
        isLocked=true;
    }
}
