package com.example.espressoworkshop

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), DoggoFragment.OnFragmentInteractionListener {

    private lateinit var emailField: EditText
    private lateinit var passwordField: EditText
    private lateinit var signInButton: Button

    private val correctEmail = "a"
    private val correctPassword = "a"

    override fun onFragmentInteraction(doggoImageView: ImageView) {
        val doggoImage = findViewById<ImageView>(R.id.doggo_image_view)
        doggoImage.setOnClickListener {
            doggoImage.setImageResource(R.drawable.doggo2)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        emailField = findViewById(R.id.email_field)
        passwordField = findViewById(R.id.password_field)
        signInButton = findViewById(R.id.sign_in_button)

        signInButton.setOnClickListener {
            resetLoginScreen()
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            if (email != correctEmail) showEmailError()
            if (password != correctPassword) showPasswordError()

            if (email == correctEmail && password == correctPassword) {
                showDoggos()
            }

        }

    }

    private fun resetLoginScreen() {
        emailField.error = null
        passwordField.error = null
    }

    private fun showEmailError() {
        emailField.error = "Incorrect email"
    }

    private fun showPasswordError() {
        passwordField.error = "Incorrect password"
    }

    private fun showDoggos() {
        val fragment = DoggoFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.rootLayout, fragment, "doggo")
            .addToBackStack(null)
            .commit()

        hideKeyboard(this)
    }

    private fun hideKeyboard(activity: Activity) {
        val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        //Find the currently focused view, so we can grab the correct window token from it.
        var view = activity.currentFocus
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}
