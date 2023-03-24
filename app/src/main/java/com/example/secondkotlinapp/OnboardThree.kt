package com.example.secondkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondkotlinapp.databinding.ActivityOnboardThreeBinding

class OnboardThree : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            finish()
            startActivity(Intent(this, LoginPage::class.java))
        }

    }
}