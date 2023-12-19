package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class Biodata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata2)

        var txtNama : EditText = findViewById(R.id.txtNama)
        var hasilCuy : TextView = findViewById(R.id.hasilCuy)
        var spinnerKelas : Spinner = findViewById(R.id.spinnerKelas)
        var groupRadio : RadioGroup = findViewById(R.id.groupRadio)
        var radioPria : RadioButton = findViewById(R.id.radioPria)
        var radioWanita : RadioButton = findViewById(R.id.radioWanita)
        var btnFinish : Button = findViewById(R.id.btnFinish)
        var swKehadiran : Switch = findViewById(R.id.swKehadiran)


        swKehadiran.setOnCheckedChangeListener{buttonView,isChecked ->

            if(isChecked){
                swKehadiran.text = "Hadir"
            }else{
                swKehadiran.text = "Tidak Hadir"
            }
        }

        btnFinish.setOnClickListener(){
            var Nama = txtNama.text.toString()
            var Kelas = spinnerKelas.selectedItem
            var Hadir = "Tidak Hadir"
            if (swKehadiran.isChecked){
                Hadir = "Hadir"
            }else{
                Hadir = "Tidak Hadir"
            }


            if(radioPria.isChecked){
                hasilCuy.text = "You're on your own, bro!"
            }
            else if(radioWanita.isChecked){
                hasilCuy.text = "You're on your own, sis!"
            }
            else{
                Toast.makeText(this,"Silahkan lengkapi biodata!", Toast.LENGTH_LONG).show()
            }
        }
    }
}