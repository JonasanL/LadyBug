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


public class PorfileFragment extends Fragment {
    ImageButton imageButton;

    Button CycleButton;
    Button ViewCycleHistory;
    Button EditProfile;
    Button ViewStatusHistory;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);
        imageButton = view.findViewById(R.id.HomeButt);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Home = new Intent(getActivity(),MainActivity.class);
                startActivity(Home);
            }
        });

        View recordcycle =  inflater.inflate(R.layout.fragment_profile, container, false);
        CycleButton = view.findViewById(R.id.cycle_record_button);
        CycleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCycleRecord = new Intent(getActivity(),Record_Cycle.class);
                startActivity(goCycleRecord);
            }
        });

        View cycle_history =  inflater.inflate(R.layout.fragment_profile, container, false);
        ViewCycleHistory = view.findViewById(R.id.cycle_history_button);
        ViewCycleHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCycleHistory = new Intent(getActivity(),Cycle_History.class);
                startActivity(goCycleHistory);
            }
        });

        View edit_profile =  inflater.inflate(R.layout.fragment_profile, container, false);
        EditProfile = view.findViewById(R.id.EditProfileButt);
        EditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goUpdateProfile = new Intent(getActivity(),Update_Profile.class);
                startActivity(goUpdateProfile);
            }
        });

        View status_history =  inflater.inflate(R.layout.fragment_profile, container, false);
        ViewStatusHistory = view.findViewById(R.id.PastStatusButt);
        ViewStatusHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStatusHistory = new Intent(getActivity(),Status_History.class);
                startActivity(goStatusHistory);
            }
        });

        return view;}
}
