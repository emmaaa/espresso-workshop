package com.example.espressoworkshop.c

import com.example.espressoworkshop.c.gherkin.`when`.When
import com.example.espressoworkshop.c.gherkin.given.Given
import com.example.espressoworkshop.c.gherkin.then.Then
import org.junit.Test

// You might notice that we aren't extending TestCase any more, even though we use the same method!
// this is a benefit of ths Given.user.launchesTheApp() structure

class LoginTest {


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
