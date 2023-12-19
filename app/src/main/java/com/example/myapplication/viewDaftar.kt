package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class viewDaftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_daftar)

        var userName : TextView = findViewById(R.id.extraNama)
        var userPass : TextView = findViewById(R.id.extraPass)

        var name = intent.getStringExtra("extraNama")
        var pass = intent.getStringExtra("extraPass")

        userName.setText(name)
        userPass.setText(pass)


    }
}