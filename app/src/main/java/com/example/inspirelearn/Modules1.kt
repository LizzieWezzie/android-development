package com.example.inspirelearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Modules1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modules1)

        val context = this
        val discover = findViewById<TextView>(R.id.discover)
        discover.setOnClickListener {
            val intent = Intent(context, Modules2::class.java)
            startActivity(intent)
        }
    }
}