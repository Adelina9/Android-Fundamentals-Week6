package com.example.assignment5.challenge5;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.assignment5.R;

public class MainActivity extends AppCompatActivity implements TheListener {

    private TextView textView;

    // Challenge 5
    @Override
    public void printMessage(String message) {
        textView.setText(message);
    }
    // Challenge 5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c5_activity_main);
        textView = findViewById(R.id.textViewChallenge5MainActivity);

        Fragment dynamicFragment = new DynamicFragment();
        openFragment(dynamicFragment);
    }

    public void openFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.containerChallenge5,fragment);
        ft.commit();
    }
}