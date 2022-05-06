package com.example.inspirelearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignupScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_screen1)

        val context = this
        val next = findViewById<TextView>(R.id.next)
        next.setOnClickListener {
            val intent = Intent(context, SignUpScreen3::class.java)
            startActivity(intent)
        }
    }
}