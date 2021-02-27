package com.myapp.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val rollImg: ImageView = findViewById(R.id.diceImageView)

        val roll: Int = dice.roll()
        rollText.text = roll.toString()

        when (roll) {
            1 -> rollImg.setImageResource(R.drawable.dice_1)
            2 -> rollImg.setImageResource(R.drawable.dice_2)
            3 -> rollImg.setImageResource(R.drawable.dice_3)
            4 -> rollImg.setImageResource(R.drawable.dice_4)
            5 -> rollImg.setImageResource(R.drawable.dice_5)
            6 -> rollImg.setImageResource(R.drawable.dice_6)
        }

    }
}

class Dice(private val n: Int = 6) {
    fun roll() = (1..n).random()
}
