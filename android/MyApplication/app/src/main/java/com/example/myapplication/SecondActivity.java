package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    int clickCount1 = 0;
    int clickCount2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(getApplicationContext(), "Start App", Toast.LENGTH_LONG).show();

        findViewById(R.id.testButton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount1 = clickCount1 + 1;

                if(clickCount1 % 2 ==0){
                    Toast.makeText(getApplicationContext(), "클릭수:" + clickCount1, Toast.LENGTH_SHORT).show();
                }else if(clickCount1 % 3 == 0){
                    Toast.makeText(getApplicationContext(), "3의 배수", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "암것도 아임", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount2 = clickCount2 + 1;

                if(clickCount2 % 2 ==0){
                    Toast.makeText(getApplicationContext(), "클릭수:" + clickCount2, Toast.LENGTH_SHORT).show();
                }else if(clickCount2 % 3 == 0){
                    Toast.makeText(getApplicationContext(), "3의 배수", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "암것도 아임", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}