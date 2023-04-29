package com.example.memes_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme4 : AppCompatActivity() {
    lateinit var tvPrevv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        tvPrevv= findViewById(R.id.btnStepFive)
        tvPrevv.setOnClickListener {
            val intent=Intent(this, Meme5::class.java)
            startActivity(intent)
        }
        lateinit var tvPrevv:Button
        tvPrevv=findViewById(R.id.btnPrevv)
        tvPrevv.setOnClickListener {
            val intent=Intent(this,Meme3::class.java)
            startActivity(intent)
        }
    }
}