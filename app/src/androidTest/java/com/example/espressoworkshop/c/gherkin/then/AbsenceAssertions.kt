package com.example.espressoworkshop.c.gherkin.then

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R
import org.hamcrest.CoreMatchers.not

object AbsenceAssertions {

    // Each of these assertions have the same behaviour, just with a different view and string
    // it makes sense to put this duplication into a method
    fun incorrectEmailError() = apply {
        assertViewDoesNotShowError(R.id.email_field, "Incorrect email")
    }

    fun incorrectPasswordError() = apply {
        assertViewDoesNotShowError(R.id.password_field, "Incorrect password")
    }


    // This is our helper method that we can reuse
    private fun assertViewDoesNotShowError(view: Int, errorText: String) {
        onView(withId(view))
            .check(matches(not(hasErrorText(errorText))))
    }
}