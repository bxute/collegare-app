package com.collegare.com.collegare.models;

/**
 * Created by Radhe on 05-03-2016.
 */
public class CollegarePollOption {
    public String tagValue ,optionValue, pollId;
    public CollegarePollOption(){}
    public CollegarePollOption(String tagValue,String optionValue,String pollId){
        this.tagValue=tagValue;
        this.optionValue=optionValue;
        this.pollId=pollId;
    }
}
