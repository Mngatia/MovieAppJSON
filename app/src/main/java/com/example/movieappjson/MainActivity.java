package com.example.movieappjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //1. JSON link on Internet https://run.mocky.io/v3/ee97f344-d177-489b-8630-08ede9439b41
    private static String JSON_URL = "https://run.mocky.io/v3/ee97f344-d177-489b-8630-08ede9439b41";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
