package com.example.assignment5.challenge4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.assignment5.R;

public class StaticFragment extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.c4_fragment_static, container, false);
        return view;
    }

    // Challenge 4 start
    public void setTextTextView(String text) {
        TextView textView = view.findViewById(R.id.textViewChallenge4StaticFragment);
        textView.setText(text);
    }
    // Challenge 4 end
}
