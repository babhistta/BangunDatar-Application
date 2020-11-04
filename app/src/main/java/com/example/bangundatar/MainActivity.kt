package com.example.bangundatar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncrcle.setOnClickListener{
            val judul = "Lingkaran"
            val bilangan1 = "Diameter"
            val bilangan2 = "Jari Jari"
            val intent = Intent(this, Hitung::class.java)
            intent.putExtra("data1", judul)
            intent.putExtra("data2", bilangan1)
            intent.putExtra("data3", bilangan2)
            intent.putExtras(intent)
            startActivity(intent)
        }
        btnsqr.setOnClickListener{
            val judul = "Persegi"
            val bilangan1 = "Panjang"
            val bilangan2 = "Lebar"
            val intent = Intent(this, Hitung::class.java)
            intent.putExtra("data1", judul)
            intent.putExtra("data2", bilangan1)
            intent.putExtra("data3", bilangan2)
            intent.putExtras(intent)
            startActivity(intent)
        }
        btntrgl.setOnClickListener{
            val judul = "Segitiga"
            val bilangan1 = "Sisi 1"
            val bilangan2 = "Sisi 2"
            val bilangan3 = "Sisi 3"
            val intent = Intent(this, Hitungsgtg::class.java)
            intent.putExtra("data", judul)
            intent.putExtra("data1", bilangan1)
            intent.putExtra("data2", bilangan2)
            intent.putExtra("data3", bilangan3)
            intent.putExtras(intent)
            startActivity(intent)
        }

    }
}