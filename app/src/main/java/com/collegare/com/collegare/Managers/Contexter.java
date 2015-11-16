package com.collegare.com.collegare.Managers;

import android.app.Application;
import android.content.Context;

/**
 * Created by RadhePC on 13-11-2015.
 */
public class Contexter extends Application {

    public Context getContext(){
        return getBaseContext();
    }
}
