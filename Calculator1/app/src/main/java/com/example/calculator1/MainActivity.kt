package com.example.calculator1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            val number1 = findViewById<EditText>(R.id.number1)
            val number2 = findViewById<EditText>(R.id.number2)
            val resultText = findViewById<TextView>(R.id.resultText)

            val addButton = findViewById<Button>(R.id.addButton)
            val subButton = findViewById<Button>(R.id.subButton)
            val mulButton = findViewById<Button>(R.id.mulButton)
            val divButton = findViewById<Button>(R.id.divButton)
            val modButton = findViewById<Button>(R.id.modButton)

            addButton.setOnClickListener {
                val num1 = number1.text.toString().toDoubleOrNull()
                val num2 = number2.text.toString().toDoubleOrNull()
                if (num1 != null && num2 != null) {
                    val result = num1 + num2
                    resultText.text = "Result: $result"
                } else {
                    resultText.text = "Please enter valid numbers"
                }
            }

        }
    }
}