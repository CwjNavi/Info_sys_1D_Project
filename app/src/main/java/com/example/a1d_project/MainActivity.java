package com.example.a1d_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goto_alljourneys(View view){
        // go to all journeys
        Intent i = new Intent(this, AllJourneysActivity.class);
        startActivity(i);
    }
}

