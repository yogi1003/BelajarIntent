package com.yogi.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PindahActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah)

        val btnIntentawal = findViewById<Button>(R.id.btn_awal)

        btnIntentawal.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_awal -> run{
                val keawal = Intent(this@PindahActivity, MainActivity::class.java)
                startActivity(keawal)
            }
        }
    }
}