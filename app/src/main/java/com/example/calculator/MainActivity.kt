package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputText: String
        var resultText : String

        fun lookupBtn(id : Int) : Button{
            return findViewById(id)
        }

        lookupBtn(R.id.ButtonClearEntry).setOnClickListener{
            lookupBtn(R.id.ButtonClearEntry).background = #BEBEBE
            inputText = ""
            lookupBtn(R.id.ResultTextView).text = inputText
        }
        lookupBtn(R.id.Button0).setOnClickListener{
            inputText = ""
            lookupBtn(R.layout.ResultTextView).text = inputText
        }
    }
}