package com.example.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class Ejercicio1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        val countdownText = findViewById<TextView>(R.id.countdown_text)
        object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                countdownText.text = "Quedan: ${millisUntilFinished / 1000} segundos"
            }

            override fun onFinish() {
                val intent = Intent(this@Ejercicio1, Ejercicio1Terminado::class.java)
                startActivity(intent)
            }
        }.start()
    }
}