package com.example.espressoworkshop

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailField = findViewById<EditText>(R.id.email_field)
        val passwordField = findViewById<EditText>(R.id.password_field)
        val signInButton = findViewById<Button>(R.id.sign_in_button)

        val correctEmail = "letmein@please.com"
        val correctPassword = "super_secure"

        signInButton.setOnClickListener {
            val email = emailField.toString()
            val password = passwordField.toString()

            when (email) {
                correctEmail -> {
                    // email is correct
                }
                else -> emailField.error = "Incorrect email"
            }

            when (password) {
                correctPassword -> {
                    // password is correct
                }
                else -> passwordField.error = "Incorrect password"
        }

    }

}

}
