package com.criz.androidmasterkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import com.criz.androidmasterkotlin.primerapp.FirstAppActivity
import com.criz.androidmasterkotlin.segundaapp.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnPrimerApp = findViewById<Button>(R.id.btnPrimer)
        val btnSegundaApp = findViewById<Button>(R.id.btnSegunda)
        btnPrimerApp.setOnClickListener { navigateToSaludarApp() }

        btnSegundaApp.setOnClickListener { navigateToIMCApp() }
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludarApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

}