package com.deguzman.clarissehelaine;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class CustomServ extends IntentService {
    public CustomServ(){
        super("CustomServ");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Lab5", "The Service is running");

    }
}