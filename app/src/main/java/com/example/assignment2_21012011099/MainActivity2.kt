package com.example.assignment2_21012011099


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.view.isVisible
import com.github.barteksc.pdfviewer.PDFView
import com.google.android.material.card.MaterialCardView

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var back:ImageButton=findViewById(R.id.back)
        var add:MaterialCardView=findViewById(R.id.add)
        var text:TextView=findViewById(R.id.tv)
        var pdfView:PDFView=findViewById(R.id.pdfView)

        back.setOnClickListener(){
            finish()
        }

        add.setOnClickListener(){
            add.isVisible=false
            text.isVisible=false
            pdfView.fromAsset("@assets/P6").swipeHorizontal(true).pageSnap(true).autoSpacing(true).pageFling(true).enableSwipe(true).load()
        }

    }

}
