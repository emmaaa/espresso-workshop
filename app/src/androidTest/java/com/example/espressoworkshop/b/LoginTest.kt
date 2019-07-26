package com.example.espressoworkshop.b

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R
import org.hamcrest.Matcher
import org.junit.Test

class LoginTest : TestCase() {

    @Test
    fun launchAppTest() {
        launchApp()

        //todo i should probably put this assertion into a method somehow,
        // then i could use the same method to check the email field too
        onView(withId(R.id.password_field)).check(matches(isDisplayed()))
    }

//
//    fun assertDisplayingView(view: Matcher<View>) {
//        onView(withId(view)).check(matches(isDisplayed()))
//    }
}
