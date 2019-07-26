package com.example.espressoworkshop.c.gherkin.given

import android.content.Intent
import androidx.test.rule.ActivityTestRule
import com.example.espressoworkshop.MainActivity
import org.junit.After
import org.junit.Rule

object UserArrangements {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    fun launchesTheApp() {
        val intent = Intent()
        activityRule.launchActivity(intent)
    }

    @After
    fun tearDown() {
        activityRule.finishActivity()
    }
}