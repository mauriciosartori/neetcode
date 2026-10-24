class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var smallestPrice = Int.MAX_VALUE
        for ((index, value) in prices.withIndex()) {            
            
            maxProfit = maxOf(maxProfit, value - smallestPrice)
            smallestPrice = min(value, smallestPrice)
        }
        return maxProfit
    }
}
