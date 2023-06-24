package com.example.animequizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.buttonStart)
        val inputText: EditText = findViewById(R.id.inputText)

        startButton.setOnClickListener {
            if (inputText.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}