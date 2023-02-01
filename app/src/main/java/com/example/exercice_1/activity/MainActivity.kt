package com.example.exercice_1.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.exercice_1.R
import com.example.exercice_1.data.Profile
import com.example.exercice_1.activity.music.MyMusic
import com.example.exercice_1.activity.cgu.CguActivity
import com.example.exercice_1.activity.profile.ProfileDetails
import com.example.exercice_1.data.MusicGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button Profile
        val buttonParcelable = findViewById<Button>(R.id.my_profile)
        buttonParcelable.setOnClickListener{
            val intentProfile = Intent(this, ProfileDetails::class.java)
            var myProfile = Profile("Robin", 28)
            intentProfile.putExtra("profile", myProfile)
            startActivity(intentProfile)
        }

        // Button Music
        val buttonStartMusic = findViewById<Button>(R.id.start_my_music_btn)
        buttonStartMusic.setOnClickListener{
            val intentMusic = Intent(this, MyMusic::class.java)
            // ADD action
            intentMusic.action = Intent.ACTION_VIEW
            // ADD category
            intentMusic.addCategory("preferred_group")

            // Get Preferred Group
            var preferredGroup1 = MusicGroup("Chipzel", "Chiptune")
            var preferredGroup2 = MusicGroup("Kubbi", "Chiptune")
            var preferredGroup3 = MusicGroup("Meganeko", "Chiptune-Electro")

            // Put extra
            intentMusic.putExtra("preferredGroup1", preferredGroup1)
            intentMusic.putExtra("preferredGroup2", preferredGroup2)
            intentMusic.putExtra("preferredGroup3", preferredGroup3)

            startActivity(intentMusic)
        }

        // Button Profile
        val buttonCgu = findViewById<Button>(R.id.start_cgu_btn)
        buttonCgu.setOnClickListener{
            val intentCgu = Intent(this, CguActivity::class.java)
            startActivity(intentCgu)
        }
    }
}