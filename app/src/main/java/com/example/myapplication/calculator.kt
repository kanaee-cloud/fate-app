package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var inputAngka1 : EditText = findViewById(R.id.inputAngka1)
        var inputAngka2 : EditText = findViewById(R.id.inputAngka2)
        var viewHasil : TextView = findViewById(R.id.viewHasil)
        var submitHasil : Button = findViewById(R.id.submitHasil)

        submitHasil.setOnClickListener(){
            var hasil = inputAngka1.text.toString().toInt() + inputAngka2.text.toString().toInt()
            viewHasil.text = hasil.toString()
        }
    }
}