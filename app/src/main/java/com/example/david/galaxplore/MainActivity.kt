package com.example.david.galaxplore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import android.support.v4.app.Fragment

const val EXTRA_GALAXNAME = "com.example.david.galaxplore.GalaxName"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendGalaxName(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val GalaxName = editText.text.toString()
        val intent = Intent(this, DisplayGalaxNameActivity::class.java).apply {
            putExtra(EXTRA_GALAXNAME, GalaxName)
        }
        startActivity(intent)
    }
}

