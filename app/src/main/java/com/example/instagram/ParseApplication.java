package com.example.instagram;

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
                .applicationId("O0m5mhoxJKxiz7WOl98gc0SPUtSE5BaZ2qlQiK6R")
                .clientKey("lrSh0r9uztYKSSIeypvspHpY17plM3YWt4tLxPrv")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
