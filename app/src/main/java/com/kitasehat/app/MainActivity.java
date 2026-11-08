package com.kitasehat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMulai = findViewById(R.id.btnMulai);
        btnMulai.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BerandaActivity.class);
            startActivity(intent);
        });
    }
}