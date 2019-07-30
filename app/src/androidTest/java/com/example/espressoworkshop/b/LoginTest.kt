package com.example.espressoworkshop.b

import com.example.espressoworkshop.R
import com.example.espressoworkshop.b.Assertions.assertDisplayingView
import org.junit.Test

class LoginTest : TestCase() {

    @Test
    fun launchAppTest() {

        launchTheApp()

        //todo 2: i should probably put this assertion into a method somehow,
        // then i could use the same method to check the email field too
        assertDisplayingView(R.id.sign_in_text)
        assertDisplayingView(R.id.email_field)
    }


}
