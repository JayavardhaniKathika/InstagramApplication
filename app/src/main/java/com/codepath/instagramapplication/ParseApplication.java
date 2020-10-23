package com.codepath.instagramapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6x0D5zW2ll272gKUizavQfmrMjKWl50sneojUKQ3")
                .clientKey("zZI3A81AoHaqILgfHRhm33zUdZea43y5tLVTlJeD")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
