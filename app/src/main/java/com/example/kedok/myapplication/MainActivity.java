package com.example.kedok.myapplication;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText emiailku, passku;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emiailku = (EditText) findViewById(R.id.email);
        passku = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move = new Intent(MainActivity.this,Move.class);
                startActivity(move);

            }
        });


    }
}
