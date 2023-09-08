package com.example.pollution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class difficulty_activity extends AppCompatActivity {
    ImageButton home_btn;
    Button low_btn, medium_btn, high_btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficulty_activity);

        home_btn = findViewById(R.id.home_btn);
        low_btn = findViewById(R.id.low_btn);
        medium_btn = findViewById(R.id.medium_btn);
        high_btn = findViewById(R.id.high_btn);

        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        low_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), low_1_activity.class);
                startActivity(intent);
            }
        });
        medium_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), medium_1_activity.class);
                startActivity(intent);
            }
        });
        high_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), high_1_activity.class);
                startActivity(intent);
            }
        });

    }
}
