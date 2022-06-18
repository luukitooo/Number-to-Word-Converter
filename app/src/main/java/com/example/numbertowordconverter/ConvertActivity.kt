package com.example.numbertowordconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.numbertowordconverter.databinding.ActivityConvertBinding

class ConvertActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConvertBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConvertBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClickListeners()

    }

    private fun onClickListeners() {
        binding.convertButton.setOnClickListener {
            val number = if (binding.numberTextInput.text.toString() != "") {
                binding.numberTextInput.text.toString().toInt()
            } else {
                return@setOnClickListener
            }
            binding.numberTextInput.text?.clear()
            if (number < 0 || number > 1000) {
                binding.resultTextView.text = "თქვენ შეიყვანეთ არასწორი რიცხვი!"
                return@setOnClickListener
            }
            when (number.toString().length) {
                1 -> binding.resultTextView.text = Converter().singleDigitToWord(number)
                2 -> binding.resultTextView.text = Converter().twoDigitsToWord(number)
                3 -> binding.resultTextView.text = Converter().threeDigitsToWord(number)
                else -> binding.resultTextView.text = "ათასი"
            }
        }
    }
}