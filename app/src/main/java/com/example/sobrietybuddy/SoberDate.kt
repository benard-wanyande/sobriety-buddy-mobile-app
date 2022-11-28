package com.example.sobrietybuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SoberDate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soberdate)
    }

    fun gotoSoberReason(view: View?) {
        val intent = Intent(this, SoberReason::class.java)
        startActivity(intent)
    }
}