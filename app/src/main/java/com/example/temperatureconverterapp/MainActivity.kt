package com.example.temperatureconverterapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userInput = findViewById<EditText>(R.id.editText)
        var toggle = findViewById<ToggleButton>(R.id.toggleButton)
        var submit = findViewById<Button>(R.id.button)
        var Results = findViewById<TextView>(R.id.Result)
        var storeResult = 0

        submit.setOnClickListener {
            Results.setText(storeResult.toString())
        }
       toggle.setOnCheckedChangeListener { _, isChecked ->
            // if toggle ischesked convert to celsius to farhr
           if (isChecked) {
               val conversion = (userInput.text.toString().toInt() * 1.8) + 32
               storeResult = conversion.toInt()

           } else {
               val conversion = (userInput.text.toString().toInt() - 32) * 0.5556
               storeResult = conversion.toInt()

           }
       }






    }
}