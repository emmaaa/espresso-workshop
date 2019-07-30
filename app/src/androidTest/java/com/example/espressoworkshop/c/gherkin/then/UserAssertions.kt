package com.example.espressoworkshop.c.gherkin.then

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.espressoworkshop.R
import org.hamcrest.CoreMatchers.allOf

object UserAssertions {

    fun incorrectEmailError() = apply {
        assertViewHasErrorText(R.id.email_field, "Incorrect email")
    }

    fun incorrectPasswordError() = apply {
        assertViewHasErrorText(R.id.password_field, "Incorrect password")
    }

    fun doggo() {
        onView(withId(R.id.doggo_image_view)).check(matches(isDisplayed()))
    }

    private fun assertViewHasErrorText(id: Int, errorText: String) {
        onView(withId(id)).check(matches(hasErrorText(errorText)))

    }
}