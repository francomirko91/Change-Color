package com.example.changecolor

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var view: View
    private lateinit var button: Button
    private val colors = arrayOf(
        Color.GRAY,
        Color.BLUE,
        Color.CYAN,
        Color.GREEN,
        Color.MAGENTA,
        Color.RED,
        Color.YELLOW,
        Color.WHITE
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        view = findViewById(R.id.layout)
        button = findViewById(R.id.btnChangeColor)


        button.setOnClickListener {
            view.setBackgroundColor(colors[Random.nextInt(colors.size)])
        }
    }

}
