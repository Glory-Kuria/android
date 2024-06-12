package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_fourth_bird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth_bird)
        val btnPrev4 = findViewById<ImageView>(R.id.btnPrev4)
        val btnNext4 = findViewById<ImageView>(R.id.btnNext4)
        btnPrev4.setOnClickListener {
            finish()

        }
        btnNext4.setOnClickListener {
            val intent = Intent(this,activity_fifth_bird::class.java)
            startActivity(intent)
        }
        }
    }
