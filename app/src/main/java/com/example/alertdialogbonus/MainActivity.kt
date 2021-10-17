package com.example.alertdialogbonus

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import kotlinx.android.synthetic.main.dialogue_view.view.*

class MainActivity : AppCompatActivity() {
    lateinit var btShow:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btShow=findViewById(R.id.btShow)
        btShow.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = LayoutInflater.from(this).inflate(R.layout.dialogue_view, null)
            builder.setView(dialogView)
            // Create the AlertDialog
            dialogView.tv.setOnClickListener {
                dialogView.textView.text= dialogView.editText.text
                dialogView.editText.setText("")
            }
            dialogView.go.setOnClickListener {
                val intent= Intent(this,MainActivity2::class.java)
                intent.putExtra("textView",dialogView.textView.text)
                startActivity(intent)
            }
            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}