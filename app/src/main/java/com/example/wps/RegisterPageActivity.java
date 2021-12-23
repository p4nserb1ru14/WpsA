package com.example.wps;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class RegisterPageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton imageButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        AppCompatButton btnLogin = findViewById(R.id.btn_login_register_page);
        btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(RegisterPageActivity.this, LoginPageActivity.class);
            startActivity(intent);
        });
        imageButton = findViewById(R.id.backspace_register_page);
        imageButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}