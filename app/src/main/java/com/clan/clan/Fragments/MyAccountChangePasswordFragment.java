package com.clan.clan.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.clan.clan.Activities.MainActivity;
import com.clan.clan.R;

/**
 * Created by K on 2/21/2018.
 */

public class MyAccountChangePasswordFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_myaccountchangepassword,container,false);
        Button btnsubmitnewpassword = (Button) view.findViewById(R.id.ButtonSubmitChangePassword);
        btnsubmitnewpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getActivity(), MainActivity.class);
                startActivity(home);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Change Password");
    }
}
