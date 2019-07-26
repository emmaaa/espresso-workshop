package com.example.espressoworkshop.c

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R
import com.example.espressoworkshop.b.TestCase
import com.example.espressoworkshop.c.gherkin.given.Given
import org.junit.Test

class LoginTest : TestCase() {

    @Test
    fun launchAppTest() {
        Given.user.launchesTheApp()

        onView(withId(R.id.password_field)).check(matches(isDisplayed()))
    }

}
