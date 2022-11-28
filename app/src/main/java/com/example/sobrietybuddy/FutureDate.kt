package com.example.sobrietybuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FutureDate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_future_date)
    }

    fun gotoSpecific(view: View?) {
        val intent = Intent(this, SpecificAddictionHomePage::class.java)
        startActivity(intent)
    }
}