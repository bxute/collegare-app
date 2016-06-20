package com.collegare.com.collegare.Managers;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.NotificationCompat;

import com.collegare.com.collegare.R;

/**
 * Created by Ankit on 6/20/2016.
 */
public class LocalNotificationManager {

    public static LocalNotificationManager mInstance;
    private static Context context;
    private int mNotificationId=0;
    public LocalNotificationManager(){}

    public LocalNotificationManager(Context context){
        this.context = context;
    }

    public static LocalNotificationManager getInstance(Context context){
        if(mInstance==null){
            mInstance = new LocalNotificationManager(context);
        }
        return mInstance;
    }

    public void launchNotification(String user , String msg){

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context);
        mBuilder.setSmallIcon(R.drawable.send1);
        mBuilder.setContentTitle(user);
        mBuilder.setContentText(msg);

        this.mNotificationId +=1;

        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(mNotificationId , mBuilder.build());
    }



}
