package com.example.myapplication6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by sec on 2016-05-15.
 */
public class DetailActivity extends Activity{



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        TextView tvTitle = (TextView)findViewById(R.id.textView1);
        Intent intent = getIntent();
        tvTitle.setText(intent.getStringExtra("title"));

    }
}
