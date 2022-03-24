package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val editText = findViewById<EditText>(R.id.editText)

        findViewById<View>(R.id.goButton).setOnClickListener {

            if(TextUtils.isEmpty(editText.text.toString())){
                Toast.makeText(applicationContext, "이름을 입력하세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, ResultActivity::class.java)

            intent.putIntegerArrayListExtra("result", ArrayList(LottoNumberMaker.getLottoNumbersFromHash(editText.text.toString())))

            intent.putExtra("name", editText.text.toString())

            startActivity(intent)
        }
        findViewById<View>(R.id.backButton).setOnClickListener {
            finish()
        }
    }

    fun getLottoNumbersFromHash(name: String): MutableList<Int>{
        val list = mutableListOf<Int>()

        for (number in 1.. 45){
            list.add(number)
        }

        val targetString = SimpleDateFormat("yyyy-MM-dd", Locale.KOREA).format(Date()) + name

        list.shuffle(Random(name.hashCode().toLong()))

        return list.subList(0, 6)
    }
}