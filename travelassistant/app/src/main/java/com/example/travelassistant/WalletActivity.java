package com.example.travelassistant;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class WalletActivity extends AppCompatActivity {

    private ImageView mImageView;
    private List<String> items = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
        Spinner dropdown = findViewById(R.id.spinner1);

        items.add("UNICREDIT TIRIAC BANK");
        items.add("BANCA COMERCIALA ROMANA");
        items.add("UNICREDIT TIRIAC BANK");

        //String[] items = new String[]{"BANCA COMERCIALA ROMANA", "BANCA TRANSILVANIA", "UNICREDIT TIRIAC BANK"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if(selectedItemText=="UNICREDIT TIRIAC BANK") {
                    mImageView = (ImageView) findViewById(R.id.imageViewId);
                    mImageView.setImageResource(R.drawable.card1);
                    mImageView.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            goRankActivity();
                        }
                    });
                }
                if(selectedItemText=="BANCA TRANSILVANIA"){
                    mImageView = (ImageView) findViewById(R.id.imageViewId);
                    mImageView.setImageResource(R.drawable.card2);
                }
                if(selectedItemText=="BANCA COMERCIALA ROMANA") {
                    mImageView = (ImageView) findViewById(R.id.imageViewId);
                    mImageView.setImageResource(R.drawable.card3);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mImageView = (ImageView) findViewById(R.id.imageViewId);
                mImageView.invalidate();
            }
        });

    }

    public void goRankActivity() {
        Intent intent2 = new Intent (this, CardDetailsActivity.class);
        startActivity(intent2);
    }

    public void addNewCard(View view){
        final EditText inputEditText = new EditText(this);
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("New Card")
                .setMessage("Add a new card...")
                .setView(inputEditText)
                .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String editTextInput = inputEditText.getText().toString();
                        items.add(editTextInput);
                    }
                })
                .setNegativeButton("Cancel", null)
                .create();
        dialog.show();
    }

}
