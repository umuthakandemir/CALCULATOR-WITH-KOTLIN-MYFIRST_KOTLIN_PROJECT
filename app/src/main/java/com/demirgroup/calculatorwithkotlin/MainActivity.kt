package com.demirgroup.calculatorwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.demirgroup.calculatorwithkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun subtraction(view: View){
        var number1 = binding.number1.text.toString().toInt()
        var number2 = binding.number2.text.toString().toInt()
        if (binding.number1.text.toString().equals("") && binding.number2.text.toString().equals("")){
            binding.result.text="please enter number 1 or number 2"
        }else{
            binding.result.text = "result ${number1-number2}"
        }
    }
    fun division(view: View){
        var number1 : Double = binding.number1.text.toString().toDouble()
        var number2 : Double = binding.number2.text.toString().toDouble()
        if (binding.number1.text.toString().equals("") && binding.number2.text.toString().equals("")){
            binding.result.text="please enter number 1 or number 2"
        }else{
            binding.result.text = "result ${number1/number2}"
        }
    }

    fun multiplication(view: View){
        var number1 = binding.number1.text.toString().toInt()
        var number2 = binding.number2.text.toString().toInt()
        if (binding.number1.text.toString().equals("") && binding.number2.text.toString().equals("")){
            binding.result.text="please enter number 1 or number 2"
        }else{
            binding.result.text = "result ${number1*number2}"
        }
    }
    fun sum(view:View){
        var number1 = binding.number1.text.toString().toInt()
        var number2 = binding.number2.text.toString().toInt()
        if (binding.number1.text.toString().equals("") && binding.number2.text.toString().equals("")){
            binding.result.text="please enter number 1 or number 2"
        }else{
            binding.result.text = "result ${number1+number2}"
        }
    }
}