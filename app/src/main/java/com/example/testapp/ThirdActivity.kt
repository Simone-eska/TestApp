package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val layoutManager = GridLayoutManager(this, 2)

        val rv: RecyclerView = findViewById(R.id.rv)

        rv.layoutManager = layoutManager
    }
}