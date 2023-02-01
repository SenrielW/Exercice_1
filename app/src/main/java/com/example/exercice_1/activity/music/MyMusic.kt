package com.example.exercice_1.activity.music

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.exercice_1.R
import com.example.exercice_1.data.MusicGroup
import com.example.exercice_1.data.Profile

class MyMusic : AppCompatActivity() {
    val TAG = "MyMusic"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_music)

        //Definie Action
        var action = intent.action

        // catch category
        val isPreferredGroupView = intent.hasCategory("preferred_group")

        // charge extra in bundle
        val extras: Bundle? = intent.extras

        val prefferedGroup1: MusicGroup = intent.getParcelableExtra("preferredGroup1")!!
        val prefferedGroup2: MusicGroup = intent.getParcelableExtra("preferredGroup2")!!
        val prefferedGroup3: MusicGroup = intent.getParcelableExtra("preferredGroup3")!!


        val preferredGroup1View = findViewById<TextView>(R.id.preferred_group_1)
        val preferredGroup2View = findViewById<TextView>(R.id.preferred_group_2)
        val preferredGroup3View = findViewById<TextView>(R.id.preferred_group_3)

        preferredGroup1View.setText("Nom: ${prefferedGroup1.name} - style: ${prefferedGroup1.style}")
        preferredGroup2View.setText("Nom: ${prefferedGroup2.name} - style: ${prefferedGroup2.style}")
        preferredGroup3View.setText("Nom: ${prefferedGroup3.name} - style: ${prefferedGroup3.style}")

        Log.i(TAG, "action: $action, isPreferredGroupView: $isPreferredGroupView, extras: $extras")
    }

}