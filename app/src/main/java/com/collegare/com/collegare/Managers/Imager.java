package com.collegare.com.collegare.Managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by RadhePC on 19-11-2015.
 */
public class Imager {

    Context context;
    private static Imager bInstance;

    public Imager(Context context) {
        this.context = context;
        bInstance = this;
    }

    public static Imager getInstance(Context context) {
        if (bInstance == null) {
            bInstance = new Imager(context);
        }
        return bInstance;
    }

    public void saveFullImage(Bitmap bmp) {
        ContextWrapper cw = new ContextWrapper(context);

        File fileDir = cw.getDir("proPic", Context.MODE_PRIVATE);
        File file = new File(fileDir, "pro.jpg");
        FileOutputStream os = null;

        try {
            os = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, os);
            Log.e("image","written to im");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SessionManager.setProPicPath(fileDir.getAbsolutePath());
    }


    public void saveImage(Bitmap bmp) {
        ContextWrapper cw = new ContextWrapper(context);

        File fileDir = cw.getDir("proPic", Context.MODE_PRIVATE);
        File file = new File(fileDir, "pro.jpg");
        FileOutputStream os = null;

        try {
            os = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, os);
            Log.e("image","written to im");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SessionManager.setProPicPath(fileDir.getAbsolutePath());
    }


    public Bitmap getFullImage() {
        Bitmap bitmap = null;
        String path = null;
        if (!(path = SessionManager.getProPicPath()).equals("null")) {
            File file = new File(path, "pro.jpg");
            try {

                bitmap = BitmapFactory.decodeStream(new FileInputStream(file));
                Log.e("Image Read","from im");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }

    public Bitmap getImage() {
        Bitmap bitmap = null;
        String path = null;
        if (!(path = SessionManager.getProPicPath()).equals("null")) {
            File file = new File(path, "pro.jpg");
            try {

                bitmap = BitmapFactory.decodeStream(new FileInputStream(file));
                Log.e("Image Read","from im");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }

    public boolean isProfileImageAvailable() {
        Log.e("image status>>",!SessionManager.getProPicPath().equals("null")+"");
        return (!SessionManager.getProPicPath().equals("null"));
    }

    public boolean isImageAvailable(){
        Log.e("image status>>",!SessionManager.getPicPath().equals("null")+"");
        return (!SessionManager.getPicPath().equals("null"));
    }
}
