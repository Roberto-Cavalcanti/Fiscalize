package com.example.fiscalize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        greeting()
    }

    private fun greeting(){
        val nome = intent.getStringExtra("nome")
        
    }

}