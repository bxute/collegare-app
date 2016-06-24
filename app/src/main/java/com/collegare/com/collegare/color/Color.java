package com.collegare.com.collegare.color;

import android.util.Log;

import java.util.Random;

/**
 * Created by Ankit on 17-03-2016.
 */
public class Color  {

    public Color(){}
    public String getColor(){
        int min=0;
        int max=6;
        String colorCode="";
        int random= new Random().nextInt(max-min+1)+min;
        Log.e("color Rand",""+random);
        switch (random){
            case 0:
                colorCode="#ef5350";
                break;
            case 1:
                colorCode="#ec407a";
                break;
            case 2:
                colorCode="#5e35b1";
                break;
            case 3:
                colorCode="#00bcd4";
                break;
            case 4:
                colorCode="#43a047";
                break;
            case 5:
                colorCode="#757575";
                break;
            case 6:
                colorCode="#ff5722";
                break;
            default:
                colorCode="#009988";
                break;
        }
        return colorCode;
    }
}
