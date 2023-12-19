package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnBiodata : Button = findViewById(R.id.btnBiodata)
        var btnCalculator : Button = findViewById(R.id.btnCalculator)
        var btnWeb : Button = findViewById(R.id.btnWeb)
        var btnCalc2 : Button = findViewById(R.id.btnCalc2)
        var btnLoginkan : Button = findViewById(R.id.btnLoginkan)
        var btnDaftar : Button = findViewById(R.id.btnDaftar)
        var btnFragment : Button = findViewById(R.id.btnFragment)


        btnBiodata.setOnClickListener(){
            var Biodata = Intent(this, Biodata::class.java)
            startActivity(Biodata)
        }

        btnCalculator.setOnClickListener(){
            var KalkulatorspinnerActivity = Intent(this, KalkulatorspinnerActivity::class.java)
            startActivity(KalkulatorspinnerActivity)
        }

        btnWeb.setOnClickListener(){
            var WebView = Intent(this, WebView::class.java)
            startActivity(WebView)
        }

        btnCalc2.setOnClickListener(){
            var calculator = Intent(this, calculator::class.java)
            startActivity(calculator)
        }

        btnLoginkan.setOnClickListener(){
            var Login = Intent(this, Login::class.java)
            startActivity(Login)
        }

        btnDaftar.setOnClickListener(){
            var Daftar = Intent(this, Daftar::class.java)
            startActivity(Daftar)
        }

        btnFragment.setOnClickListener(){
            var FragmentLayout = Intent(this, FragmentLayout::class.java)
            startActivity(FragmentLayout)
        }
    }
}