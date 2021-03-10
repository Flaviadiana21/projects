package com.example.travelassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RentCarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_car);

    }

    public void goRentCarDetailsActivity(View view) {
        Intent intent = new Intent(this, RentCarDetailsActivity.class);
        startActivity(intent);
    }
}
