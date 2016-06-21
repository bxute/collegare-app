package com.collegare.com.collegare.Activity;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.collegare.com.collegare.Managers.DatabaseManager;
import com.collegare.com.collegare.Managers.MessageRoomAdapter;
import com.collegare.com.collegare.Models.CollegareMessage;
import com.collegare.com.collegare.R;

import java.util.ArrayList;

public class MessageRoom extends AppCompatActivity {

    String user_id;
    RecyclerView msg_thread;
    MessageRoomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_room);
        user_id = getIntent().getExtras().getString("user_id");
        msg_thread = (RecyclerView) findViewById(R.id.msgRoomMessageRV);
        adapter = MessageRoomAdapter.getInstance(this);
        msg_thread.setLayoutManager(new LinearLayoutManager(this));
        msg_thread.setAdapter(adapter);

        DatabaseManager.getInstance(this).setOnNewMessageAdditionListener(new DatabaseManager.NewMessageListener() {
            @Override
            public void onMessageAdd() {
                Load();
            }
        });

    }

    @Override
    protected void onResume(){
        super.onResume();
        Load();
        markThemAsRead();
    }



    public void Load(){
        ArrayList<CollegareMessage> msgs = DatabaseManager.getInstance(this).getMessages(user_id);
        adapter.setMessageDataList(msgs);
    }

    public void markThemAsRead(){
        DatabaseManager.getInstance(this).setMessageRead(user_id);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_message_room, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
