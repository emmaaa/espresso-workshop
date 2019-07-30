package com.example.espressoworkshop.c.gherkin.`when`

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R

object UserActions {

    fun entersEmailAddress(email: String) = apply {
        onView(withId(R.id.email_field)).perform(typeText(email))
    }

    fun entersPassword(password: String) = apply {
        onView(withId(R.id.password_field)).perform(typeText(password))

    }

    fun selectsSignInButton() = apply {
        onView(withId(R.id.sign_in_button)).perform(click())
    }

    fun signsInWithCorrectDetails() {
        entersEmailAddress("test@login.com")
        entersPassword("secure")
        selectsSignInButton()
    }

    fun clicksDoggo() {
        onView(withId(R.id.doggo_image_view)).perform(click())
    }
}