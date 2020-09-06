package com.karloti.helloworld

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun incText(view: View) {
        if (number != 0) number = resultText.text.toString().toInt()
        if (number < 6) number++
        resultText.text = number.toString()
    }

    fun rollDice(view: View) {
        resultText.text = (1..6).random().toString()
    }
}