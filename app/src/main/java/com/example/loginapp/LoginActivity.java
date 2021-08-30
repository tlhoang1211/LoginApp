package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edUser;
    private EditText edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUser = findViewById(R.id.edUser);
        edPassword = findViewById(R.id.edPassword);
        Button btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btLogin) {
            onLogin();
        }
    }

    private void onLogin() {
        if (edUser.getText().toString().isEmpty() || edPassword.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter username and password!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra("USER_NAME", edUser.getText().toString());
            startActivity(intent);
        }
    }
}