package com.example.espressoworkshop.c.gherkin.then

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R
import org.hamcrest.CoreMatchers.not

object AbsenceAssertions {

    fun incorrectEmailError() = apply {
        onView(withId(R.id.email_field))
            .check(matches(not(hasErrorText("Incorrect email"))))

    }

    fun incorrectPasswordError() = apply {
        onView(withId(R.id.password_field))
            .check(matches(not(hasErrorText("Incorrect password"))))
    }
}