package com.karloti.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.karloti.helloworld.databinding.ActivityMainBinding

/**
 * DiceRoller demonstrates simple interactivity in an Android app.
 * It contains one button that updates an image view with a dice
 * vector image with a random value between 1 and 6.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        /** setContentView(R.layout.activity_main) */
        setContentView(binding.root)

        // Get the Button view from the layout and assign a click
        // listener to it.

        /**
         * val rollButton: Button = findViewById(R.id.roll_button)
         * rollButton.setOnClickListener { rollDice() }
         */
        binding.rollButton.setOnClickListener { rollDice() }

        /**
         * val countButton: Button = findViewById(R.id.countup_button)
         * countButton.setOnClickListener { countUp() }
         */
        binding.countupButton.setOnClickListener { countUp() }
    }

    /**
     * Click listener for the Roll button.
     */
    private fun rollDice() {
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    /**
     * Click listener for the countUp button.
     */
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        // If text is the default "Hello World!" set that text to 1.
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
//            Toast.makeText(this, "If text is the default \"Hello World!\" set that text to 1.", Toast.LENGTH_SHORT).show()
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}