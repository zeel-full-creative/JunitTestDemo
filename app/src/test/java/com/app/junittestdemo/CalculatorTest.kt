package com.app.junittestdemo

import org.junit.AfterClass
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {

    lateinit var calculatorMock: CalculatorMock

    @Mock
    lateinit var operators: Operators

    @Before
    fun onSetup() {
        calculatorMock = CalculatorMock(operators)
    }

    @Test
    fun testAddition() {
        val a = 10
        val b = 20
        calculatorMock.addTwoNumbers(a, b)
        verify(operators).add(a, b)
        Mockito.`when`(calculatorMock.addTwoNumbers(10,20)).thenReturn(30)
    }

    @Test
    fun testSubtraction() {
        val a = 20
        val b = 10
        calculatorMock.subtractTwoNumbers(a, b)
        verify(operators).subtract(a, b)
    }

    @Test
    fun testMultiply() {
        val a = 20
        val b = 10
        calculatorMock.multiplyTwoNumbers(a, b)
        verify(operators).multiply(a, b)
    }

    @Test
    fun testDiv() {
        val a = 20
        val b = 10
        calculatorMock.divideTwoNumbers(a, b)
        verify(operators).divide(a, b)
    }

}