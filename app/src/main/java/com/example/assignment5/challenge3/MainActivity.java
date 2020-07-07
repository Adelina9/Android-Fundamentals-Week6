package com.example.assignment5.challenge3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.assignment5.R;

public class MainActivity extends AppCompatActivity {

    public final static String KEY = "key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3_activity_main);

        Fragment dynamicFragment = new DynamicFragment();
        openFragment(dynamicFragment);

        // Challenge 3 start
        Bundle bundle = new Bundle();
        bundle.putString(KEY, "Message sent with bundle");
        dynamicFragment.setArguments(bundle);
        // Challenge 3 end
    }

    public void openFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container,fragment);
        ft.commit();
    }

}