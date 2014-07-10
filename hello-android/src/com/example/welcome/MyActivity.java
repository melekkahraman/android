package com.example.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);




        Thread thread = new Thread() {

            @Override
            public void run() {


                try {
                    synchronized (this) {
                        // Uygulama 3 saniye aynı ekranda bekliyor
                        wait(3000);
                        finish();

                    }
                }catch (Exception e) {

                }
                finally {
                    Intent i = new Intent(getBaseContext(), SplashActivity.class);
                    startActivity(i);
                }
            }
        };


        thread.start();


    }


    }





