package com.example.espressoworkshop.a

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.example.espressoworkshop.MainActivity
import com.example.espressoworkshop.R
import org.junit.After
import org.junit.Rule
import org.junit.Test

class LoginTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    //todo 1: why does this always pass?....
    @Test
    fun launchAppTest() {
        val intent = Intent()
        activityRule.launchActivity(intent)

        onView(withId(R.id.sign_in_text))
    }

    @After
    fun tearDown() {
        activityRule.finishActivity()
    }
}