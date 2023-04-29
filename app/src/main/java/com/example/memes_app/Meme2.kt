package com.example.memes_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme2 : AppCompatActivity() {
    lateinit var tvStepThree:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        tvStepThree = findViewById(R.id.btnStepThree)
        tvStepThree.setOnClickListener {
            val intent = Intent(this,Meme3::class.java)
            startActivity(intent)
        }
        lateinit var tvPre:Button
        tvPre = findViewById(R.id.btnPre)
        tvPre.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}