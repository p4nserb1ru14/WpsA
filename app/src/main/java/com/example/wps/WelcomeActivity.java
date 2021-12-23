package com.example.wps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        AppCompatButton btnLogin = findViewById(R.id.btn_welcom);
        btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(WelcomeActivity.this, LoginPageActivity.class);
            startActivity(intent);
        });
    }
}