package com.example.ejercicio2

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nombre", findViewById<EditText>(R.id.nombre).text.toString())
        outState.putString("apellido", findViewById<EditText>(R.id.apellidos).text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        findViewById<EditText>(R.id.nombre).setText(savedInstanceState.getString("nombre"))
        findViewById<EditText>(R.id.apellidos).setText(savedInstanceState.getString("apellido"))
    }

}