package com.example.ejercicios

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        val card1 = findViewById<ImageView>(R.id.card1)
        val card2 = findViewById<ImageView>(R.id.card2)
        val card3 = findViewById<ImageView>(R.id.card3)

        val handler = Handler(Looper.getMainLooper())

        val cardClickListener = View.OnClickListener { view ->
            val imageView = view as ImageView
            imageView.setImageResource(R.drawable._oro)
            handler.postDelayed({ imageView.setImageResource(R.drawable.card_back) }, 1000)
        }

        card1.setOnClickListener(cardClickListener)
        card2.setOnClickListener(cardClickListener)
        card3.setOnClickListener(cardClickListener)
    }
}