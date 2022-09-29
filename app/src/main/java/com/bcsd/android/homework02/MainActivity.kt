package com.bcsd.android.homework02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainEditText = findViewById<EditText>(R.id.main_edit_text_view)
        val mainTextView = findViewById<TextView>(R.id.main_show_text_view)
        val mainButtonView = findViewById<Button>(R.id.main_btn_set_text)

        mainButtonView.setOnClickListener(View.OnClickListener() {
            mainTextView.text = mainEditText.text.toString()
        })
    }
}