package com.example.memes_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme5 : AppCompatActivity() {
    lateinit var tvBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        tvBack=findViewById(R.id.btnBack)
        tvBack.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}