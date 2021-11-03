package com.app.junittestdemo

import com.app.junittestdemo.EmailUtils
import java.util.*
import java.util.regex.Pattern

object EmailUtils {

    private const val MILLIS = 1000
    fun checkEmailForValidity(email: String): Boolean {
        var email = email
        email = email.trim { it <= ' ' }
        val matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email)
        return matcher.find()
    }

    fun emailStringChecker(email: String?): String? {
        return ""
    }

    private val VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)
    fun calendarDate(epocSeconds: Long): Date {
        val c = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        c.timeInMillis = epocSeconds * MILLIS
        return c.time
    }
}