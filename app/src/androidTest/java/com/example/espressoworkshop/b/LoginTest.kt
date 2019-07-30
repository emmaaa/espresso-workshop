package com.example.espressoworkshop.b

import com.example.espressoworkshop.R
import com.example.espressoworkshop.b.Assertions.assertDisplayingView
import org.junit.Test

class LoginTest : TestCase() {

    @Test
    fun launchAppTest() {

        launchTheApp()

        assertDisplayingView(R.id.sign_in_text)
        assertDisplayingView(R.id.email_field)
    }

}
