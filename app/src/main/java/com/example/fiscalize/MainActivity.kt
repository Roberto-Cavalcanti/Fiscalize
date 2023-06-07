package com.example.fiscalize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*btLogin.setOnClickListener {
        if(edNome.text.toString()=="Diogo") {
            val inten = Intent(this, Tela2Activity::class.java)
            val texto = edNome.text.toString()
            inten.putExtra("nome", texto)
            startActivity(inten)
        }
        else{
            Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
            btLogin.text = edNome.text.toString()

        }
    }*/
}