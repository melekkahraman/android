package com.example.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
/**
 * Created by melek on 10.07.2014.
 */
public class SplashActivity extends Activity {

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
                    Intent i = new Intent(getBaseContext(),main.class);
                    startActivity(i);
                }
            }
        };


        thread.start();


    }



    }



