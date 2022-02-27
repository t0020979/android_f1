package com.example.alex_project_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG: String = "alex_MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "start of onCreate function")

        val name: String = "Ivan"
        val surname: String = "Ivanov"
        val age: Int = 37
        val height: Double = 172.2

        val text: String = "name: $name surname: $surname. age: $age height: $height"

        val output: TextView = findViewById(R.id.output)
        output.text = text

        Log.e(TAG, text)
        Log.w(TAG, "end of onCreate function")
    }
}