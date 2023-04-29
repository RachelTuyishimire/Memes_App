package com.example.memes_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var tvStepTwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvStepTwo =findViewById(R.id.btnStepTwo)
        tvStepTwo.setOnClickListener {
            val intent = Intent(this,Meme2::class.java)
            startActivity(intent)
        }
    }
}