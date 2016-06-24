package com.collegare.com.collegare.fragments;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.collegare.com.collegare.R;

/**
 * Created by RadhePC on 11-11-2015.
 */
public class SendDailoge extends Dialog {

    public SendDailoge(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_dialog_layout);

    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
    }


    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);


    }

}