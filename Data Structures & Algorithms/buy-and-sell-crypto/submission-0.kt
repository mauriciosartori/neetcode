class Solution {
    fun maxProfit(prices: IntArray): Int {
    var minimumPrice = Int.MAX_VALUE
    var maximumProfit = 0
    for (price in prices) {
        minimumPrice = minOf(minimumPrice, price)
        val currentProfit = price - minimumPrice
        maximumProfit = maxOf(currentProfit, maximumProfit)
    }

    return maximumProfit
    }
}
