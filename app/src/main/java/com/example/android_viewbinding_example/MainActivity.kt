package com.example.android_viewbinding_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_viewbinding_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityMainTextviewIntro.text = "This is ViewBinding Example"
    }

}