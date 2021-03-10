package com.example.travelassistant.Rank;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.travelassistant.Forum.HotQuestionsActivity;
import com.example.travelassistant.Forum.QuestionActivity;
import com.example.travelassistant.Forum.TopUsersActivity;
import com.example.travelassistant.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class RankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detailed_menu_ranking, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.details) {
            Intent intent2 = new Intent(this, DetailsActivity.class);
            startActivity(intent2);
            return true;
        }
        else if( id == R.id.shop)
        {
            Intent intent3 = new Intent(this, ShopActivity.class);
            startActivity(intent3);
            return true;
        }

        return false;
    }

}
