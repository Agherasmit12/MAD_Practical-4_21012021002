package com.example.mad_practical_4_21012021002

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import layout.LoginActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrtion)

        val login: Button = findViewById(R.id.login)
        login.setOnClickListener {
            Intent(this, LoginActivity::class.java).also { startActivity(it) }
        }
    }
}
