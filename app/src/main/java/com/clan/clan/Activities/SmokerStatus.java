package com.clan.clan.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.clan.clan.R;

public class SmokerStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoker_status);
    }

    public void PageSmokerStatusNo(View view){
        Intent  pageSmokerStatusNo = new Intent(this, SmokerStatusNo.class);
        startActivity(pageSmokerStatusNo);
    }

    public void PageSmokerStatusYes(View view){
        Intent  pageSmokerStatusYes = new Intent(this, SmokerStatusYes.class);
        startActivity(pageSmokerStatusYes);
    }

}
