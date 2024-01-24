package com.shivajee.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var  DiceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val RollButton = findViewById<Button>(R.id.roll_button)
        RollButton.setOnClickListener {

            RollDie()
            Toast.makeText(this, "Rolled The Die", Toast.LENGTH_SHORT).show()
        }
        val DiceImage : ImageView = findViewById(R.id.image_view)
        
        
    }

    private fun RollDie() {
        //        count = count + 1
//        ResultText.text = "Die Rolled"
        val DrawableResource = when(Random.nextInt(1, 7)) {
            1  -> R.drawable.dice_1
            2  -> R.drawable.dice_2
            3  -> R.drawable.dice_3
            4  -> R.drawable.dice_4
            5  -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        DiceImage.setImageResource(DrawableResource)

    }
}