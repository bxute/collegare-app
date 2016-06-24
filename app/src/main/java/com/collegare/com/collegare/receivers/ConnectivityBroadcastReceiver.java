package com.collegare.com.collegare.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.collegare.com.collegare.handlers.TaskHandler;
import com.collegare.com.collegare.network.InternetManager;

/**
 * Created by Ankit on 6/24/2016.
 */
public class ConnectivityBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.e("ConReceiver"," network state changed");
        if(InternetManager.getInstance(context).isConnectedToNet()){
            TaskHandler.getInstance(context).activateTaskHandler();
        }else{
            TaskHandler.getInstance(context).deactivateTaskHandler();
        }

    }
}
