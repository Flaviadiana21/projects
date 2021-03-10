package com.example.travelassistant;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RentCarDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_car_details);
    }

    public void rentCar(View view){
        new AlertDialog.Builder(RentCarDetailsActivity.this)
                .setTitle("Car rented successfully!")
                .setMessage("Your reservation has been made! You will be notified before your reservation starts.")
                .setPositiveButton(android.R.string.ok, null)
                .setIcon(android.R.drawable.btn_plus)
                .show();
    }
}
