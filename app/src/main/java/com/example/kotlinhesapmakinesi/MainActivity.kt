package com.example.kotlinhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlinhesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var s1:Int?=null
    var s2:Int?=null
    var result:Int?=null
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }
    fun mySum(view: View){
         s1=binding.editTextNumber.text.toString().toIntOrNull()
         s2=binding.editTextNumber2.text.toString().toIntOrNull()

        if(s1==null||s2==null){
            binding.ResultText.text="ERROR!!!"
        }
        else{
            result=s1!!+s2!!
            binding.ResultText.text="result: $result"
        }



    }
    fun mySub(view: View){
        s1=binding.editTextNumber.text.toString().toIntOrNull()
        s2=binding.editTextNumber2.text.toString().toIntOrNull()

        if(s1==null||s2==null){
            binding.ResultText.text="ERROR!!!"
        }
        else{
            result=s1!!-s2!!
            binding.ResultText.text="result: $result"
        }
    }
    fun myMultiply(view: View){
        s1=binding.editTextNumber.text.toString().toIntOrNull()
        s2=binding.editTextNumber2.text.toString().toIntOrNull()

        if(s1==null||s2==null){
            binding.ResultText.text="ERROR!!!"
        }
        else{
            result=s1!!*s2!!
            binding.ResultText.text="result: $result"
        }
    }
    fun myDiv(view: View){
        s1=binding.editTextNumber.text.toString().toIntOrNull()
        s2=binding.editTextNumber2.text.toString().toIntOrNull()

        if(s1==null||s2==null){
            binding.ResultText.text="ERROR!!!"
        }
        else{
            result=s1!!/s2!!
            binding.ResultText.text="result: $result"
        }
    }
}