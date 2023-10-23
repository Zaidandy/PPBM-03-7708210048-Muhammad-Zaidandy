package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val buttonClick = findViewById<TextView>(R.id.rekomended)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu2 ::class.java)
            startActivity(intent)
            finish()


        })


        val buttonClick1 = findViewById<TextView>(R.id.booking1)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,Menu3 ::class.java)
            startActivity(intent1)
            finish()


        })
        val kursustombol = findViewById<ImageView>(R.id.pesan)
        kursustombol.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this, Course::class.java)
            startActivity(intent2)
            finish()


        })
        val tombolbelajar = findViewById<ImageView>(R.id.belajar)
        tombolbelajar.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,Booking::class.java)
            startActivity(intent2)
            finish()


        })
        val tombolkrus = findViewById<ImageView>(R.id.menuju)
        tombolkrus.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,Booking::class.java)
            startActivity(intent2)
            finish()


        })
    }
}