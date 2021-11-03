package com.app.junittestdemo

import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import org.junit.Test

class CalculatorTestCase : TestCase() {

    private val calculatorTest = Calculator()


    override fun setUp() {
        super.setUp()
    }

    override fun tearDown() {
        super.tearDown()
    }

    fun testAddition() {
        val expected = 42
        assertEquals(expected, calculatorTest.addition(40, 2))
        println("Is Tests are completed successfully = ${createResult().wasSuccessful()}")
    }

    fun testSub() {
        println("Is Tests are completed successfully = ${createResult().wasSuccessful()}")
    }

    fun testDiv() {

    }

    fun testMultiply() {}

}