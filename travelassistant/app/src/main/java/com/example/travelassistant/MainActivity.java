package com.example.travelassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static Trips trips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trips = new Trips();
    }

    public void login(View view) {
        Intent menuIntent = new Intent(this, MenuActivity.class);
        startActivity(menuIntent);
    }

}
