package com.example.espressoworkshop.b

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers

object Assertions {

    fun assertDisplayingView(view: Int) {
        Espresso.onView(ViewMatchers.withId(view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}