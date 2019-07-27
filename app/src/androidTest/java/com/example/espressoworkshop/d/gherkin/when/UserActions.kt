package com.example.espressoworkshop.d.gherkin.`when`

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R

object UserActions {

    fun entersEmailAddress(email: String) {
        onView(withId(R.id.email_field)).perform(typeText(email))
    }

    fun clickSignInButton() {

    }
}