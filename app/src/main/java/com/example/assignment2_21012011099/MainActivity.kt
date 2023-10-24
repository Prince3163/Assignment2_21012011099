package com.example.assignment2_21012011099

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var pb : ImageButton=findViewById(R.id.ib1)
        var wb : ImageButton=findViewById(R.id.ib2)

        pb.setOnClickListener(){
            Intent(this,MainActivity2 :: class.java).also { startActivity(it) }
        }

        wb.setOnClickListener(){
            Toast.makeText(this, "Yooooooo", Toast.LENGTH_SHORT).show()
        Intent(this,MainActivity2 :: class.java).also { startActivity(it) }
        }
    }
}