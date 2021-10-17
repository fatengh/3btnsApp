package com.example.a3btnsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val msg = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)

        val tv = findViewById<TextView>(R.id.tv).apply {
            text = msg
        }
    }
}