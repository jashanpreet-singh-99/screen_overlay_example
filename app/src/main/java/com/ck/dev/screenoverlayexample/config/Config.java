package com.ck.dev.screenoverlayexample.config;

import android.util.Log;

public class Config {

    private static final boolean DEBUG = true;

    private static void LOG(String tag, String message, boolean error) {
        if (!DEBUG)
            return;
        if (error)
            Log.e(tag, message);
        else
            Log.d(tag, message);
    }

}
