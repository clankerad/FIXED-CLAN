package com.clan.clan.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.clan.clan.R;

public class SmokerStatusNo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoker_status_no);
    }

    public void PageRefferalCode(View view){
        Intent pageRefferalCode = new Intent(this, RefferalCode.class);
        startActivity(pageRefferalCode);
    }
}
