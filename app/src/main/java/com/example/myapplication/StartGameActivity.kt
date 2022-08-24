package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class StartGameActivity : AppCompatActivity() {
   lateinit var txt_play :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_game)
        txt_play = findViewById(R.id.txtPlayGame);
        txt_play.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@StartGameActivity,MainActivity::class.java))
        })
    }
}