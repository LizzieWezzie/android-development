package com.example.inspirelearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUpScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen3)

        val context = this
        val next = findViewById<TextView>(R.id.next)
        next.setOnClickListener {
            val intent = Intent(context, HomeScreen::class.java)
            startActivity(intent)
        }
    }
}