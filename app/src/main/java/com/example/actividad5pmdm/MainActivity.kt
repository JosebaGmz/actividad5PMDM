package com.example.actividad5pmdm

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.FrameLayout
import android.widget.EditText
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonChangeColor = findViewById<Button>(R.id.buttonChangeColor)
        val buttonSwitchActivity = findViewById<Button>(R.id.buttonSwitchActivity)
        val buttonGoToLogin = findViewById<Button>(R.id.buttonGoToLogin)

        buttonChangeColor.setOnClickListener {
            // Cambiar el color de fondo del cuerpo
            val newColor = Color.rgb(0, 0, 255)
            val container = findViewById<LinearLayout>(R.id.container)
            container.setBackgroundColor(newColor)
        }

        buttonSwitchActivity.setOnClickListener {
            // Cambiar a Activity 2
            val editTextMessage = findViewById<EditText>(R.id.editText)
            val message = editTextMessage.text.toString()

            val intent = Intent(this, Activity2::class.java).apply {
                putExtra("message", message)
            }
            startActivity(intent)
        }

        buttonGoToLogin.setOnClickListener {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }

    }
}