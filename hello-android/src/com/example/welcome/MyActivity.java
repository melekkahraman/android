package com.example.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.content.ContentResolver;
import android.provider.Settings;

public class MyActivity extends Activity {
    private String[] dizi = {"splash", "button"};

    /**
     * Called when the activity is first created.
     */
   


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ListView listemiz = (ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> veriAdaptoru = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, dizi);
        listemiz.setAdapter(veriAdaptoru);

        listemiz.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 0:
                        Intent i = new Intent(getBaseContext(), SplashActivity.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent m = new Intent(getBaseContext(), main.class);
                        startActivity(m);


                }
            }
        });


    }

}









