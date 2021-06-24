package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /** mainActivity 최초실행시 실행
    */
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //UI 세팅
        setContentView(R.layout.activity_main);
        //Toast 메세지
        Toast.makeText(getApplicationContext(), "프로그래밍 시작", Toast.LENGTH_LONG).show();
    }
}