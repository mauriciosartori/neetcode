class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var smallestPrice = prices[0]
        for (index in 1 until prices.size) {
            val price = prices[index]
            maxProfit = maxOf(maxProfit, price - smallestPrice)
            smallestPrice = minOf(smallestPrice, price)
        }
        return maxProfit
    }
}
