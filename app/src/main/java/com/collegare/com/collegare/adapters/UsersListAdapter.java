package com.collegare.com.collegare.adapters;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.collegare.com.collegare.R;
import com.collegare.com.collegare.activities.MessageRoom;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.models.CollegareContact;
import com.collegare.com.collegare.models.CollegareWallMessageModel;
import com.collegare.com.collegare.textUtils.TimeManager;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ankit on 6/30/2016.
 */
public class UsersListAdapter extends ArrayAdapter<CollegareContact> {

    private Context context;
    private static UsersListAdapter mInstance;
    private ArrayList<CollegareContact> contacts;

    public UsersListAdapter(Context context) {
        super(context, 0);
        this.context = context;
        contacts = new ArrayList<>();
    }


    public static UsersListAdapter getInstance(Context context){
        if(mInstance==null){
            mInstance=new UsersListAdapter(context);
        }
        return mInstance;
    }


    public void setMessageList(final ArrayList<CollegareContact> contacts){
        this.contacts = contacts;
        notifyDataSetInvalidated();
    }


    @Override
    public View getView(final int position , View container , ViewGroup parent){

        View tempView = LayoutInflater.from(context).inflate(R.layout.contact_layout,null,false);

        TextView lblUsername;
        ImageView contact_user_tag_img;
        LinearLayout block;

        lblUsername = (TextView) tempView.findViewById(R.id.contact_username);
        contact_user_tag_img = (ImageView) tempView.findViewById(R.id.contact_user_tag_img);
        block = (LinearLayout) tempView.findViewById(R.id.msg_wall_block);

        block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_id = contacts.get(position).userId;
                Intent intent = new Intent(context,MessageRoom.class);
                intent.putExtra("user_id", user_id);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);


            }
        });

        // binding data
        lblUsername.setText(contacts.get(position).username);
        return tempView;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

}
