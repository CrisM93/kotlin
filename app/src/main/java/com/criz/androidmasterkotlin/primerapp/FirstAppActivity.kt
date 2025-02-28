package com.criz.androidmasterkotlin.primerapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.criz.androidmasterkotlin.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnSend = findViewById<Button>(R.id.btnSend)
        val etName = findViewById<EditText>(R.id.etName)
        btnSend.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
                Log.d("Cris", "welcome ${name}")
                val intent = Intent(this, SecondaryActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

    }
}