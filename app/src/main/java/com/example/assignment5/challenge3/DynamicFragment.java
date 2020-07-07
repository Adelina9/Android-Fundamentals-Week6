package com.example.assignment5.challenge3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.assignment5.R;


public class DynamicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.c3_fragment_dynamic, container, false);
        // Challenge 3 start
        Bundle bundle = getArguments();
        String value = bundle.getString(MainActivity.KEY);
        TextView textView = view.findViewById(R.id.textView1Challenge3DynamicFragment);
        textView.setText(value);
        // Challenge 3 end

        return view;
    }
}
