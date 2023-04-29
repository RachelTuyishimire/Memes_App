package com.example.memes_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme3 : AppCompatActivity() {
    lateinit var tvStepFour:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        tvStepFour = findViewById(R.id.btnStepFour)
        tvStepFour.setOnClickListener {
            val intent=Intent(this,Meme4::class.java)
            startActivity(intent)
        }
        lateinit var tvPrev:Button
        tvPrev=findViewById(R.id.btnPrev)
        tvPrev.setOnClickListener {
            val intent=Intent(this,Meme2::class.java)
            startActivity(intent)
        }
    }
}