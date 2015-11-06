package com.example.apandey.simplechat;

import android.app.Application;

import com.example.apandey.simplechat.model.Message;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by apandey on 11/5/15.
 */
public class ChatApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "PzXbaE3ZeWFYT5cJhMcaerPggQKNj8m6npk9EXqs";
    public static final String YOUR_CLIENT_KEY = "Ga65B0dJyXkE5fs6Nkqq04oeHIMbpmF5zqn183FP";
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Message.class);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }
}