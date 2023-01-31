package com.example.exercice_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button Profile
        var profile = Profile("Robin", 28)
        val buttonParcelable = findViewById<Button>(R.id.my_profile)
        buttonParcelable.setOnClickListener{
            val intentProfile = Intent(this, ProfileDetails::class.java)
            intentProfile.putExtra("profile", profile)
            startActivity(intentProfile)
        }

        // Button Music
        val buttonStartMusic = findViewById<Button>(R.id.start_my_music_btn)
        buttonStartMusic.setOnClickListener{
            val intentMusic = Intent(this, MyMusic::class.java)
            // ADD action
            intentMusic.action = Intent.ACTION_VIEW
            // ADD category
            intentMusic.addCategory("music_category")
            // ADD extra
            intentMusic.putExtra("name", "Robin");
            intentMusic.putExtra("age",25)

            // ADD extra in list
            val typeMusic:  ArrayList<String> = ArrayList(2);
            typeMusic.add(0, "Electro");
            typeMusic.add(1, "Chiptune");

            intentMusic.putExtra("type", typeMusic)

            startActivity(intentMusic)
        }
    }
}