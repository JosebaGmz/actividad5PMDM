package com.example.actividad5pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Typeface
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val typeface = Typeface.createFromAsset(assets, "fonts/comic.ttf")
        val msg = intent.getStringExtra("message")

        val textView = findViewById<TextView>(R.id.textView)
        val textViewMessage = findViewById<TextView>(R.id.textViewMessage)

        textViewMessage.text = msg
        textView.typeface = typeface
        textViewMessage.typeface = typeface
    }
}