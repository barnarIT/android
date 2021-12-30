package com.example.firsttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btn : Button
        var txt : TextView

        btn = findViewById(R.id.btn2)
        txt = findViewById(R.id.txt2)

        btn.setOnClickListener {
            txt.setText("Text After")
        }
    }
}