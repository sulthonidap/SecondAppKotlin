package com.example.secondkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondkotlinapp.databinding.ActivityOnboardTwoBinding

class OnboardTwo : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button3.setOnClickListener {
            finish()
            startActivity(Intent(this, OnboardThree::class.java))
        }
    }
}