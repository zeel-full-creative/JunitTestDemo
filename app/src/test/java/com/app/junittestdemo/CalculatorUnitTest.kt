package com.app.junittestdemo

import org.junit.*

object CalculatorUnitTest {

    private var calculator: Calculator? = null

    @AfterClass
    @JvmStatic
    fun afterClass() {
        println("Executing @AfterClass each test cases")
    }

    @BeforeClass
    @JvmStatic
    fun beforeClass() {
        println("Executing @BeforeClass each test cases")
    }

    @Before
    fun init() {
        calculator = Calculator()
        println("Executing @Before each test cases")
    }

    @Test
    fun testAddFun() {
        val operationValue = calculator?.addition(5, 2)
        val expAns = 7
        Assert.assertEquals(expAns, operationValue)
        println("Executed @Test addition test case")
    }

    @Test
    fun testSubFun() {
        val operationValue = calculator?.sub(5, 2)
        val expAns = 3
        Assert.assertEquals(expAns, operationValue)
        println("Executed @Test sub test case")
    }

    @Test
    fun testDivFun() {
        val operationValue = calculator?.div(5, 2)
        val expAns = 2.5
        Assert.assertEquals(expAns, operationValue)
        println("Executed @Test div test case")
    }

    @Test
    fun testMultiplyFun() {
        val operationValue = calculator?.multiply(5, 2)
        val expAns = 10
        Assert.assertEquals(expAns, operationValue)
        println("Executed @Test multiply test case")
    }

    @After
    fun testAfterFun() {
        println("Executing @After each test cases")
        println("----------------------------------------")
    }

}