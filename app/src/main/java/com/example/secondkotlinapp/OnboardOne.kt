package com.example.secondkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondkotlinapp.databinding.ActivityOnboardOneBinding

class OnboardOne : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            finish()
            startActivity(Intent(this, OnboardTwo::class.java))
        }

    }
}