package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var txtUsername : EditText = findViewById(R.id.txtUsername)
        var txtPassword : EditText = findViewById(R.id.txtPassword)
        var btnLogin : Button = findViewById(R.id.btnLogin)
        var txtWrong : TextView = findViewById(R.id.txtWrong)

        btnLogin.setOnClickListener(){
            var username = txtUsername.text.toString()
            var password = txtPassword.text.toString()



            if ( username == "Yukine" && password == "123"){
                var activityMain = Intent(this, MainActivity::class.java)
                startActivity(activityMain)
            } else{
                txtWrong.text = "Username or Password wrong" 
            }
        }

    }
}