package com.example.assignment2_21012011099

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.card.MaterialCardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class WordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word)

        var back:FloatingActionButton=findViewById(R.id.back)
        var add: MaterialCardView =findViewById(R.id.add)

        add.setOnClickListener(){
            Toast.makeText(this, "Service not available :(", Toast.LENGTH_SHORT).show()
        }
        back.setOnClickListener(){
            finish()
        }
    }
}