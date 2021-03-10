package com.example.travelassistant;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        View newsByTopic = findViewById(R.id.news_by_topic);
        View newsByDestination = findViewById(R.id.news_by_destination);

        registerForContextMenu(newsByDestination);
        registerForContextMenu(newsByTopic);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v.getId() == R.id.news_by_topic) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_by_topic, menu);
        } else if (v.getId() == R.id.news_by_destination) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_by_destination, menu);
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menu_weather: {
                new AlertDialog.Builder(this)
                        .setTitle("Topic - Weather")
                        .setMessage("Today\n" +
                                "A mostly cloudy and blustery afternoon with outbreaks of rain spreading from the west, accompanied by brisk winds.\n" +
                                "\n" +
                                "Tonight\n" +
                                "Cloud and rain clearing quickly early this evening, leaving a dry night with clear periods and easing winds. Turning a little chillier than the last couple of nights.")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
                break;
            }
            case R.id.menu_culture: {
                new AlertDialog.Builder(this)
                        .setTitle("Topic - Culture")
                        .setMessage("Films to look forward to in 2020\n" +"\n" + "The Invisible Man\n" + "Wonder Woman 1984\n" +
                                "Soul\n" + "Top Gun: Maverick\n")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
                break;
            }
            case R.id.menu_sport: {
                new AlertDialog.Builder(this)
                        .setTitle("Topic - Sport")
                        .setMessage("37 games, 32 wins, 89 goals, 101 points -  Liverpool went year unbeaten in Premier League")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
                break;
            }
            case R.id.menu_political: {
                new AlertDialog.Builder(this)
                        .setTitle("Topic - Political")
                        .setMessage("Croatia's presidential election has been won by centre-left challenger Zoran Milanovic, who defeated the nationalist incumbent.\n")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
                break;
            }
            case R.id.menu_france: {
                new AlertDialog.Builder(this)
                        .setTitle("Destination - France")
                        .setMessage("Many train stations have been quiet across France as strikes against President Emmanuel Macron's pension reforms continue.\n" +
                                "\n" +
                                "Hundreds of flights and trains have  been cancelled")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
                break;
            }
            case R.id.menu_spain: {
                new AlertDialog.Builder(this)
                        .setTitle("Destination - Spain")
                        .setMessage("Rescue efforts are underway after record rainfall caused flooding in south-eastern Spain.\n" +
                                "\n" +
                                "Thousands of police, fire-fighters and soldiers have been sent out to help people who've been affected.")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
                break;
            }
            case R.id.menu_italy: {
                new AlertDialog.Builder(this)
                        .setTitle("Destination - Italy")
                        .setMessage("The Leaning Tower of Pisa is now stable and straightened (well, a little bit) thanks to work by engineers trying to save Italy's famous building.")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
                break;
            }
            case R.id.menu_china: {
                new AlertDialog.Builder(this)
                        .setTitle("Destination - China")
                        .setMessage("Harbin International Ice and Snow Sculpture Festival in China\n" + "\n" + "This is the 36th time the festival has taken place and it will last from 5 January until the end of February 2020.")
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .show();
                break;
            }
        }
        return true;
    }
}
