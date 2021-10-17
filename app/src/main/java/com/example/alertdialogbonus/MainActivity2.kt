package com.example.alertdialogbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.dialogue_view.view.*

class MainActivity2 : AppCompatActivity() {
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textView=findViewById(R.id.textView)
        val text=intent.getStringExtra("textView").toString()
        Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        textView.setText(text)
    }
}