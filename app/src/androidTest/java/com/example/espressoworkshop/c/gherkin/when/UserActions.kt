package com.example.espressoworkshop.c.gherkin.`when`

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.espressoworkshop.R

object UserActions {

    fun entersCorrectLogin() {
        onView(withId(R.id.email_field)).perform(typeText("letmein@please.com"))
        onView(withId(R.id.password_field)).perform(typeText("super_secure"))

        onView(withId(R.id.sign_in_button)).perform(click())
    }

    fun entersIncorrectLogin() {
        onView(withId(R.id.email_field)).perform(typeText("errrm"))
        onView(withId(R.id.password_field)).perform(typeText("no idea"))

        onView(withId(R.id.sign_in_button)).perform(click())
    }
}