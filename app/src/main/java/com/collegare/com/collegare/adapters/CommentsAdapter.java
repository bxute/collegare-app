package com.collegare.com.collegare.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.collegare.com.collegare.textUtils.TimeManager;
import com.collegare.com.collegare.models.CollegareComment;
import com.collegare.com.collegare.R;

import java.util.ArrayList;

/**
 * Created by G on 11/13/2015.
 */
public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.CommentHolder> {

    ArrayList<CollegareComment> comments;
    Context context;
    private static CommentsAdapter bInstance;
    public CommentsAdapter (Context c){this.context=c;bInstance=this;comments=new ArrayList<>();}

    public CommentsAdapter(Context context,ArrayList<CollegareComment> list){
        this.comments=list;
        this.context=context;
    }

    public static CommentsAdapter getInstance(Context context){
        if(bInstance==null){
            bInstance=new CommentsAdapter(context);
        }
        return bInstance;
    }


    public void addComment(CollegareComment collegareComment){
        comments.add(0,collegareComment);
        notifyItemInserted(0);
    }

    public void setComments(ArrayList<CollegareComment> list){
        comments = list;
        notifyDataSetChanged();
    }

    @Override
    public CommentHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_single_layout,parent,false);

        return new CommentHolder(view);


    }

    @Override
    public void onBindViewHolder(CommentHolder holder, int position) {

        String past= TimeManager.getInstance().getDifference("2014-12-03 12:13:45", comments.get(position).doc);
        holder.content.setText(comments.get(position).content);
        holder.commentUser.setText(comments.get(position).username);
        holder.pastTime.setText(past);
        Log.e("binding art "," "+position);
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    public class CommentHolder extends RecyclerView.ViewHolder {

        TextView  commentUser;
        TextView pastTime;
        TextView content;
        public CommentHolder(View itemView) {
            super(itemView);
            commentUser= (TextView) itemView.findViewById(R.id.commentUser);

            content= (TextView) itemView.findViewById(R.id.commentContent);

            pastTime= (TextView) itemView.findViewById(R.id.passTime);

        }
    }
}
