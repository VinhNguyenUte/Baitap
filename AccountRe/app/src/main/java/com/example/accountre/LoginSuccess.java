package com.example.accountre;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginSuccess extends AppCompatActivity {

    private TextView textViewUsername;
    private TextView textViewPassword;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_success);

        // Áp dụng WindowInsets để hỗ trợ hiển thị toàn màn hình
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Lấy các thành phần UI
        textViewUsername = findViewById(R.id.textViewUsername);
        textViewPassword = findViewById(R.id.textViewPassword);

        // Lấy dữ liệu từ Intent
        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        // Hiển thị dữ liệu
        textViewUsername.setText("Username: " + username);
        textViewPassword.setText("Password: " + password);
    }
}
