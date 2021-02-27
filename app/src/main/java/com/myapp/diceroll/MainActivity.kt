package com.myapp.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollBtn)


        rollButton.setOnClickListener {
            // Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val rollText: TextView = findViewById(R.id.rollTextView)
        rollText.text = dice.roll().toString()
    }
}

class Dice(private val n: Int = 6) {
    fun roll() = (1..n).random()
}
