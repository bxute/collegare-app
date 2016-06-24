package com.collegare.com.collegare.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Radhe on 12-04-2016.
 */
public class Tag extends TextView {

    public Tag(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setTag(String tag){

        setText(tag);

        if(Build.VERSION.SDK_INT>16){
            setBackground(new BackgroundDrawable());
        }
        else{
            setBackgroundDrawable(new BackgroundDrawable());
        }

    }


    public class BackgroundDrawable extends Drawable{
        private Paint mPaint;
        public BackgroundDrawable(){
            mPaint= new Paint();
            mPaint.setStrokeWidth(1);
        }

        @Override
        public void draw(Canvas canvas) {
            int lvl = getLevel();
            Rect b = getBounds();
            float x = b.width();
            float y = b.height();
            mPaint.setColor(Color.parseColor("#009988"));
            canvas.drawCircle(x, y, x / 2, mPaint);
        }

        @Override
        public void setAlpha(int alpha) {

        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {

        }

        @Override
        public int getOpacity() {
            return PixelFormat.TRANSLUCENT;
        }
    }
}
