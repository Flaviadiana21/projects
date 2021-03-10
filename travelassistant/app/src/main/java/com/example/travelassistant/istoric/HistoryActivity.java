package com.example.travelassistant.istoric;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.travelassistant.MainActivity;
import com.example.travelassistant.R;
import com.example.travelassistant.reguli.Trip;

public class HistoryActivity extends AppCompatActivity {

    TextView location_1;
    TextView period_1;
    TextView points_1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        if (MainActivity.trips.getTrips().size() == 1) {
            Trip trip = MainActivity.trips.getTrips().get(0);

            location_1 = findViewById(R.id.location_1);
            period_1 = findViewById(R.id.period_1);
            points_1 = findViewById(R.id.points_1);

            location_1.setGravity(Gravity.CENTER);
            period_1.setGravity(Gravity.CENTER);
            points_1.setGravity(Gravity.CENTER);

            location_1.setText("To: " + trip.getCountry() + "\nFrom: Romania");
            period_1.setText("Start Date: " + trip.getStartDate() + "\nEnd Date: " + trip.getEndDate());
            points_1.setText("10\n");
        }
    }
}
