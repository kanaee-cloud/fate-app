package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculator2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator2)

        var input1 : EditText = findViewById(R.id.input1)
        var input2 : EditText = findViewById(R.id.input2)
        var viewResult : TextView = findViewById(R.id.viewResult)
        var btnResult : Button = findViewById(R.id.btnResult)

        btnResult.setOnClickListener(){
           var angka1 = input1.text.toString().toInt()
            var angka2 = input2.text.toString().toInt()
            var hasil = angka1 + angka2
            viewResult.text = hasil.toString()
        }
    }
}