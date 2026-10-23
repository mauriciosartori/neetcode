class Solution {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        val counts = hashMapOf<Int, Int>()
        var currentSum = 0L
        var maxSum = 0L
        var left = 0

        for (right in nums.indices) {
            val value = nums[right]

            // 1. Sumar value a currentSum.
            currentSum += value
            // 2. Aumentar su contador en counts.
            counts[value] = counts.getOrDefault(value, 0) + 1

            if (right - left + 1 == k) {
                if (counts.size == k) {
                    maxSum = maxOf(maxSum, currentSum)
                }

                // Aquí quitaremos el elemento izquierdo.
                val outgoing = nums[left]
                val remaining = counts.getValue(outgoing) - 1

                if (remaining == 0) {
                    counts.remove(outgoing)
                } else {
                    counts[outgoing] = remaining
                }

                currentSum -= outgoing
                left++
            }
        }

        return maxSum
    }
}
