package com.example.espressoworkshop.c.gherkin.then

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.espressoworkshop.R
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.equalTo

object UserAssertions {

    fun incorrectEmailError() = apply {
        assertViewHasErrorText(R.id.email_field, "Incorrect email")
    }

    fun incorrectPasswordError() = apply {
        assertViewHasErrorText(R.id.password_field, "Incorrect password")
    }

    fun doggo1() {
        onView(withId(R.id.doggo_image_view))
            .check(matches(allOf(isDisplayed(), withTagValue(equalTo(R.drawable.doggo1)))))
    }

    fun doggo2() {
        onView(withId(R.id.doggo_image_view))
            .check(matches(allOf(isDisplayed(), withTagValue(equalTo(R.drawable.doggo2)))))
    }

    private fun assertViewHasErrorText(id: Int, errorText: String) {
        onView(withId(id)).check(matches(hasErrorText(errorText)))
    }



    // our "doggo1" and "doggo2" methods are the same code just with a different value.
    // an ideal candidate for a helper method
    // you'd call this by typing
    // assertDisplayingDoggo(R.drawable.doggo1)

    private fun assertDisplayingDoggo(doggoDrawable: Int) {
        onView(withId(R.id.doggo_image_view))
            .check(matches(allOf(isDisplayed(), withTagValue(equalTo(doggoDrawable)))))
    }
}