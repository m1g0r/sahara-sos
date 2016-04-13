package com.example.m1g0r.myapplication;

import android.app.Application;
import android.util.Log;
import android.view.ViewConfiguration;

import java.lang.reflect.Field;

public class App extends Application {

    private static final String TAG = "Log";

    @Override
    public void onCreate() {
        super.onCreate();
        makeActionOverflowMenuShown();
    }

    private void makeActionOverflowMenuShown() {
        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            Log.d(TAG, e.getLocalizedMessage());
        }
    }
}