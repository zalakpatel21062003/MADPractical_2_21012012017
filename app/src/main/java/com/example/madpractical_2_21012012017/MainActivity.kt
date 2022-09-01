package com.example.madpractical_2_21012012017

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG="MainActivity"
    private lateinit var mycl:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "onCreate: onCreate function Called")
        Toast.makeText(this, "onCreate: onCreate function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onCreate: onCreate function Called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: onStart function Called")
        Toast.makeText(this, "onStart: onStart function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStart: onStart function Called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: onPause function Called")
        Toast.makeText(this, "onPause: onPause function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onPause: onPause function Called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: onStop function Called")
        Toast.makeText(this, "onStop: onStop function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStop: onStop function Called",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: onDestroy function Called")
        Toast.makeText(this, "onDestroy: onDestroy function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onDestroy: onDestroy function Called",Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: onRestart function Called")
        Toast.makeText(this, "onRestart: onRestart function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onRestart: onRestart function Called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "onResume: onResume function Called")
        Toast.makeText(this, "onResume: onResume function Called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onResume: onResume function Called",Snackbar.LENGTH_LONG).show()
    }
}