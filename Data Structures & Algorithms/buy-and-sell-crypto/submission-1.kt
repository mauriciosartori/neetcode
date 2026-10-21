class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size == 1) return 0
        var lowestPrice = prices[0]
        var maxEarn = 0
        for (index in 1 until prices.size) {
            val currentPrice = prices[index]            
            maxEarn = maxOf(currentPrice - lowestPrice, maxEarn)            
            lowestPrice = minOf(currentPrice, lowestPrice)                  
        }
        return maxEarn
    }
}
