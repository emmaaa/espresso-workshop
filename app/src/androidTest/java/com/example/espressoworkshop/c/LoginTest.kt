package com.example.espressoworkshop.c

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R
import com.example.espressoworkshop.c.gherkin.`when`.When
import com.example.espressoworkshop.c.gherkin.given.Given
import org.junit.Test

class LoginTest : TestCase() {

    @Test
    fun unsuccessfulLoginTest() {
        Given.user.launchesTheApp()

        When.user.entersEmailAddress("an incorrect email address")

        //todo 3: this would be nicer as Then.userSees.incorrectEmailError()
        onView(withId(R.id.email_field)).check(matches(hasErrorText("Incorrect email")))

        //todo 4: user needs to enter an incorrect password first
        onView(withId(R.id.email_field)).check(matches(hasErrorText("Incorrect password")))
    }

    @Test
    fun successfulLoginTest() {

        //todo 5: write a test to check that error messages are not displayed when correct login is entered

    }

}
