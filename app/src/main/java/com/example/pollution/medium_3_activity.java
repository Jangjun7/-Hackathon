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

public class medium_3_activity extends AppCompatActivity {
    Button answer;
    ImageButton home_btn, back_btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medium_3_layout);

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
    public void OnClick_medium_3_wrong(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialogTheme);

        builder.setMessage("중_설명서_3");

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
    public void OnClick_medium_3_answer(View view)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialogTheme);

        builder.setMessage("당신은 중수(중) 난이도에 모든 스테이지를 클리어하였습니다!\n다음 난이도에 도전하세요!");

        builder.setPositiveButton("다음난이도", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Intent intent = new Intent(getApplicationContext(), high_1_activity.class);
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
