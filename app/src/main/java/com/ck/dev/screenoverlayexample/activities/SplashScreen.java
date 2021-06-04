package com.ck.dev.screenoverlayexample.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.ck.dev.screenoverlayexample.R;
import com.ck.dev.screenoverlayexample.config.Config;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash_screen);
    } // onCreate

    /*
   Contain View initiations.
    */
    private void initView() {
        Config.LOG(Config.TAG_SPLASH_SCREEN, "Started Splash Activity.", false);
        // Delay the opening of the next activity by 1 second.
        new Handler().postDelayed(this::startNextActivity, 1000);
    } // initView

    /*
    Call the next activity to begin.
     */
    private void startNextActivity() {
        startActivity(new Intent(SplashScreen.this, HomeScreen.class));
        finish();
    } // startNextActivity

}