package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class KalkulatorspinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kalkulatorspinner)

        var Angka1 : EditText = findViewById(R.id.Angka1)
        var Angka2 : EditText = findViewById(R.id.Angka2)
        var txtHasil : TextView = findViewById(R.id.txtHasil)
        var btnSubmit : Button = findViewById(R.id.btnSubmit)
        var spinnerOperator : Spinner = findViewById(R.id.spinnerOperator)

        btnSubmit.setOnClickListener(){
            var angka1 = Angka1.text.toString().toDouble()
            var angka2 = Angka2.text.toString().toDouble()
            var operator = spinnerOperator.selectedItem.toString()

            if (operator == "+"){
                var hasil = angka1 + angka2
                txtHasil.text = hasil.toString()
            }else if(operator == "-"){
                var hasil = angka1 - angka2
                txtHasil.text = hasil.toString()
            }else if(operator == "X"){
                var hasil = angka1 * angka2
                txtHasil.text = hasil.toString()
            }else if(operator == ":"){
                var hasil = angka1 / angka2
                txtHasil.text = hasil.toString()
            }
            else{
                Toast.makeText(this,"Operator Salah", Toast.LENGTH_LONG).show()
            }
        }
    }
}