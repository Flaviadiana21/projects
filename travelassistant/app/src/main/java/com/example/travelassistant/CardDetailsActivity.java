package com.example.travelassistant;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class CardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_details);

        PieChartView pieChartView = findViewById(R.id.chart);
        List<SliceValue> pieData = new ArrayList<>();
        pieData.add(new SliceValue(15, Color.BLUE).setLabel("Restante: $280"));
        pieData.add(new SliceValue(25, Color.GRAY).setLabel("Mancare: $40"));
        pieData.add(new SliceValue(10, Color.RED).setLabel("Chirie: $180"));
        pieData.add(new SliceValue(60, Color.MAGENTA).setLabel("Altele: $180"));
        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(15);
        pieChartData.setHasCenterCircle(true).setCenterText1("Card Activity").setCenterText1FontSize(30).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView.setPieChartData(pieChartData);

    }
}
