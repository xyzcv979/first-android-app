package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // onCreate: lifecycle method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Type:button Resource.id.buttonName
        val button = findViewById<Button>(R.id.clickMeButton)

        // when button clicked
        button.setOnClickListener() {
            // prints to run terminal
            Log.v("Hello world!", "button clicked")
            // Popup message to user
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_LONG).show()

        }
    }
}