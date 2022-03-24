package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.randomCard).setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            intent.putIntegerArrayListExtra("result", ArrayList(LottoNumberMaker.getShuffleLottoNumbers()))

            startActivity(intent)
        }
        findViewById<View>(R.id.constellationCard).setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        findViewById<View>(R.id.nameCard).setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
    }
    fun getRandomLottoNumber(): Int{
        return Random().nextInt(45) + 1
    }


    fun getRandomLottoNumbers(): MutableList<Int>{
        val lottoNumbers = mutableListOf<Int>()

        for(i in 1..6){
            lottoNumbers.add(getRandomLottoNumber())
            var number = 0
            do{
                number = getRandomLottoNumber()
            }while (lottoNumbers.contains(number))

            lottoNumbers.add(number)
        }

        return lottoNumbers
    }



    fun getShuffleLottoNumber(): MutableList<Int>{
        val list = mutableListOf<Int>()
        for(number in 1..45){
            list.add(number)
        }
        list.shuffle()

        return list.subList(0, 6)
    }
}