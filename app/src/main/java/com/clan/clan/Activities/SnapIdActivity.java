package com.clan.clan.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.clan.clan.R;

public class SnapIdActivity extends AppCompatActivity {
    Button ButtonCompleteRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snap_id);

        inisialisasiViews();
        inisialisasiListeners();
    }

    private void inisialisasiViews(){
        ButtonCompleteRegister = (Button) findViewById(R.id.ButtonCompleteRegister);
    }

    private void inisialisasiListeners(){
       ButtonCompleteRegister.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent smokerStatus = new Intent(SnapIdActivity.this,SmokerStatus.class);
               startActivity(smokerStatus);
           }
       });
    }
}
