package com.collegare.com.collegare.models;

/**
 * Created by Ankit on 6/23/2016.
 */
public class CollegareTask {

    public String taskID;
    public String payload;
    public String receiver;
    public String timeStamp;

    public CollegareTask(String taskID, String payload, String receiver,String timeStamp){

        this.taskID = taskID;
        this.payload = payload;
        this.receiver = receiver;
        this.timeStamp = timeStamp;
    }

}
