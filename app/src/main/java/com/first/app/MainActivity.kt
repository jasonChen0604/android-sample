package com.first.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }

    fun onForgetPwdClick(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
        startActivity(browserIntent)
    }

    fun onSignInClick(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/jasonChen0604/android-sample"))
        startActivity(browserIntent)
    }
}