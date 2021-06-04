package com.ck.dev.screenoverlayexample.config;

import android.util.Log;

public class Config {

    private static final boolean DEBUG = true;

    public static final String TAG_SPLASH_SCREEN = "message_activity_splash_screen";
    public static final String TAG_HOME_SCREEN   = "message_activity_home_screen";

    public static void LOG(String tag, String message, boolean error) {
        if (!DEBUG)
            return;
        if (error)
            Log.e(tag, message);
        else
            Log.d(tag, message);
    }

}
