package com.example.mycalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class StressFragment extends Fragment {

    ImageButton imageButton;
    Button StressButton;
    Button ViewStressHistory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_stress, container, false);
        imageButton = view.findViewById(R.id.HomeButt);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Home = new Intent(getActivity(),MainActivity.class);
                startActivity(Home);
            }
        });

        View recordstress =  inflater.inflate(R.layout.fragment_stress, container, false);
        StressButton = view.findViewById(R.id.record_stress_button);
        StressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goSleepRecord = new Intent(getActivity(),Record_Stress.class);
                startActivity(goSleepRecord);
            }
        });

        View stress_history =  inflater.inflate(R.layout.fragment_food, container, false);
        ViewStressHistory = view.findViewById(R.id.stress_history_button);
        ViewStressHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goSleepHistory = new Intent(getActivity(),Stress_History.class);
                startActivity(goSleepHistory);
            }
        });

        return view;}
}

