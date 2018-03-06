package com.clan.clan.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.clan.clan.Activities.LoginActivity;
import com.clan.clan.Activities.MainActivity;
import com.clan.clan.R;

/**
 * Created by K on 2/21/2018.
 */

public class MyAccountFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_myaccount,container,false);
        Button ButtonTest = (Button) view.findViewById(R.id.ButtonTest);
        ButtonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment changePasswordFragment = new MyAccountChangePasswordFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.content_frame,changePasswordFragment);
                //transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("My Account");

    }
}