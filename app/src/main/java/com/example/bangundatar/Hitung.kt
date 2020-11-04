package com.example.bangundatar

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.hitung.*

class Hitung : AppCompatActivity(){
    private lateinit var judul : TextView
    private lateinit var bilangan1 : TextView
    private lateinit var bilangan2 : TextView
    private lateinit var bil1 : EditText
    private lateinit var bil2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hitung)

        judul = this.findViewById(R.id.txtJudul)
        bilangan1 = this.findViewById(R.id.txt1)
        bilangan2 = this.findViewById(R.id.txt2)

        judul.text = intent.getStringExtra("data1")
        bilangan1.text = intent.getStringExtra("data2")
        bilangan2.text = intent.getStringExtra("data3")

        val bd = "Persegi"

        bil1 = this.findViewById(R.id.inpt1)
        bil2 = this.findViewById(R.id.inpt2)

        btnHsl.setOnClickListener{
            if(judul.text == bd) {
                if (bil1.length() == 0 && bil2.length() == 0) {
                    Toast.makeText(application, "Panjang dan lebar tidak boleh Kosong", Toast.LENGTH_LONG).show()
                } else if (bil1.length() == 0) {
                    Toast.makeText(application, "Panjang tidak boleh kososng", Toast.LENGTH_LONG).show()
                } else if (bil2.length() == 0) {
                    Toast.makeText(application, "Lebar tidak boleh kosong", Toast.LENGTH_LONG).show()
                } else {
                    val panjang: Int = Integer.parseInt(bil1.text.toString())
                    val lebar: Int = Integer.parseInt(bil1.text.toString())
                    val keliling: Int = 2 * (panjang + lebar)
                    val luas: Int = panjang * lebar
                    val intent = Intent(this, Hasil::class.java)
                    intent.putExtra("data1", luas.toString())
                    intent.putExtra("data2", keliling.toString())
                    intent.putExtras(intent)
                    startActivity(intent)
                }
            }
            else{
                if (bil1.length() == 0 && bil2.length() == 0) {
                    Toast.makeText(application, "Jari-jari Atau Diameter tidak boleh Kosong", Toast.LENGTH_LONG).show()
                } else if (bil1.length() == 0) {
                    Toast.makeText(application, "Diameter tidak boleh kososng", Toast.LENGTH_LONG).show()
                } else if (bil2.length() == 0) {
                    Toast.makeText(application, "Jari-jari tidak boleh kosong", Toast.LENGTH_LONG).show()
                }else {
                    val jari: Int = Integer.parseInt(bil1.text.toString())
                    val pi: Int = 22/7
                    val keliling: Int = 2*pi*jari
                    val luas: Int = pi*jari*jari
                    val intent = Intent(this, Hasil::class.java)
                    intent.putExtra("data1", luas.toString())
                    intent.putExtra("data2", keliling.toString())
                    intent.putExtras(intent)
                    startActivity(intent)
                }
            }
        }
    }
}

