package com.example.db

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.db.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var layout:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivityMainBinding.inflate(layoutInflater)
        setContentView(layout.root)
    }
}