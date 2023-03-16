package com.yogi.belajarintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahObjekActivity : AppCompatActivity() {
    private lateinit var tvpenerimaObjek : TextView
    companion object {
        const val EXTRA_CARS = "extra_cars"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_objek)

        tvpenerimaObjek = findViewById<TextView>(R.id.tv_penerima_objek)

        val cars: Cars = intent.getParcelableExtra<Cars>(EXTRA_CARS) as Cars
        val text = "Merk : ${cars.merk.toString()} \nTahun : ${cars.tahun.toString()} \nPlat : ${cars.plat.toString()}"
        tvpenerimaObjek.text = text
    }
}