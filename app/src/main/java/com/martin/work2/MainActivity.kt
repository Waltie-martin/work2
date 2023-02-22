package com.martin.work2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //name of the item e.g button, image
        val signin = findViewById<Button>(R.id.btnsignup)
        val signup = findViewById<Button>(R.id.btnsignin)

        //adding an onclicklistener
        signin.setOnClickListener {
            val i = Intent(this,home::class.java)
            startActivity(i)
        }
        signup.setOnClickListener {
            val z = Intent(this,MainActivity2::class.java)
            startActivity(z)
        }
    }
}