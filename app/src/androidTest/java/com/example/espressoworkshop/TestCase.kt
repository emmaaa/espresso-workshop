package com.example.espressoworkshop

import android.content.Intent
import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Rule

open class TestCase {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    fun launchApp() {
        val intent = Intent()
        activityRule.launchActivity(intent)
    }

    @After
    fun tearDown() {
        activityRule.finishActivity()
    }
}