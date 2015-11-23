package com.collegare.com.collegare.Managers;

import java.util.ArrayList;

/**
 * Created by RadhePC on 10-11-2015.
 */
public class Segmentor {

    /*
    *
    *       return ArrayList of constituents part of String Seperated by  {seperator}
    *
    * */
    public ArrayList<String> getParts(String str, char seperator) {
        ArrayList<String> all = new ArrayList<>();
        getAll(str, seperator, all);
        return all;
    }

    String getAll(String str, char seperator, ArrayList<String> list) {
        if (str.indexOf(seperator) == -1) {
            list.add(str);
            return str;
        } else {
            list.add(str.substring(0, str.indexOf(seperator)));
            return getAll(str.substring(str.indexOf(seperator) + 1), seperator,
                    list);
        }
    }

}