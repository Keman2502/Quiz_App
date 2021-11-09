package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    TextView tvScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        tvScore = findViewById(R.id.showScore);

        Bundle extras = getIntent().getExtras();
        String value = extras.getString("key");

        tvScore.setText(value);


    }
}