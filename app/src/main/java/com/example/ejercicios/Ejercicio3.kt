package com.example.ejercicios

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio3 : AppCompatActivity() {
    private lateinit var greenLight: ImageView
    private lateinit var yellowLight: ImageView
    private lateinit var redLight: ImageView
    private var lightColor = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        greenLight = findViewById(R.id.green_light)
        yellowLight = findViewById(R.id.yellow_light)
        redLight = findViewById(R.id.red_light)

        val handler = Handler(Looper.getMainLooper())
        handler.post(object : Runnable {
            override fun run() {
                when (lightColor) {
                    0 -> {
                        greenLight.setImageResource(R.drawable.green_light)
                        yellowLight.setImageResource(0)
                        redLight.setImageResource(0)
                        handler.postDelayed(this, 2000)
                    }
                    1 -> {
                        greenLight.setImageResource(0)
                        yellowLight.setImageResource(R.drawable.yellow_light)
                        redLight.setImageResource(0)
                        handler.postDelayed(this, 1000)
                    }
                    2 -> {
                        greenLight.setImageResource(0)
                        yellowLight.setImageResource(0)
                        redLight.setImageResource(R.drawable.red_light)
                        handler.postDelayed(this, 2000)
                    }
                }
                lightColor = (lightColor + 1) % 3
            }
        })
    }
}