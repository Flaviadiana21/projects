package com.example.travelassistant;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class TransactionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);
    }

    public void generateTransactions(View view){
        new AlertDialog.Builder(TransactionsActivity.this)
                .setTitle("Generating transactions...")
                .setMessage("Wait for an admin to confirm your request!")
                .setPositiveButton(android.R.string.ok, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
        EditText edt = (EditText)findViewById(R.id.reason);
        edt.setText("");
        final LinearLayout lnr = (LinearLayout)findViewById(R.id.container);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                new AlertDialog.Builder(TransactionsActivity.this)
                        .setTitle("Confirmation")
                        .setMessage("Transactions successfully generated!")
                        .setPositiveButton(android.R.string.ok, null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
                lnr.setVisibility(View.VISIBLE);
            }
        }, 5000);
    }
}
