package com.app.junittestdemo

import junit.framework.TestCase

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
        val expected = 0
        assertEquals(expected, calculatorTest.sub(5, 5))
        println("Is Tests are completed successfully = ${createResult().wasSuccessful()}")
    }

    fun testDiv() {
        val expected = 2
        assertEquals(expected, calculatorTest.div(4, 2))
        println("Is Tests are completed successfully = ${createResult().wasSuccessful()}")
    }

    fun testMultiply() {
        val expected = 8
        assertEquals(expected, calculatorTest.multiply(4, 2))
        println("Is Tests are completed successfully = ${createResult().wasSuccessful()}")
    }

}