package com.example.brunchfast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
    }
    public void register(View view)
    {
        startActivity(new Intent(LoginActivity.this,RegistrationActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(LoginActivity.this,MainActivity.class));

    }
}
