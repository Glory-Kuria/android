package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.btnNext3.setOnClickListener{
            val intent=Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }

        Picasso.get().load("https://media.istockphoto.com/id/1484517104/photo/parrot-portrait-military-macaw.webp?b=1&s=170667a&w=0&k=20&c=c0c4atL6vRE6_ZXzWNLWYI3MwD2GLj9T6rTRisebGHU=")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView10)
        val btnPrev3 = findViewById<ImageView>(R.id.btnPrev3)
        val btnNext3 = findViewById<ImageView>(R.id.btnNext3)
        btnPrev3.setOnClickListener {
            finish()

        }
        btnNext3.setOnClickListener {
            val intent = Intent(this, activity_fourth_bird::class.java)
            startActivity(intent)
        }

    }
    }
