package com.collegare.com.collegare.notifications;
/**
 * Created by Radhe on 02-03-2016.
 */
public class GCMIntentServices{
    // method called once the device successfully registered with GCM
    protected void onRegistered(){}

    // called when a new message arrived to device
    protected void onMessage(){}

    // called when device is unregistered with GCM services
    protected void onUnregistered(){}

    // On receiving an error
    public void onError(){}

    // method to generate a notification
    private static void generateNotification(){}

}
