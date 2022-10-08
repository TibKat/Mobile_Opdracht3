package com.example.mobile_opdracht3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnEnter)



        btn.setOnClickListener {

            val name = findViewById<EditText>(R.id.etName).text.toString()
            val age = findViewById<EditText>(R.id.etAge).text.toString().toInt()
            val country = findViewById<EditText>(R.id.etCountry).text.toString()

            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME", name).toString()
                it.putExtra("EXTRA_AGE", age.toString().toInt())
                it.putExtra("EXTRA_COUNTRY", country).toString()
                startActivity(it)
                }
            }
        }
    }

