package com.collegare.com.collegare.Converters;

/**
 * Created by Radhe on 12-04-2016.
 */
public class ColorConverter {

    public static final String PINK="#e91e63";
    public static final String RED="#f44336";
    public static final String PURPLE="#9c27b0";
    public static final String DPURPLE="#673ab7";
    public static final String INDIGO="#3f51b5";
    public static final String BLUE="#2196f3";
    public static final String TEAL="#009688";
    public static final String DEEPORANGE="#ff5722";
    public static final String GRAY="#616161";
    public static final String BGRAY="#607d8b";


    public String[] colorSeq={PINK,PURPLE,RED,TEAL,DPURPLE,BLUE,GRAY,BGRAY,INDIGO,DEEPORANGE};

    public String getColor(int charCode){
        return colorSeq[charCode%11];
    }




}
