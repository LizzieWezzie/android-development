package com.example.inspirelearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Modules2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modules2)

        val context = this
        val inspire = findViewById<TextView>(R.id.inspire_tab)
        inspire.setOnClickListener {
            val intent = Intent(context, InspireTab::class.java)
            startActivity(intent)
        }

        val learning = findViewById<TextView>(R.id.learning_tab)
        learning.setOnClickListener {
            val intent = Intent(context, Modules1::class.java)
            startActivity(intent)
        }

        val profile = findViewById<TextView>(R.id.profile_tab)
        profile.setOnClickListener {
            val intent = Intent(context, Profile::class.java)
            startActivity(intent)
        }
    }
}