package com.app.junittestdemo

import junit.framework.Assert.assertEquals
import org.junit.Test

class PriceCalculatorUnitTest {

    private val priceCalculator = PriceCalculator()


    @Test
    fun assertProductFinalPrice() {
        val expectedPrice = 1.5
        val finalPrice = priceCalculator.finalPrice(basePrice = 1.0)

        assertEquals(expectedPrice, finalPrice, 0.001)

    }

}