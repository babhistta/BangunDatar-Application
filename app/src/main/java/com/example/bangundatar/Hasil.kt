package com.example.bangundatar

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.hasil.*

class Hasil : AppCompatActivity(){
    private lateinit var luas : TextView
    private lateinit var keliling : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hasil)

        luas = findViewById(R.id.txtHslLs)
        keliling = findViewById(R.id.txtHslKllg)

        keliling.text = intent.getStringExtra("data2")
        luas.text = intent.getStringExtra("data1")

        btnBrnd.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}