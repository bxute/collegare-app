package com.collegare.com.collegare.Managers;

/**
 * Created by Vishal on 03-10-2015.
 */
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.collegare.com.collegare.Fragments.Messages;
import com.collegare.com.collegare.Fragments.Feeds;

/**
 * Created by Vishal on 29-09-2015.
 */
public class BPagerAdapter extends FragmentStatePagerAdapter {
    int tabCount;

    public BPagerAdapter(FragmentManager fm,int tabCount){
        super(fm);
        this.tabCount=tabCount;



    }
    @Override
    public Fragment getItem(int position) {
        switch(position){

            case 0:
                Feeds groups= new Feeds();
                return groups;
            case 1:
                Messages anonymous= new Messages();
                return anonymous;

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
