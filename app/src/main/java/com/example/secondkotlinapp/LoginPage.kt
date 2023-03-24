package com.example.secondkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondkotlinapp.databinding.ActivityLoginPageBinding

class LoginPage : AppCompatActivity() {
    private lateinit var binding: ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button5.setOnClickListener {
            finish()
            startActivity(Intent(this, RegisterPage::class.java))
        binding.button4.setOnClickListener {
            finish()
            startActivity(Intent(this, HomeActivity::class.java))
        }
        }
        
    }
}