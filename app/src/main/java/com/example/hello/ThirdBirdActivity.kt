package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var binding: ActivityThirdBirdBinding
            binding = ActivityThirdBirdBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btnPrev3.setOnClickListener{
                finish()
            }
            binding.btnNext3.setOnClickListener {
                val intent = Intent(this, ThirdBirdActivity::class.java)
                startActivity(intent)
            }

            Picasso.get().load("https://media.istockphoto.com/id/1458515349/photo/chaffinch-on-branch-the-netherlands.webp?b=1&s=170667a&w=0&k=20&c=N67Dz9Ee0GHzYYMyUP31s4_zBDD_TGa0izZvqBElC60=")
                .centerCrop()
                .resize(500,500)
                .into(binding.imageView10)
        }
    }
