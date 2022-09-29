package com.bcsd.android.homework02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById(R.id.editText) as EditText
        val textView = findViewById(R.id.textView) as TextView
        val button = findViewById(R.id.button) as Button
        button.setOnClickListener(View.OnClickListener(){
            @Override
            fun onClick(view : View){
                textView.setText(editText.text.toString())
            }
        })
}