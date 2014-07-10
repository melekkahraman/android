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
        setContentView(R.layout.main);
    }


        public void goster(View view) {
            final TextView yaz = (TextView) findViewById(R.id.merhaba);
            yaz.setText(getString(R.string.button));

    }

}

