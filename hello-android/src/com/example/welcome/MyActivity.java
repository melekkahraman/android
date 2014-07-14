package com.example.welcome;

import android.app.Activity;
import android.app.ListActivity;
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
import android.widget.Toast;


import java.util.List;

public class MyActivity extends ListActivity {
    private String[] dizi = {"splash", "button","müzik"};

    /**
     * Called when the activity is first created.
     */


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(MyActivity.this, android.R.layout.simple_list_item_1, dizi));
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
        switch (position) {
            case 0:
                Intent i = new Intent(getBaseContext(), SplashActivity.class);
                startActivity(i);
                break;
            case 1:
                Intent m = new Intent(getBaseContext(), main.class);
                startActivity(m);

            case 2:
                Intent n = new Intent(getBaseContext(), music.class);
                startActivity(n);



        }
    }
}












