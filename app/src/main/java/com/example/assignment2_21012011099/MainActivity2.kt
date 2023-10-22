package com.example.assignment2_21012011099

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var back:ImageButton=findViewById(R.id.back)

        back.setOnClickListener(){
            finish()
        }
    }
}