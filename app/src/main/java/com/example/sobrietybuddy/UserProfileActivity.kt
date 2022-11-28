package com.example.sobrietybuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class UserProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)
    }


    fun gotoSober(view: View?) {
        val intent = Intent(this, Sober::class.java)
        startActivity(intent)
    }
}