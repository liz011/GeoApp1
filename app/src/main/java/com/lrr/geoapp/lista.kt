package com.lrr.geoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class lista : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        var btnI: Button = findViewById(R.id.btnI)

        val intent = Intent(this,Recorrido1::class.java)
        startActivity(intent)
    }
}
