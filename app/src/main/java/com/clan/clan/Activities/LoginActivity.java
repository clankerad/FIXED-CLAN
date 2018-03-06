package com.clan.clan.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.clan.clan.R;


public class LoginActivity extends AppCompatActivity {
    /*Start Inisialisasi Variable*/
    EditText EditTextUsernameUser,EditTextPasswordUser;
    Button ButtonLogin;
    TextView ButtonRegister;
    /*End Inisialisasi Variable*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inisialisasiViews();
        inisialisasiListeners();
    }


    private void inisialisasiViews(){
        EditTextPasswordUser = (EditText) findViewById(R.id.EditTextPasswordUser);
        EditTextUsernameUser = (EditText) findViewById(R.id.EditTextUsernameUser);
        ButtonLogin = (Button) findViewById(R.id.ButtonLogin);
        ButtonRegister = (TextView) findViewById(R.id.ButtonRegister);
    }

    private void inisialisasiListeners(){
        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });

        ButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterActivity = new Intent(LoginActivity.this, com.clan.clan.Activities.RegisterActivity.class);
                startActivity(RegisterActivity);
            }
        });
    }

}
