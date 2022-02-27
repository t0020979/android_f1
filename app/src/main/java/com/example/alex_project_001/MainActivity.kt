package com.example.alex_project_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var summary: String  = "Мир привет. 2022 год настал"

        val output: TextView = findViewById(R.id.output)
        output.text = summary

        Log.d(TAG, summary)
    }
}