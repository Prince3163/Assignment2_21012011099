package com.example.assignment2_21012011099

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentAction = intent.action
        val intentType = intent.type

        var pb : ImageButton=findViewById(R.id.ib1)
        var wb : ImageButton=findViewById(R.id.ib2)
        var pptb:ImageButton=findViewById(R.id.ib3)
        var nav:FloatingActionButton=findViewById(R.id.nav)

        pb.setOnClickListener(){
            Intent(this,MainActivity2 :: class.java).also { startActivity(it) }
        }

        wb.setOnClickListener(){
            Intent(this,WordActivity :: class.java).also { startActivity(it) }
        }

        pptb.setOnClickListener(){
            Intent(this,pptActivity :: class.java).also { startActivity(it) }
        }

        nav.setOnClickListener(){
            Toast.makeText(this, "Service not available :(", Toast.LENGTH_SHORT).show()
        }
    }
}