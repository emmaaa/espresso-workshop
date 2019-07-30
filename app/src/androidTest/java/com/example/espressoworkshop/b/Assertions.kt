package com.example.espressoworkshop.b

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

object Assertions {

    fun assertDisplayingView(view: Int) {
        onView(withId(view)).check(matches(isDisplayed()))
    }


//    this above method is fine, but as we call it twice, why not allow multiple parameters? :)
//    the unused function below allows us to say:
//        assertDisplayingView(R.id.email_field, R.id.password_field)
//    instead
//

    fun assertDisplayingView(vararg view: Int) {
        view.forEach {
            onView(withId(it)).check(matches(isDisplayed()))
        }
    }


}