package com.example.actividad5pmdm

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    lateinit var bodyContainer: FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bodyContainer = findViewById(R.id.bodyContainer)
        setBodyBackgroundColor(bodyContainer, Color.BLUE)
    }

    private fun setBodyBackgroundColor(container: FrameLayout, color: Int) {
        container.setBackgroundColor(color)
    }
}