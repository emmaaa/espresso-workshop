package com.example.espressoworkshop.c

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R
import com.example.espressoworkshop.b.TestCase
import com.example.espressoworkshop.c.gherkin.`when`.When
import com.example.espressoworkshop.c.gherkin.given.Given
import org.junit.Test

class LoginTest : TestCase() {

    @Test
    fun badLoginTest() {
        Given.user.launchesTheApp()

        When.user.entersIncorrectLogin()

        //todo this is failing and i don't know why...
        onView(withId(R.id.email_field)).check(matches(hasErrorText("Incorrect email")))
        onView(withId(R.id.email_field)).check(matches(hasErrorText("Incorrect password")))

    }

    @Test
    fun successfulLoginTest() {


    }

}
