package com.example.assignment2_21012011099

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var pb : ImageButton=findViewById(R.id.ib1)

        pb.setOnClickListener(){
            Intent(this,MainActivity2 :: class.java).also { startActivity(it) }
        }
    }
}