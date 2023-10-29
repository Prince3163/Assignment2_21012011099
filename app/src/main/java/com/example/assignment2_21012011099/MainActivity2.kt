package com.example.assignment2_21012011099

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible
import com.example.assignment2_21012011099.databinding.ActivityMain2Binding
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener
import com.google.android.material.card.MaterialCardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity2 : AppCompatActivity() {


    private lateinit var binding:ActivityMain2Binding


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding=ActivityMain2Binding.inflate(layoutInflater)


        var back: FloatingActionButton =findViewById(R.id.back)
        var add:MaterialCardView=findViewById(R.id.add)
        var text:TextView=findViewById(R.id.tv)
        var pdfView:PDFView =findViewById(R.id.pdfView)
        var pageView:TextView=findViewById<TextView?>(R.id.pageView)
        pageView.isVisible=false
        var dark=true

        back.setOnClickListener(){
            finish()
        }

        val launcher = registerForActivityResult(ActivityResultContracts.GetContent())
        {
            uri ->
            uri?.let{
                add.isVisible=false
                text.isVisible=false
                pageView.isVisible=true
                pdfView.fromUri(it)
                    .swipeHorizontal(true)
                    .pageSnap(true)
                    .autoSpacing(true)
                    .pageFling(true)
                    .enableSwipe(true)
                    .defaultPage(0)
                    .onPageChange(object : OnPageChangeListener {
                    override fun onPageChanged(page: Int, pageCount: Int) {
                        // Update page number text
                        pageView.text = "Page: ${page + 1} of $pageCount"
                    }
                    })
                    .enableDoubletap(true)
                    .load()
                }
        }

        add.setOnClickListener(){
            //pdfView.fromAsset("P_6.pdf").swipeHorizontal(true).pageSnap(true).autoSpacing(true).pageFling(true).enableSwipe(true).load()
            launcher.launch("application/pdf")
        }
    }

}