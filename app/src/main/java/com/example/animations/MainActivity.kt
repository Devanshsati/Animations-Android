package com.example.animations

import android.os.Bundle
import android.view.animation.*
import androidx.appcompat.app.AppCompatActivity
import com.example.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            val animText = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            binding.textView.startAnimation(animText)
        }
        binding.button2.setOnClickListener {
            val animText = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            binding.textView.startAnimation(animText)
        }
        binding.button3.setOnClickListener {
            val animText = AnimationUtils.loadAnimation(this, R.anim.zoom_in                        )
            binding.textView.startAnimation(animText)
        }
        binding.button4.setOnClickListener {
            val animText = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            binding.textView.startAnimation(animText)
        }
    }
}