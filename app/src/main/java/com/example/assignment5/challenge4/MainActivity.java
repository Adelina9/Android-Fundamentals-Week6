package com.example.assignment5.challenge4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment5.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c4_activity_main);

        // Challenge 4 start
        StaticFragment staticFragment = (StaticFragment)getSupportFragmentManager().findFragmentById(R.id.staticFragmentChallenge4);
        staticFragment.setTextTextView("Message sent with methods");
        // Challenge 4 end
    }
}