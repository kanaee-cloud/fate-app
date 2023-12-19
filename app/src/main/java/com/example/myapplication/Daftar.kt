package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        var userName : EditText = findViewById(R.id.userName)
        var userPass : EditText = findViewById(R.id.userPass)
        var btnSign : Button = findViewById(R.id.btnSign)

        btnSign.setOnClickListener(){
            var name = userName.text
            var pass = userPass.text
            var activityviewDaftar = Intent(this, viewDaftar::class.java).also{
                it.putExtra("extraNama", name.toString())
                it.putExtra("extraPass", pass.toString())
            }
            startActivity(activityviewDaftar)
        }
    }
}