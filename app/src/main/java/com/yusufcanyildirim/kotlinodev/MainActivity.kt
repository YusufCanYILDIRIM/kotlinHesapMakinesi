package com.yusufcanyildirim.kotlinodev

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yusufcanyildirim.kotlinodev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var firstNumber: Double? = null
    var secondNumber: Double? = null
    var sonuc: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun topla(view: View) {
        firstNumber = binding.firstNumber.text.toString().toDoubleOrNull()
        secondNumber = binding.secondNumber.text.toString().toDoubleOrNull()
        if (firstNumber != null && secondNumber != null) {
            sonuc = firstNumber!! + secondNumber!!
            binding.result.text = "Sonuç: ${sonuc}"
        } else {
            binding.result.text = "Bir sayı giriniz"
        }
    }

    fun cikar(view: View) {
        firstNumber = binding.firstNumber.text.toString().toDoubleOrNull()
        secondNumber = binding.secondNumber.text.toString().toDoubleOrNull()
        if (firstNumber != null && secondNumber != null) {
            sonuc = firstNumber!! - secondNumber!!
            binding.result.text = "Sonuç: ${sonuc}"
        } else {
            binding.result.text = "Bir sayı giriniz"
        }
    }

    fun carpma(view: View) {
        firstNumber = binding.firstNumber.text.toString().toDoubleOrNull()
        secondNumber = binding.secondNumber.text.toString().toDoubleOrNull()
        if (firstNumber != null && secondNumber != null) {
            sonuc = firstNumber!! * secondNumber!!
            binding.result.text = "Sonuç: ${sonuc}"
        } else {
            binding.result.text = "Bir sayı giriniz"
        }
    }

    fun bolme(view: View) {
        firstNumber = binding.firstNumber.text.toString().toDoubleOrNull()
        secondNumber = binding.secondNumber.text.toString().toDoubleOrNull()
        if (firstNumber != null && secondNumber != null) {
            sonuc = firstNumber!! / secondNumber!!
            binding.result.text = "Sonuç: ${sonuc}"
        } else {
            binding.result.text = "Bir sayı giriniz"
        }
    }
}
