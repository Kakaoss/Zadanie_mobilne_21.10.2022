package com.example.zadanie_mobilne_21102022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dodaj = findViewById<Button>(R.id.btnDodaj)
        val przywroc = findViewById<Button>(R.id.btnPrzywroc)
        val text = findViewById<TextView>(R.id.imie_nazwisko)
        val dodawanytext = findViewById<EditText>(R.id.wprowadzanie)
        dodaj.setOnClickListener {
            text.text = text.text.toString() + dodawanytext.text.toString()
            dodawanytext.text.clear();
        }
        przywroc.setOnClickListener {
            text.text = "Jakub Wyczanowski"
        }
    }
}