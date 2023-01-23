package com.asgard.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    var numClicks: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val mainLayout = findViewById<LinearLayoutCompat>(R.id.mainLayout)
        val input = findViewById<EditText>(R.id.editText)
        val description = findViewById<TextView>(R.id.description)

        input.addTextChangedListener{
            description.text = "Olá, $it, você clicou $numClicks vezes o botão!"
        }

        button.setOnClickListener {
            numClicks++
            mainLayout.background = getDrawable(changeImage())
            description.text = "Olá, ${input.text}, você clicou $numClicks vezes o botão!"
        }
    }
    fun changeImage(): Int {
        return when {
            numClicks % 2 == 0 -> R.drawable.campo_neve
            numClicks % 3 == 0 -> R.drawable.geleira
            else -> R.drawable.montanha_neve
        }
    }

}