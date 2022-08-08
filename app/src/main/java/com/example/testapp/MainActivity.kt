package com.example.testapp

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var firstFragmentString = ""
    var secondFragmentString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnRv = findViewById<Button>(R.id.btnRv)

        btnRv.setOnClickListener {
            recyclerViewStart()
        }

    }

    private fun recyclerViewStart() {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }


    override fun onRestart() {
        super.onRestart()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}