package com.example.espressoworkshop.b

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R
import org.junit.Test

class LoginTest : TestCase() {

    @Test
    fun launchAppTest() {

        launchTheApp()

        //todo 2: i should probably put this assertion into a method somehow,
        // then i could use the same method to check the email field too
        onView(withId(R.id.sign_in_text)).check(matches(isDisplayed()))
    }


//
//    fun assertDisplayingView(view: Matcher<View>) {
//        onView(withId(view)).check(matches(isDisplayed()))
//    }
}
