package com.collegare.com.collegare.Activity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.collegare.com.collegare.R;
public class EditProfile extends AppCompatActivity implements View.OnClickListener {

    ImageView proImage;
    TextView emailDisplay;
    ImageView editEmailImg,saveEmailImg;
    EditText editEmailBox;
    LinearLayout editHolder,displayHolder;

    Toolbar toolbar;

    TextView contactDisplay;
    ImageView editContactImg,saveContactImg;
    EditText editContactBox;
    LinearLayout editcontactHolder,displayContactHolder;

    TextView bioDisplay;
    ImageView editBioImg,saveBioImg;
    EditText editBioBox;
    LinearLayout editBioHolder,displayBioHolder;

    RelativeLayout proImageLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        proImage= (ImageView) findViewById(R.id.image);
        emailDisplay= (TextView) findViewById(R.id.Email);
        editEmailImg= (ImageView) findViewById(R.id.editEmailImage);
        saveEmailImg= (ImageView) findViewById(R.id.saveEmail);
        editEmailBox= (EditText) findViewById(R.id.emailEditBox);
        editHolder= (LinearLayout) findViewById(R.id.editEmailHolder);
        displayHolder= (LinearLayout) findViewById(R.id.displayEmailHolder);

        contactDisplay= (TextView) findViewById(R.id.Contact);
        editContactImg= (ImageView) findViewById(R.id.editContactImage);
        saveContactImg= (ImageView) findViewById(R.id.saveContact);
        editContactBox= (EditText) findViewById(R.id.contactEditBox);
        editcontactHolder= (LinearLayout) findViewById(R.id.editContactHolder);
        displayContactHolder= (LinearLayout) findViewById(R.id.displayContactHolder);


        bioDisplay= (TextView) findViewById(R.id.Bio);
        editBioImg= (ImageView) findViewById(R.id.editBioImage);
        saveBioImg= (ImageView) findViewById(R.id.saveBio);
        editBioBox= (EditText) findViewById(R.id.bioEditBox);
        editBioHolder= (LinearLayout) findViewById(R.id.editBioHolder);
        displayBioHolder= (LinearLayout) findViewById(R.id.displayBioHolder);

        proImageLayout= (RelativeLayout) findViewById(R.id.changeImageBtn);



        Log.e("sa img"," "+saveEmailImg);
        Log.e("ed img", " " + editEmailImg);
        proImageLayout.setOnClickListener(this);

        saveEmailImg.setOnClickListener(this);
        editEmailImg.setOnClickListener(this);

        saveContactImg.setOnClickListener(this);
        editContactImg.setOnClickListener(this);

        saveBioImg.setOnClickListener(this);
        editBioImg.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id=view.getId();

        switch (id)
        {

            case R.id.changeImageBtn :
                                changeImage();
                break;

            case R.id.saveEmail:
                                editHolder.setVisibility(View.GONE);
                                displayHolder.setVisibility(View.VISIBLE);
                                emailDisplay.setText(editEmailBox.getText().toString());
                break;
            case R.id.editEmailImage:
                            editHolder.setVisibility(View.VISIBLE);
                            displayHolder.setVisibility(View.GONE);
                            editEmailBox.setText(emailDisplay.getText().toString());
                break;

            case R.id.saveContact:
                            editcontactHolder.setVisibility(View.GONE);
                            displayContactHolder.setVisibility(View.VISIBLE);
                              contactDisplay.setText(editContactBox.getText().toString());
                break;
            case R.id.editContactImage:
                                editcontactHolder.setVisibility(View.VISIBLE);
                                displayContactHolder.setVisibility(View.GONE);
                editContactBox.setText(contactDisplay.getText().toString());
                break;

            case R.id.saveBio:
                                    editBioHolder.setVisibility(View.GONE);
                                    displayBioHolder.setVisibility(View.VISIBLE);
                bioDisplay.setText(editBioBox.getText().toString());
                break;
            case R.id.editBioImage:
                                    editBioHolder.setVisibility(View.VISIBLE);
                                    displayBioHolder.setVisibility(View.GONE);
                editBioBox.setText(bioDisplay.getText().toString());
                break;

        }

    }

    private void changeImage() {

        Intent intent= new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode==1 && resultCode==RESULT_OK){
            Uri Selectionuri=data.getData();
            String[] pathCols={MediaStore.Images.Media.DATA};
            Cursor cursor= getContentResolver().query(Selectionuri, pathCols, null, null, null);
            cursor.moveToFirst();
            String path=cursor.getString(cursor.getColumnIndex(pathCols[0]));
            cursor.close();
            Log.e("path"," "+path);
            proImage.setImageBitmap(BitmapFactory.decodeFile(path));


        }

    }
}
