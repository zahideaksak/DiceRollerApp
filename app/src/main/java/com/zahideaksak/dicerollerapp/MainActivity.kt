package com.zahideaksak.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.zahideaksak.dicerollerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var diceImage : ImageView
    private lateinit var resultText : TextView
    private lateinit var messageText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //var resultText = binding.resultText.text.toString()
        var diceImage = binding.diceImage
    }

    fun rollButton(view:View) {
        rollDice()


        //resultText = "Dice Rolled"

        //textin icinde random sayi dondurup onu yazdırmak icin

        //binding.resultText.text = randomInt.toString()
    }

    private fun rollDice() {
        //Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()
        val randomInt2 = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImage.setImageResource(drawableResource)
        binding.diceImage2.setImageResource(drawableResource2)
        //binding.resultText.text = randomInt.toString()

        if ( drawableResource == drawableResource2) {
            binding.messageText.text = "Düşeş"
        } else {
            binding.messageText.text = ""
        }
    }
}