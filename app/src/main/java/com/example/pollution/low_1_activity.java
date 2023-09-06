package com.example.pollution;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class low_1_activity extends AppCompatActivity {
    Button answer;
    ImageButton home_btn, back_btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.low_1_layout);

        answer = findViewById(R.id.answer_btn);
        home_btn = findViewById(R.id.home_btn2);
        back_btn = findViewById(R.id.back_btn);

        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    public void OnClick_low_1_wrong(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialogTheme);

        builder.setMessage("초_설명서_1");

        builder.setPositiveButton("다시 풀기", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = builder.show();
        alertDialog.setTitle("오답");
        TextView messageText = (TextView)alertDialog.findViewById(android.R.id.message);
        messageText.setTextSize(40);
        messageText.setTextColor(Color.BLACK);
        alertDialog.show();
    }
    public void OnClick_low_1_answer(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialogTheme);

        builder.setMessage("정답입니다!!");

        builder.setPositiveButton("다음 문제", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Intent intent = new Intent(getApplicationContext(), low_2_activity.class);
                startActivity(intent);
            }
        });

        AlertDialog alertDialog = builder.show();
        alertDialog.setTitle("축하합니다!");
        TextView messageText = (TextView)alertDialog.findViewById(android.R.id.message);
        messageText.setTextSize(40);
        messageText.setTextColor(Color.BLACK);
        alertDialog.show();
    }
}
