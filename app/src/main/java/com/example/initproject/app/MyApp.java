package com.example.initproject.app;

import android.app.Activity;
import android.app.Application;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 张先磊 on 2018/4/17.
 */

public class MyApp extends Application {
    public static List<Activity> activities = new LinkedList<>();
    @Override
    public void onCreate() {
        super.onCreate();
    }


    public static void exit() {
        for (Activity activity : activities) {
            activity.finish();
        }
        activities.clear();
        System.gc();
        System.exit(0);
    }
}
