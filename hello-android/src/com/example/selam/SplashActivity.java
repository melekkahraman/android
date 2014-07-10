package com.example.selam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * Created by melek on 10.07.2014.
 */
public class SplashActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
    }
    public void goster(View view) {

        final TextView yaz = (TextView) findViewById(R.id.merhaba);
        yaz.setText(getString(R.string.button));
    }


}





