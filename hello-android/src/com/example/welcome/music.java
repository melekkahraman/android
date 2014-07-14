package com.example.welcome;

/**
 * Created by melek on 14.07.2014.
 */

import java.io.IOException;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.KeyEvent;


public class music extends Activity {

    MediaPlayer mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
    }

    public void baslat(View view) {
        mPlayer = MediaPlayer.create(music.this, R.raw.yazaskim);
        mPlayer.start();


    }


    public void durdur(View view) {

        mPlayer.stop();


    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            if (mPlayer != null) {
                mPlayer.stop();

            }
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    }



