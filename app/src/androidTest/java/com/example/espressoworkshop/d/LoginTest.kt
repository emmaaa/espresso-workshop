package com.example.espressoworkshop.d

import com.example.espressoworkshop.c.gherkin.`when`.When
import com.example.espressoworkshop.c.gherkin.given.Given
import com.example.espressoworkshop.c.gherkin.then.Then
import org.junit.Test

class LoginTest : TestCase() {

    @Test
    fun signInJourney() {

        Given.user.launchesTheApp()

        When.user.signsInWithCorrectDetails()

        Then.userSees.doggo()

        When.user.clicksDoggo()

        Then.userSees.doggo()

    }

}
