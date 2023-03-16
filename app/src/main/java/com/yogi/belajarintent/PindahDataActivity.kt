package com.yogi.belajarintent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class PindahDataActivity : AppCompatActivity(), View.OnClickListener {
    companion object{
        const val EXTRA_TEXT = "extra text"
    }

    private lateinit var tvPenerima : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)

        tvPenerima = findViewById(R.id.tv_terima_data)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text yang dikirim : $tvReceived"

        tvPenerima.text = text

        val btnkembali = findViewById<Button>(R.id.btn_kembali)
        btnkembali.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_kembali -> run {
                val awalagi = Intent(this@PindahDataActivity, MainActivity::class.java)
                startActivity(awalagi)
            }
        }
    }
}