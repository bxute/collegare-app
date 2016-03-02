package com.collegare.com.collegare.Managers;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ArrayRes;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.collegare.com.collegare.Models.CollegareComment;
import com.collegare.com.collegare.Models.CollegareGroup;
import com.collegare.com.collegare.R;

import java.io.PipedOutputStream;
import java.util.ArrayList;

import static com.collegare.com.collegare.R.drawable.user_pic;

/**
 * Created by Patel on 11/1/2015.
 */
public class NavigationDrawerRecyclerViewAdapter extends RecyclerView.Adapter<NavigationDrawerRecyclerViewAdapter.GroupsViewHolder> {

    private static int Selected;
    Context context;

    SessionManager sessionManager;
    ArrayList<CollegareGroup> groupsList;
    ArrayList<View> itemsViews;
    DrawerLayout drawerLayout;
    NavigationListener navigationListeners;
    public static NavigationDrawerRecyclerViewAdapter bInstance;
    public NavigationDrawerRecyclerViewAdapter(Context context,DrawerLayout drawerLayout,NavigationListener listeners){
        this.navigationListeners=listeners;
        this.context=context;
        groupsList=new ArrayList<>();
        itemsViews= new ArrayList<>();
        bInstance=this;
        this.drawerLayout=drawerLayout;
      //  this.groupsList=list;
    }
    public NavigationDrawerRecyclerViewAdapter(Context context){

        this.context=context;
        sessionManager= new SessionManager(context);
    }
    public static NavigationDrawerRecyclerViewAdapter getInstance(Context context){
        if(bInstance==null){
            Selected=1;
            bInstance= new NavigationDrawerRecyclerViewAdapter(context);
        }
        return bInstance;
    }
    public void setGroupsList(ArrayList<CollegareGroup> glist){
        this.groupsList=glist;
    }

    class GroupsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView gName;
        ImageView gIcon;
        View view;
        public GroupsViewHolder(View itemView) {
            super(itemView);
          //  Log.e("ABC viewHolder","called ");
            gName=(TextView) itemView.findViewById(R.id.grpName);
            gIcon=(ImageView) itemView.findViewById(R.id.grpIcon);
            gName.setOnClickListener(this);
            gIcon.setOnClickListener(this);
            view=itemView.findViewById(R.id.group);

            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            int currentPostion=getAdapterPosition();
            //Log.e(" aaa whitening "+Selected," th item");
            if(Selected!=currentPostion) itemsViews.get(Selected).setBackgroundColor(Color.WHITE);
            //Log.e("aaa pre >> " + Selected, "selected");
            Selected=currentPostion;
            itemsViews.get(Selected).setBackgroundColor(Color.LTGRAY);
            //Log.e("aaa now >> " + Selected, "selected");
               navigationListeners.LoadData(groupsList.get(currentPostion).GroupID);
              //  Log.e("aaa clicked ", " " + groupsList.get(currentPostion).Title);
                drawerLayout.closeDrawer(Gravity.LEFT);

        }
    }

    @Override
    public NavigationDrawerRecyclerViewAdapter.GroupsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      //  Log.e("ABC create ViewHolder", "called ");
       return new GroupsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_group_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(GroupsViewHolder holder, int position) {

        String selectedPos=sessionManager.getLastGroup();
        if(groupsList.get(position).GroupID.equals(selectedPos)){
        //    Log.e("[]pos rest "," "+selectedPos);
            holder.view.setBackgroundColor(Color.LTGRAY);
        }
          holder.gName.setText(groupsList.get(position).Title);
           holder.gIcon.setImageResource(R.drawable.user_pic);
            itemsViews.add(position,holder.view);
        //Log.e("ABC binder", "called >"+ position);
    }

    @Override
    public int getItemCount() {
     return  groupsList.size();


    }


}
