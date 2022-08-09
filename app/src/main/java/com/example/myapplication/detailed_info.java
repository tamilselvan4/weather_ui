package com.example.myapplication;

import static com.example.myapplication.R.color.top_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class detailed_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_info);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(top_bar)));
    }
}