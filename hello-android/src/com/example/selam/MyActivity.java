package com.example.selam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.content.Intent;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);




        Thread thread = new Thread() {

            @Override
            public void run() {


                try {
                    synchronized (this) {
                        // Uygulama 3 saniye aynı ekranda bekliyor
                        wait(3000);

                    }
                } catch (InterruptedException e) {

                    // Hata yönetimi

                } finally {
                    startActivity(new Intent(getApplicationContext(),SplashActivity.class));




                    // Yeni açılmak istenen Intent


                }

            }

        };
        thread.start();

        // Thread başlatılıyor






    }







}
