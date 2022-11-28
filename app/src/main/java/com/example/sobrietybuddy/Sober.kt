package com.example.sobrietybuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class Sober : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sober)
    }


    fun gotoDate(view: View?) {
        val intent = Intent(this, SoberDate::class.java)
        startActivity(intent)
    }
}