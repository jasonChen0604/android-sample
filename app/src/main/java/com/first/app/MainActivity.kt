package com.first.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view:View){
        val editTextAccount = findViewById<EditText>(R.id.editTextAccount)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)

        val account = editTextAccount.text
        val password = editTextPassword.text

        Toast.makeText(this, "$account / $password",Toast.LENGTH_SHORT).show()
    }
}