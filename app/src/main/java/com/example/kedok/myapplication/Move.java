package com.example.kedok.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Move extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        TextView nameEmail = findViewById(R.id.txt_emailku);
        String EmailName = getIntent().getStringExtra("Nama Email Ku");
        nameEmail.setText(EmailName);

        TextView passEmail = findViewById(R.id.txt_passku);
        String PassEmailku = getIntent().getStringExtra("Password Email Ku");
        passEmail.setText(PassEmailku);

    }
}
