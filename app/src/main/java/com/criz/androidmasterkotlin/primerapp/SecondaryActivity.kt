package com.criz.androidmasterkotlin.primerapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.criz.androidmasterkotlin.R

class SecondaryActivity : AppCompatActivity() {
    val name: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        val tvRecivied = findViewById<TextView>(R.id.tvRecivied)

        val names: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvRecivied.text = "Hola $names"
        Toast.makeText(this, ""+names, Toast.LENGTH_SHORT).show()


    }
}