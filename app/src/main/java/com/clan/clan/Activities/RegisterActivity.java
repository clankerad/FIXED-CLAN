package com.clan.clan.Activities;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.clan.clan.R;

import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {

    Button ButtonRegister,ButtonPilihTanggalLahir;
    private int mYear,mMonth,mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        inisialisasiViews();
        inisialisasiListeners();
    }

    private void inisialisasiViews(){
        ButtonRegister = (Button) findViewById(R.id.ButtonRegister);
        ButtonPilihTanggalLahir = (Button) findViewById(R.id.ButtonPilihTanggalLahir);
    }
    private void inisialisasiListeners(){
        ButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent SnapIdActivity = new Intent(RegisterActivity.this, SnapIdActivity.class);
                startActivity(SnapIdActivity);
            }
        });

        ButtonPilihTanggalLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendar = Calendar.getInstance();
                mYear = calendar.get(Calendar.YEAR);
                mMonth = calendar.get(Calendar.MONTH);
                mDay = calendar.get(Calendar.DAY_OF_MONTH);

            }
        });
    }
}
