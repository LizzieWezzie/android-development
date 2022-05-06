package com.example.inspirelearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class OnBoardingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_screen)

        val context = this
        val next = findViewById<TextView>(R.id.next)
        next.setOnClickListener {
            val intent = Intent(context, SignupScreen1::class.java)
            startActivity(intent)
        }
    }
}