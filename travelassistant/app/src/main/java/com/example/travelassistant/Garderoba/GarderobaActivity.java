package com.example.travelassistant.Garderoba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelassistant.R;
import com.example.travelassistant.Rank.DetailsActivity;

import androidx.appcompat.app.AppCompatActivity;

public class GarderobaActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garderoba);
    }

    public void goMakeCarry(View view){
        Intent intent = new Intent(this, MakeActivity.class);
        startActivity(intent);
    }

    public void goMakeChecked(View view)
    {
        Intent intent = new Intent(this, MakeActivity.class);
        startActivity(intent);
    }
}
