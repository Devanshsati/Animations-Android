package com.example.animations

import android.os.Bundle
import android.view.View
import android.view.animation.*
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
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
            val animText = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            binding.textView.startAnimation(animText)
        }
        binding.button4.setOnClickListener {
            val animText = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            binding.textView.startAnimation(animText)
        }

        val spinnerList = listOf("Table","banana","😢","🤔")
        val spinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,spinnerList)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = spinnerAdapter
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, parent?.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "Nothing selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}