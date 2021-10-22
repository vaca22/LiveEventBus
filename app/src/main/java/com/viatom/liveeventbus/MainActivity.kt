package com.viatom.liveeventbus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.lifecycle.Observer
import com.jeremyliao.liveeventbus.LiveEventBus




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LiveEventBus
            .get("fuckx", String::class.java)
            .observeForever(Observer<String>{
                Log.e("fuck",it)
            })

        Handler().postDelayed({

            LiveEventBus
                .get("fuckx", String::class.java)
                .post("fuck")

        },3000)

    }
}