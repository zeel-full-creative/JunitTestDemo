package com.app.junittestdemo

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.util.*

class EmailValidatorTest {

    @Test
    fun testIsEmailValid() {
        val testEmail = "anupamchugh@gmail.com"
        Assert.assertThat(String.format("Email Validity Test failed for %s ", testEmail), EmailUtils.checkEmailForValidity(testEmail), `is`(true))
    }

    @Test
    fun testCheckDateWasConvertedCorrectly() {
        val inMillis = System.currentTimeMillis()
        val date: Date = EmailUtils.calendarDate(inMillis)
        assertEquals(
            "Date time in millis is wrong",
            inMillis * 1000, date.time
        )
    }

    @Test
    fun testEmailValidityPartTwo() {
        val testEmail = "   solankizeel@gmail.com  "
        Assert.assertThat(String.format("Email Validity Test failed for %s ", testEmail), EmailUtils.checkEmailForValidity(testEmail), `is`(true))
    }

    @Test
    fun emailStringNullCheck() {
        Assert.assertThat(EmailUtils.emailStringChecker(""), `is`(""))
    }

    @Test
    fun emailStringEmptyCheck() {
        Assert.assertThat(EmailUtils.emailStringChecker(""), `is`(""))
    }

}