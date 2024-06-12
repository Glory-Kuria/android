package com.example.hello

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val btnNext = findViewById<ImageView>(R.id.btnNext)
        binding.btnNext.setOnClickListener{
            val intent = Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://media.istockphoto.com/id/1441699462/photo/beautiful-winter-scenery-with-european-finch-birds-perched-on-the-branch-within-a-heavy.webp?b=1&s=170667a&w=0&k=20&c=gUROZrCa7bq55eJXMdAq110zM63u9Ee9w1IAUcqtqs8=")
            .centerCrop()
            .resize(500,500)
            .into (binding.imageView)
        }
    }
