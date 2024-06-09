package com.myfinalcalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNum1 = findViewById<EditText>(R.id.etNum1).text
        val etNum2 = findViewById<EditText>(R.id.etNum2).text

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSub = findViewById<Button>(R.id.btnSub)
        val btnMult = findViewById<Button>(R.id.btnMult)
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        val btnSqrRoot = findViewById<Button>(R.id.btnSqrRoot)
        val btnPower = findViewById<Button>(R.id.btnPower)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {
            val number1 = etNum1.toString().toInt()
            val number2 = etNum2.toString().toInt()

            val result = number1 + number2

            tvResult.text = "$result"
        }

        btnSub.setOnClickListener {
            val number1 = etNum1.toString().toInt()
            val number2 = etNum2.toString().toInt()

            val result = number1 - number2

            tvResult.text = "$result"
        }

        btnDiv.setOnClickListener {
            val number1 = etNum1.toString().toInt()
            val number2 = etNum2.toString().toInt()

            val result = number1 / number2

            tvResult.text = "$result"
        }

        btnMult.setOnClickListener {
            val number1 = etNum1.toString().toInt()
            val number2 = etNum2.toString().toInt()

            val result = number1 * number2

            tvResult.text = "$result"
        }

        btnSqrRoot.setOnClickListener {
            val number1 = etNum1.toString().toDouble()
            val result = Math.sqrt(number1)

            tvResult.text = "$result"
        }

        btnPower.setOnClickListener {
            val number1 = etNum1.toString().toDouble()
            val number2 = etNum2.toString().toDouble()
            var result = Math.pow(number1, number2)

            tvResult.text = "$result"
        }
    }
}