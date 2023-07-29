package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            var nome = binding.editTextText.text.toString()
            binding.textResultado.text = nome.toString()

        }
        binding.BTNCalc.setOnClickListener {
            var calc = binding.EDTCalc1.text.toString().toDouble()
            var calc2 = binding.EDTCalc2.text.toString().toDouble()
            var result = calc * calc2
            binding.textResultado.text = result.toDouble().toString()


        }

    }


}