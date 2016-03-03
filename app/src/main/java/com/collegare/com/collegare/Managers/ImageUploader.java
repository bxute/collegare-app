package com.collegare.com.collegare.Managers;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.collegare.com.collegare.Models.CollegareUser;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Radhe on 03-03-2016.
 */
public class ImageUploader {

    private static ImageUploader bInstance;
    private Context context;
    public ImageUploader(){}

    public ImageUploader(Context context){
        this.context=context;
    }

    public static ImageUploader getInstance(Context c)
    {
        if(bInstance==null){
            bInstance= new ImageUploader(c);
        }
        return bInstance;
    }

    public String getStringImage(Bitmap bmp){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] imageBytes = baos.toByteArray();
        String encodedImage = Base64.encodeToString(imageBytes, Base64.DEFAULT);
        return encodedImage;
    }

    public void Upload( final Bitmap bmp){


        StringRequest upReq= new StringRequest(StringRequest.Method.POST, App_Config.USER_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("IU",s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        }){@Override
            protected Map<String ,String> getParams() {
            CollegareUser user= DatabaseManager.getInstance(new Contexter().getContext()).getUser();
            Map<String ,String > valuse= new HashMap<>();
            String img= getStringImage(bmp);
            Log.e("IU","img string>"+img);
            valuse.put("action","setpic");
            valuse.put("id",user.id);
            valuse.put("token",user.token);


            return valuse;
        }
        };

    AppManager.getInstance().addToRequestQueue(upReq,"imgreq",context);
    }

}
