package com.app.junittestdemo

import com.app.junittestdemo.CalculatorUnitTest
import org.junit.runner.JUnitCore

object CalculatorRunner {

    @JvmStatic
    fun main(args: Array<String>) {
        val result = JUnitCore.runClasses(CalculatorUnitTest::class.java)
        for (failure in result.failures) {
            println(failure.toString())
        }
        println("Result==" + result.wasSuccessful())
    }
}