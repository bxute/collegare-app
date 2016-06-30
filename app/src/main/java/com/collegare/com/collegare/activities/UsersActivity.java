package com.collegare.com.collegare.activities;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.collegare.com.collegare.R;
import com.collegare.com.collegare.adapters.UsersListAdapter;
import com.collegare.com.collegare.database.DatabaseManager;
import com.collegare.com.collegare.models.CollegareContact;

import java.util.ArrayList;

public class UsersActivity extends AppCompatActivity {

    ListView usersListView;
    UsersListAdapter adapter;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        setContentView(R.layout.activity_users);
       // getSupportActionBar().setTitle("Users");
        adapter = UsersListAdapter.getInstance(this);
        usersListView  = (ListView) findViewById(R.id.listViewContact);
        usersListView.setAdapter(adapter);


    }

    @Override
    protected void onResume() {
        super.onResume();

        subscribeToListener();
        testInjectContacts();


    }

    public void testInjectContacts(){

        ArrayList<CollegareContact> contacts = new ArrayList<>();
        contacts.add(new CollegareContact("201451054", "Ankit Kumar"));
        contacts.add(new CollegareContact("201451099", "Bipin"));
        contacts.add(new CollegareContact("201451098", "Ajit"));
        contacts.add(new CollegareContact("201451026","Ravi"));
        contacts.add(new CollegareContact("201451040","Patel"));
        contacts.add(new CollegareContact("201451049", "Rajeev"));

        for (CollegareContact c : contacts) {
            DatabaseManager.getInstance(this).addContact(c);
        }


    }

    public void subscribeToListener(){
        DatabaseManager.getInstance(this).setOnNewContactAddListener(new DatabaseManager.NewContactAddListener() {
            @Override
            public void onContactAdded() {
                // get all users from db and notify adapter with new set of users
                adapter.setMessageList(DatabaseManager.getInstance(UsersActivity.this).getContacts());

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_users, menu);
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

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
