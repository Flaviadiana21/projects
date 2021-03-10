package com.example.travelassistant.Rank;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.example.travelassistant.R;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ShopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
    }

    public void offer1(View view)
    {
        new AlertDialog.Builder(this)
                .setTitle("Are you sure?" )
                .setIcon(R.drawable.medal)
                .setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlertDialog alert2 = new AlertDialog.Builder(ShopActivity.this)
                                .setTitle("Congratulations! ")
                                .setIcon(R.drawable.smile)
                                .setMessage("You've bought an item!")
                                .setNeutralButton("Exit", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                })
                                .show();
                    }})
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }})
                .show();

    }

    public void offer2(View view)
    {
        new AlertDialog.Builder(this)
                .setTitle("Are you sure?" )
                .setIcon(R.drawable.medal)
                .setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlertDialog alert2 = new AlertDialog.Builder(ShopActivity.this)
                                .setTitle("Sorry! ")
                                .setIcon(R.drawable.sad)
                                .setMessage("Not enough points to buy this item.")
                                .setNeutralButton("Exit", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                })
                                .show();
                    }})
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }})
                .show();

    }

}

