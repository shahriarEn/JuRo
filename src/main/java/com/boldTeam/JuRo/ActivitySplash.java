package com.boldTeam.JuRo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class ActivitySplash extends Activity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sharedPreferences=getSharedPreferences(getString(R.string.sharedP),MODE_PRIVATE);

        getData();
    }

    private void getData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (sharedPreferences.getBoolean(getString(R.string.isLogin),true)){
                    startActivity(new Intent(ActivitySplash.this,ActivityMain.class));
                    overridePendingTransition(R.anim.alpha_in,R.anim.alpha_out);
                    finish();
                    //go to Main
                }else{
                    //TODO:GO TO LOGIN
                }
            }
        }).start();

    }
}
