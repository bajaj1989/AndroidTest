package com.example.test.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBeerFinder(View view){
        TextView tv = (TextView) findViewById(R.id.brands);
        Spinner s = (Spinner) findViewById(R.id.color);
        String message = String.valueOf(s.getSelectedItem());
        /*Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(SecondActivity.EXTRA_MESSAGE,message);
        startActivity(intent);*/
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        startActivity(intent);
    }
}
