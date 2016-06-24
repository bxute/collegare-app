package com.collegare.com.collegare.utilities;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.view.View;

import com.collegare.com.collegare.R;

/**
 * Created by RadhePC on 12-11-2015.
 */
public class RecyclerViewDecorator extends RecyclerView.ItemDecoration {
    Context context;
    int vSpace;
    int resId;
    boolean neededDivider;
    public RecyclerViewDecorator(Context context,int space,boolean doDividerNeeded,int resId){
        this.context=context;
        this.vSpace=space;
        neededDivider=doDividerNeeded;
        this.resId=resId;
    }
    @Override
    public void getItemOffsets(Rect outRect,View view,RecyclerView parent,RecyclerView.State state){

        if(parent.getChildAdapterPosition(view)!=parent.getAdapter().getItemCount()-1)
        outRect.bottom=vSpace;

    }
    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        Drawable divider;
        divider= ContextCompat.getDrawable(context,resId);
        int left=parent.getPaddingLeft();
        int right=parent.getWidth()-parent.getPaddingRight();
        int childs=parent.getChildCount();
        for(int i=0;i<childs;i++){
            View child=parent.getChildAt(i);
            RecyclerView.LayoutParams params= (RecyclerView.LayoutParams) child.getLayoutParams();
            int top=child.getBottom()+params.bottomMargin;
            int bottom= top+divider.getIntrinsicHeight();
            divider.setBounds(left,top,right,bottom);
            if(neededDivider)divider.draw(c);

        }

    }

}
