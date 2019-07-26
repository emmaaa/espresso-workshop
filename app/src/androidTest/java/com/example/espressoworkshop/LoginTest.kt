package com.example.espressoworkshop

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Test

class LoginTest : TestCase() {

    @Test
    fun launchAppTest() {
        launchApp()
        onView(withId(R.id.password_field)).check(matches(isDisplayed()))
    }
}
