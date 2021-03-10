package com.example.travelassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.travelassistant.Garderoba.GarderobaActivity;
import com.example.travelassistant.istoric.HistoryActivity;
import com.example.travelassistant.reguli.AddTravelActivity;

public class MyProfileMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_menu);
    }

    public void addTravel(View view) {
        Intent intent = new Intent(this, AddTravelActivity.class);
        startActivity(intent);
    }

    public void history(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    public void goGarderobaActivity(View view)
    {
        Intent intent3 = new Intent (this, GarderobaActivity.class);
        startActivity(intent3);
    }

}
