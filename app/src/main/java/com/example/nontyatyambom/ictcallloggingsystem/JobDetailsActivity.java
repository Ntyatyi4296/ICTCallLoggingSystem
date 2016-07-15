package com.example.nontyatyambom.ictcallloggingsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Nontyatyambom on 2016/07/11.
 */
public class JobDetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newjob);

        Button btn = (Button)findViewById(R.id.btnSubmit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(JobDetailsActivity.this,MyJobActivity.class);
                startActivity(i);
            }
        });


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("CurrentInfo");

            String [] items = value.split(",");

            //The key argument here must match that used in the other activity
            EditText et = (EditText)findViewById(R.id.txtTitle);
            et.setText(items[0]);

            EditText et2 = (EditText)findViewById(R.id.txtLocation);
            et2.setText(items[1]);

        }

    }
}
