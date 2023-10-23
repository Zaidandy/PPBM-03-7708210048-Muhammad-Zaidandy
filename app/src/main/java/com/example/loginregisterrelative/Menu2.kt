package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Menu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val buttonClick = findViewById<TextView>(R.id.proms)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })
        val buttonClick1 = findViewById<TextView>(R.id.bokung)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,Menu3 ::class.java)
            startActivity(intent1)
            finish()


        })
        val tombolkursus = findViewById<ImageView>(R.id.menu1)
        tombolkursus.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this, Course::class.java)
            startActivity(intent2)
            finish()


        })
        val bokingtombol = findViewById<Button>(R.id.gas)
        bokingtombol.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,Booking ::class.java)
            startActivity(intent2)
            finish()


        })

    }
}