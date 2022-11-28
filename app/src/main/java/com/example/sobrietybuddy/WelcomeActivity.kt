package com.example.sobrietybuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun goToLoginPage(view: View?) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun goToRegistrationPage(view: View?) {
        val intent = Intent(this, RegistrationActivity::class.java)
        startActivity(intent)
    }
}