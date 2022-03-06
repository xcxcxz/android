package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv: TextView;
    lateinit var mp: MediaPlayer;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mp = MediaPlayer.create(this, R.raw.sample)
        mp.isLooping=false


        tv = this.findViewById(R.id.hellobutton)
        tv.setOnClickListener(View.OnClickListener {

            if(!mp.isPlaying){
                mp.start()
                tv.setText("Stop")
            }else{
                mp.pause()
                tv.setText("Start")
            }


        })

    }
}