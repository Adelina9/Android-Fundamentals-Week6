package com.example.assignment5.challenge5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.assignment5.R;

public class DynamicFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.c5_fragment_dynamic, container, false);
        // Challenge 5 start
        Button buttonSendNumbers = view.findViewById(R.id.buttonSendNumbers);

        buttonSendNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // getActivity helps us to have access to the parent activity
                TheListener listener = (TheListener) getActivity();

                // this method call helps to send data from fragment to the parent activity
                assert listener != null;
                listener.printMessage("Message sent by listener");
            }
        });
        // Challenge 5 end

        return view;
    }
}

