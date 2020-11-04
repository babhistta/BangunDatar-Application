package com.example.bangundatar

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.hitungsgtg.*

class Hitungsgtg : AppCompatActivity(){
    private lateinit var judul : TextView
    private lateinit var bilangan1 : TextView
    private lateinit var bilangan2 : TextView
    private lateinit var bilangan3 : TextView
    private lateinit var bil1 : EditText
    private lateinit var bil2 : EditText
    private lateinit var bil3 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hitungsgtg)

        judul = this.findViewById(R.id.txtJudulsgtg)
        bilangan1 = this.findViewById(R.id.txt1sgtg)
        bilangan2 = this.findViewById(R.id.txt2sgtg)
        bilangan3 = this.findViewById(R.id.txt3sgtg)

        judul.text = intent.getStringExtra("data")
        bilangan1.text = intent.getStringExtra("data1")
        bilangan2.text = intent.getStringExtra("data2")
        bilangan3.text = intent.getStringExtra("data3")

        bil1 = this.findViewById(R.id.inpt1sgtg)
        bil2 = this.findViewById(R.id.inpt2sgtg)
        bil3 = this.findViewById(R.id.inpt3sgtg)

        btnHslsgtg.setOnClickListener{
            if (bil1.length() == 0 && bil2.length() == 0 && bil3.length() == 0) {
                Toast.makeText(application, "Sisi 1, sisi 2 dan sisi 3 tidak boleh Kosong", Toast.LENGTH_LONG).show()
            }else if (bil1.length() == 0 && bil2.length() == 0) {
                Toast.makeText(application, "Sisi 1 dan sisi 2 tidak boleh Kosong", Toast.LENGTH_LONG).show()
            } else if (bil2.length() == 0 && bil3.length() == 0) {
                Toast.makeText(application, "Sisi 2 dan sisi 3 tidak boleh Kosong", Toast.LENGTH_LONG).show()
            } else if (bil1.length() == 0 && bil3.length() == 0) {
                Toast.makeText(application, "Sisi 1 dan sisi 3 tidak boleh Kosong", Toast.LENGTH_LONG).show()
            } else if (bil1.length() == 0) {
                Toast.makeText(application, "Sisi 1 tidak boleh kososng", Toast.LENGTH_LONG).show()
            } else if (bil2.length() == 0) {
                Toast.makeText(application, "Sisi 2 tidak boleh kosong", Toast.LENGTH_LONG).show()
            } else if (bil3.length() == 0) {
                Toast.makeText(application, "Sisi 3 tidak boleh kosong", Toast.LENGTH_LONG).show()
            } else {
                val s1: Int = Integer.parseInt(bil1.text.toString())
                val s2: Int = Integer.parseInt(bil2.text.toString())
                val s3: Int = Integer.parseInt(bil3.text.toString())
                val keliling: Int = s1+s2+s3
                val luas: Int = s1*s2/2
                val intent = Intent(this, Hasil::class.java)
                intent.putExtra("data1", luas.toString())
                intent.putExtra("data2", keliling.toString())
                intent.putExtras(intent)
                startActivity(intent)
            }
        }
    }
}

