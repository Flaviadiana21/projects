package com.example.travelassistant.Forum;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.travelassistant.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ForumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
    }

    public void goSeeQuestion(View view) {

        Intent intent = new Intent (this, QuestionActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detailed_menu_forum, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.users) {
            Intent intent2 = new Intent(this, TopUsersActivity.class);
            startActivity(intent2);
            return true;
        }
        else if( id == R.id.hotQuestions)
        {
            Intent intent3 = new Intent(this, HotQuestionsActivity.class);
            startActivity(intent3);
            return true;
        }

        return false;
    }


}
