package com.example.travelassistant.reguli;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.travelassistant.MainActivity;
import com.example.travelassistant.R;

public class AddTravelActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    String[] countries = {"France", "Spain", "Italy", "China"};
    Button nextButton;
    int country;
    String[] messages = {"Be sure to say “please” and “thank you” often, and always thank people for their time. If you need help at a shop, apologize to the staff for bothering them with a question, and be sure to thank them before you leave. Make sure that you chew with your mouth closed during meals, don’t speak when your mouth is full, and for goodness’ sake, don’t slurp anything!",
            "Spaniards eat late\n Shops may close in the middle of the day\nSpaniards are snappy dressers\nPickpockets can be a problem",
            "Dress formally and respectably in churches and upscale restaurants, and ensure that your table manners are impeccable. Be punctual, always be generous with social niceties, and under no circumstances should you ever be drunk in public. Say “please” often, and if possible, try to make at least a bit of an effort to learn a few Italian words and phrases.",
            "Be generous with saying “thank you” when someone does anything from pouring you tea to offering you a gift, and if or when you receive a gift, take it with both hands. If someone makes a comment about your weight/appearance/idiosyncrasy, try not to take it as offensive: it’s merely an observation on their part."};
    Context context;
    CalendarView startDateCalendar;
    CalendarView endDateCalendar;

    String startDate;
    String endDate;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_travel);

        spinner = (Spinner) findViewById(R.id.countries_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, countries);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        nextButton = findViewById(R.id.next_button);

        context = this;

        startDateCalendar = findViewById(R.id.start_date_calendar);
        endDateCalendar = findViewById(R.id.end_date_calendar);

        startDateCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                month++;
                startDate = dayOfMonth + "/" + month + "/" + year;
            }
        });

        endDateCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                month++;
                endDate = dayOfMonth + "/" + month + "/" + year;
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        country = position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void nextButton(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Good to know for " + countries[country])
                .setMessage(messages[country])
                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Trip trip = new Trip(countries[country], startDate, endDate);
                        MainActivity.trips.getTrips().add(trip);
                    }
                })
                .show();
    }
}
