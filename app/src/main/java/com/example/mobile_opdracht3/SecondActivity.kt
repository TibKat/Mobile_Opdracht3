package com.example.mobile_opdracht3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE",0)
        val country= intent.getStringExtra("EXTRA_COUNTRY")
        val secondActivityString = "$name is $age years old and lives in $country"

        val tv = findViewById<TextView>(R.id.tvSecondActivity)

        tv.text=secondActivityString
}
}