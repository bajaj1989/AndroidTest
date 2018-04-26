package com.example.test.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message=intent.getStringExtra(EXTRA_MESSAGE);
        TextView tv = (TextView) findViewById(R.id.message);
        tv.setText(message);
    }
}
