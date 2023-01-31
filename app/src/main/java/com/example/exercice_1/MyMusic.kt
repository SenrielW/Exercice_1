package com.example.exercice_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MyMusic : AppCompatActivity() {
    val TAG = "MyMusic"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_music)

        Log.v(TAG, "Verbose message")
        Log.v(TAG, "Debug message")
        Log.i(TAG, "Info Message")
        Log.w(TAG, "Warning message")
        Log.e(TAG, "Error message")
        Log.println(Log.ASSERT, TAG, "Assert Message")

        //Definie Action
        var action = intent.action

        // catch category
        val isUserView = intent.hasCategory("user")

        // charge extra in bundle
        val extras: Bundle? = intent.extras

        val style = extras?.getString("style") // return null
        val type = extras?.getStringArrayList("type")
        val age = extras?.getInt("age")

        Log.i("","action: $action, isUserView: $isUserView, type: $type, age: $age extras: $extras, style: $style")
        Log.i("","intent, $intent")
        // TODO: durée de vie?
    }
    
}