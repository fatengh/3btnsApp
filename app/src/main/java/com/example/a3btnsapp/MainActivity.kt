package com.example.a3btnsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var edToast:EditText
    private lateinit var edTv:EditText
    private lateinit var edNewAct:EditText

    private lateinit var btnToast:Button
    private lateinit var btnTV:Button
    private lateinit var btnNewAct:Button

    private lateinit var tvOutput:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edToast = findViewById(R.id.edToast)
        edTv = findViewById(R.id.edTextView)
        edNewAct = findViewById(R.id.edNewAct)

        btnToast = findViewById(R.id.btnToast)
        btnTV = findViewById(R.id.btnTV)
        btnNewAct = findViewById(R.id.btnNewActv)

        tvOutput = findViewById(R.id.tvOutput)

        btnToast.setOnClickListener {
            Toast.makeText(applicationContext,"${edToast.text}", Toast.LENGTH_LONG).show()
        }

        btnTV.setOnClickListener {
            tvOutput.text = edTv.text
        }

        btnNewAct.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(AlarmClock.EXTRA_MESSAGE,"${edNewAct.text}" )
            startActivity(intent)
        }


    }
}