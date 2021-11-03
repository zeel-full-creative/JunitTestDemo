package com.app.junittestdemo

class PriceCalculator {

    /**
     * @return the final price of the product to show in the UI.
     * @param basePrice the base price of the [Product].
     */
    fun finalPrice(basePrice: Double): Double {
        return basePrice * 1.5
    }
}