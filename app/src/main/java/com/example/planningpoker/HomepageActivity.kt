package com.example.planningpoker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val button = findViewById<Button>(R.id.squad_button)
        button.setOnClickListener {
            val Intent = Intent(this, SquadPageActivity::class.java)
            startActivity(Intent)
        }
    }
}