package com.example.myapplication88

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val start_calc = findViewById<Button>(R.id.b_start)
        start_calc.setOnClickListener{
            val perehod = Intent(this, calc::class.java )
            startActivity(perehod)
        }


    }
}