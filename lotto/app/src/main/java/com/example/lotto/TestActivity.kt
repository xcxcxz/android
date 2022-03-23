package com.example.lotto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        // Kotlin 에서는 Android Extension 덕분에 findViewById 없이 바로 접근이 가능
        // 버튼과 같은 View 가 클릭되었을때 실행될 listener를 등록하는 메소드 = setOnClickListener
        findViewById<View>(R.id.button).setOnClickListener {
            //MainActivity를 시작하는 Intent를 생성
            val intent = Intent(this@TestActivity, MainActivity::class.java)
            //intent를 사용하여 Activity를 시작
            startActivity(intent)
        }

        //CONSTELLATION ACTIVITY 버튼을 누른경우 동작하는 이벤트 리스너를 등록.
        findViewById<View>(R.id.button2).setOnClickListener {
            //ConstellationActivity를 시작하는 Intent를 생성
            val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
            //intent를 사용하여 Activity를 시작
            startActivity(intent)
        }
        findViewById<View>(R.id.button3).setOnClickListener {
            //NameActivity를 시작하는 Intent를 생성
            val intent = Intent(this@TestActivity, NameActivity::class.java)
            //intent를 사용하여 Activity를 시작
            startActivity(intent)
        }
        findViewById<View>(R.id.button4).setOnClickListener {
            //ResultActivity를 시작하는 Intent를 생성
            val intent = Intent(this@TestActivity, ResultActivity::class.java)
            //intent를 사용하여 Activity를 시작
            startActivity(intent)
        }

        findViewById<View>(R.id.button26).setOnClickListener {
            val intent = Intent(this@TestActivity, RelativeActivity::class.java)
            startActivity(intent)

        }
    }

    fun goConstellation(view: View) {
        val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
        startActivity(intent)
    }
    fun callWeb(view: View){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))
        startActivity(intent)
    }

}