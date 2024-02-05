package com.example.job15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Aplikasi berjalan", Toast.LENGTH_SHORT).show()

        val tombol = findViewById<Button>(R.id.Nama)

        tombol.setOnClickListener{
            Toast.makeText(this, "Apriza Tri Maulidina", Toast.LENGTH_SHORT).show()

            val tombol = findViewById<Button>(R.id.Kelas)

            tombol.setOnClickListener{
                Toast.makeText(this, "XI PPLG 1", Toast.LENGTH_SHORT).show()

                val tombol = findViewById<Button>(R.id.NIS)

                tombol.setOnClickListener{
                    Toast.makeText(this, "2233246", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}