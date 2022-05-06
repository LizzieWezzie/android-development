package com.example.inspirelearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val inspire = findViewById<Button>(R.id.inspire_tab)
        val learning = findViewById<Button>(R.id.learning_tab)
        val profile = findViewById<Button>(R.id.profile_tab)
        val context = this
        inspire.setOnClickListener {
                val intent = Intent(context, InspireTab::class.java)
                startActivity(intent)
        }
        learning.setOnClickListener {
            val intent = Intent(context, Modules1::class.java)
            startActivity(intent)
        }
        profile.setOnClickListener {
            val intent = Intent(context, Profile::class.java)
            startActivity(intent)
        }

    }
}