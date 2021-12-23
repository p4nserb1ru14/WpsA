package com.example.wps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class LoginPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        AppCompatButton btnRegsiter = findViewById(R.id.btn_register);
        btnRegsiter.setOnClickListener(view -> {
            Intent intent = new Intent(LoginPageActivity.this, RegisterPageActivity.class);
            startActivity(intent);
        });
    }
}