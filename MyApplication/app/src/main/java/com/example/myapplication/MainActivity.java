package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    int clickCount = 0;

    /** mainActivity 최초실행시 실행
    */
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //UI 세팅
        setContentView(R.layout.activity_main);
        //Toast 메세지
        Toast.makeText(getApplicationContext(), "프로그래밍 시작", Toast.LENGTH_LONG).show();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount = clickCount +  1;

                String text = "";

                for(int i=0; i<clickCount;i++){
                    if(i>= 3){
                        break;
                    }
                    text = text + "HIHI";
                }
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        });

    }
}