package com.example.espressoworkshop.c

import com.example.espressoworkshop.c.gherkin.`when`.When
import com.example.espressoworkshop.c.gherkin.given.Given
import com.example.espressoworkshop.c.gherkin.then.Then
import org.junit.Test

class LoginTest : TestCase() {


    private val correctEmail = "test@login.com"
    private val correctPassword = "secure"

    @Test
    fun unsuccessfulLoginTest() {
        Given.user.launchesTheApp()

        When.user
            .entersEmailAddress("an incorrect email address")
            .entersPassword("isdfisahdfi")
            .selectsSignInButton()

        Then.userSees
            .incorrectEmailError()
            .incorrectPasswordError()
    }

    @Test
    fun successfulLoginTest() {
        Given.user.launchesTheApp()

        When.user
            .entersEmailAddress(correctEmail)
            .entersPassword(correctPassword)
            .selectsSignInButton()

        Then.userCannotSee
            .incorrectEmailError()
            .incorrectPasswordError()
    }

}
