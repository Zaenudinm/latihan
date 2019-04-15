package com.example.kedok.myapplication;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText emailku, passku;
    Button login;
    String TAG = "Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailku = (EditText) findViewById(R.id.email);
        passku = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email_key = emailku.getText().toString();
                Log.d(TAG, email_key);

                String pass_key = passku.getText().toString();
                Log.d(TAG, pass_key);

                if (email_key.equals("latihan_modul_3") && pass_key.equals("123masuk")){
                    Intent move = new Intent(MainActivity.this,Move.class);
                    move.putExtra("Nama Email Ku", email_key);
                    move.putExtra("Password Email Ku", pass_key);
                    startActivity(move);
                }else {
                    AlertDialog.Builder builder =  new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Email & Password Anda Salah").setNegativeButton("coba lagi",null).create().show();

                }


            }
        });


    }
}
