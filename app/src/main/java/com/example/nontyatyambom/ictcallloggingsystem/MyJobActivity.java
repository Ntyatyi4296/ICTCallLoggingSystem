package com.example.nontyatyambom.ictcallloggingsystem;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Nontyatyambom on 2016/07/11.
 */

public class MyJobActivity extends Activity {

    static final String[] FRUITS = new String[] { "Install Microsoft, Office 123", "Collect Old PC, Office 321", "Network point not working, Office 333",
            "Install Microsoft PPT, Office 444", "Collect Old PC, Office 555","Install Microsoft, Office 123", "Collect Old PC, Office 321", "Network point not working, Office 333",
            "Install Microsoft PPT, Office 444", "Collect Old PC, Office 555","Install Microsoft, Office 123" };

    String  itemValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listjobs);

        final ListView lv = (ListView) findViewById(R.id.listjobs);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, FRUITS);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub
                int itemPosition     = position;

                // ListView Clicked item value
                itemValue    = (String) lv.getItemAtPosition(position);

                Intent i = new Intent(MyJobActivity.this,JobDetailsActivity.class);
                i.putExtra("CurrentInfo",itemValue);
                startActivity(i);


            }
        });
    }
}
