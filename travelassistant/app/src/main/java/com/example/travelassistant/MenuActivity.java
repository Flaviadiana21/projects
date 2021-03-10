package com.example.travelassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelassistant.Forum.ForumActivity;
import com.example.travelassistant.Rank.RankActivity;

public class MenuActivity extends AppCompatActivity {

    Integer level = 3;
    Integer progress = 32;
    Integer maxProgress = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        setProgressBarValue();
    }

    public void setProgressBarValue() {
        TextView levelTextView = findViewById(R.id.textView2);
        TextView progressTextView = findViewById(R.id.textView3);
        levelTextView.setText("Level " + level.toString());
        progressTextView.setText(progress + "/" + maxProgress);

        ProgressBar progressBar = findViewById(R.id.progressBar3);
        progressBar.setMax(maxProgress);
        progressBar.setProgress(progress);
    }


    public void goForumActivity(View view) {

        Intent intent = new Intent (this, ForumActivity.class);
        startActivity(intent);
    }

    public void goWalletActivity(View view){
        Intent intent = new Intent (this, WalletActivity.class);
        startActivity(intent);
    }

    public void goTransactionsActivity(View view) {
        Intent intent = new Intent(this, TransactionsActivity.class);
        startActivity(intent);
    }

    public void goRentCarActivity(View view) {
        Intent intent = new Intent(this, RentCarActivity.class);
        startActivity(intent);
    }


    public void goRankActivity(View view) {
            Intent intent2 = new Intent (this, RankActivity.class);
            startActivity(intent2);
    }


    public void news(View view) {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    public void profileMenu(View view) {
        Intent intent = new Intent(this, MyProfileMenuActivity.class);
        startActivity(intent);
    }
}

