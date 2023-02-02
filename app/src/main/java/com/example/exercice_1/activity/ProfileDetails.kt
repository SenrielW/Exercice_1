package com.example.exercice_1.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exercice_1.data.Profile
import com.example.exercice_1.R

class ProfileDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_details)

        //Catch Profile in MainActivity
        val profile: Profile = intent.getParcelableExtra("profile")!!
        val nameTextView = findViewById<TextView>(R.id.name)
        val ageTextView = findViewById<TextView>(R.id.age)

        nameTextView.setText("Nom: ${profile?.name}")
        ageTextView.setText("Age: ${profile?.age}")
    }
}