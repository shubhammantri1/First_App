package com.example.shubham.first_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var btn:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)
        btn?.setOnClickListener {
            Toast.makeText(this,"Kyu Pareshan kar raha hai", Toast.LENGTH_SHORT).show()
        }
    }
}
