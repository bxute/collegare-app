package com.collegare.com.collegare.customControls;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;

/**
 * Created by Ankit on 6/23/2016.
 */

public class MessageLayoutManager extends LinearLayoutManager {
    Context mContext;
    private float MILLISECOND_PER_INCH = 100f;
    public MessageLayoutManager(Context context) {
        super(context);
        this.mContext = context;
    }

    @Override
    public void  smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position){

        LinearSmoothScroller smoothScroller = new LinearSmoothScroller(mContext) {
            @Override
            public PointF computeScrollVectorForPosition(int targetPosition) {
               return MessageLayoutManager.this.computeScrollVectorForPosition(targetPosition);
            }

            @Override
            protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return MILLISECOND_PER_INCH/displayMetrics.densityDpi;
            }
        };

        smoothScroller.setTargetPosition(position);
        startSmoothScroll(smoothScroller);
    }


}
