package com.app.junittestdemo

class Calculator {

    fun addition(a: Int, b: Int): Int {
        return a + b
    }

    fun sub(a: Int, b: Int): Int {
        return a - b
    }

    fun div(a: Int, b: Int): Double {
        return a / b.toDouble()
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

}