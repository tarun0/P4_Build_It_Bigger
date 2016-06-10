package com.example.androidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainJokeActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);

        TextView textView = (TextView) findViewById(R.id.joke);
        intent = getIntent();
        textView.setText(intent.getStringExtra("joke"));
    }
}
