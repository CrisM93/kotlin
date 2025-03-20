package com.criz.androidmasterkotlin.segundaapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.criz.androidmasterkotlin.R
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class ImcCalculatorActivity : AppCompatActivity() {
    private lateinit var viewMale: CardView // Inicia cuando yo te diga
    private lateinit var viewFemale: CardView
    private lateinit var tvHeigth: TextView
    private lateinit var rsHeigth: RangeSlider

    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponents()
        initListenera()
        initUI()
    }

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeigth = findViewById(R.id.tvHeigth)
        rsHeigth = findViewById(R.id.rsHeigth)
    }

    private fun initListenera() {
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        rsHeigth.addOnChangeListener { _, fl, _ ->
            val df = DecimalFormat("#.##")
            val result = df.format(fl)
            tvHeigth.text = "$result cm"  }
    }

    private fun changeGender() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor() {
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))

    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int { //devolveremos un INT
        val colorReference = if (isSelectedComponent) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }
        return ContextCompat.getColor(this, colorReference)

    }

    private fun initUI() {

    }

}