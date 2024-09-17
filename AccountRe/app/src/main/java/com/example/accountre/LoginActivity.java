package com.example.accountre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.inputEmail);
        editTextPassword = findViewById(R.id.inputPassword);

        // Xử lý sự kiện nút Sign Up
        TextView btnSignUp = findViewById(R.id.textViewSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        // Xử lý sự kiện nút Login
        Button btnLogin = findViewById(R.id.btn_Login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy dữ liệu từ EditText
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Tạo Intent để chuyển sang LoginSuccessActivity
                Intent intent = new Intent(LoginActivity.this, LoginSuccess.class);
                // Truyền dữ liệu qua Intent
                intent.putExtra("username", username);
                intent.putExtra("password", password);
                // Bắt đầu LoginSuccessActivity
                startActivity(intent);
            }
        });
    }
}
