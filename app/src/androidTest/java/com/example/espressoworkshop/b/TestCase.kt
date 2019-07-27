package com.example.espressoworkshop.b

import android.content.Intent
import androidx.test.rule.ActivityTestRule
import com.example.espressoworkshop.MainActivity
import org.junit.After
import org.junit.Rule

open class TestCase {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    fun launchTheApp() {
        val intent = Intent()
        activityRule.launchActivity(intent)
    }

    @After
    fun tearDown() {
        activityRule.finishActivity()
    }
}