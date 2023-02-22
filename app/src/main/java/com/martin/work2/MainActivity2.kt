package com.martin.work2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val signin = findViewById<Button>(R.id.btnsignin)
        val signup = findViewById<Button>(R.id.btnsignup)

        signin.setOnClickListener {
            val p = Intent(this,MainActivity::class.java)
            startActivity(p)
        }
        signup.setOnClickListener {
            val q = Intent(this,home::class.java)
            startActivity(q)
        }
    }
}