package com.example.exercice_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button Search
        val buttonStartPresentation = findViewById<Button>(R.id.start_my_presentation_btn)
        val buttonStartMusic = findViewById<Button>(R.id.start_my_music_btn)

        // Button Event
        buttonStartPresentation.setOnClickListener{
            val intent = Intent(this, MyPresentation::class.java)
            startActivity(intent)
        }
        buttonStartMusic.setOnClickListener{
            val intent = Intent(this, MyMusic::class.java)
            startActivity(intent)
        }
    }
}