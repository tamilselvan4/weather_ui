package com.example.myapplication;

import static com.example.myapplication.R.color.ic_launcher_background;
import static com.example.myapplication.R.color.top_bar;
import static com.example.myapplication.R.color.white;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.menu_bar,menu);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(top_bar)));
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.detailed_info){
            Intent intent = new Intent(MainActivity.this,detailed_info.class);
            startActivity(intent);
        }
        if (item.getItemId()==R.id.atmosphere_info){
            Intent intent = new Intent(MainActivity.this,atmosphere_info.class);
            startActivity(intent);
        }
        if (item.getItemId()==R.id.hourly_info){
            Intent intent = new Intent(MainActivity.this,hourly_info.class);
            startActivity(intent);
        }
        if (item.getItemId()==R.id.future_forecast){
            Intent intent = new Intent(MainActivity.this,future_forecast.class);
            startActivity(intent);
        }
        if (item.getItemId()==R.id.temperature_graph){
            Intent intent = new Intent(MainActivity.this,temperature_graph.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}