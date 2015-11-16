package com.collegare.com.collegare.Managers;

/**
 * Created by RadhePC on 10-11-2015.
 */
public class TimeManager {

    static TimeManager bInstance;
    public TimeManager(){}

    public static TimeManager getInstance() {
        if(bInstance==null){
            bInstance=  new TimeManager();
        }
        return bInstance;
    }

        String convert(String curr,String past){
            String result="";
            //parsing current time
            int Cyear=Integer.parseInt(curr.substring(0,4));
            int Cmonth=Integer.parseInt(curr.substring(5, 7));
            int Cdate=Integer.parseInt(curr.substring(8, 10));
            int Chour=Integer.parseInt(curr.substring(11, 13));
            int Cminute=Integer.parseInt(curr.substring(14, 16));
            int Csecond=Integer.parseInt(curr.substring(17,19));
            // parsing past time
            int Pyear=Integer.parseInt(past.substring(0,4));
            int Pmonth=Integer.parseInt(past.substring(5, 7));
            int Pdate=Integer.parseInt(past.substring(8, 10));
            int Phour=Integer.parseInt(past.substring(11, 13));
            int Pminute=Integer.parseInt(past.substring(14, 16));
            int Psecond=Integer.parseInt(past.substring(17,19));

            if(Cyear==Pyear){
                if(Cmonth==Pmonth){
                    if(Cdate==Pdate){
                        if(Chour==Phour){
                            if(Cminute==Pminute)
                            {
                                if(Csecond==Psecond){
                                    result="Now";
                                }else{

                                    result=" "+(Csecond-Psecond)+" Sec";
                                }
                            }else{
                                result=" "+(Cminute-Pminute)+" Min";
                            }
                        }else{
                            result=" "+(Chour-Phour)+" Hrs";
                        }
                    }else{
                        int diff=Cdate-Pdate;
                        if(diff>=7)
                            result=" "+(diff/7)+" Wks";
                        else
                            result=" "+(Cdate-Pdate)+" Dys";
                    }

                }else{
                    result=" "+(Cmonth-Pmonth)+" Mth";
                }
            }else{
                result=" "+(Cyear-Pyear)+" Yrs";
            }

            return result;
        }
    }

