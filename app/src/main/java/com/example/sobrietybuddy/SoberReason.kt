package com.example.sobrietybuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SoberReason : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    fun gotoFuture(view: View?) {
        val intent = Intent(this, FutureDate::class.java)
        startActivity(intent)
    }
}