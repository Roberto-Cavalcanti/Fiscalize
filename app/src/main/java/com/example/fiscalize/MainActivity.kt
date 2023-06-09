package com.example.fiscalize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fiscalize.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

        val edNome = binding.textInputEditText
        val btLogin = binding.btLogin

        btLogin.setOnClickListener {
            if (edNome.text.toString() == "Roberto") {
                val inten = Intent(this, HomeActivity::class.java)
                val texto = edNome.text.toString()
                val wellcome = "Bem-vindo de volta, $texto"
                inten.putExtra("nome", wellcome)
                startActivity(inten)
            } else {
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
                btLogin.text = edNome.text.toString()

            }
        }
    }
}