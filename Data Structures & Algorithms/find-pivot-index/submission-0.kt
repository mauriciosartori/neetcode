class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val total = nums.sum()
        var leftSum = 0
        for ((index, value) in nums.withIndex()) {
            val rightSum = total - value - leftSum
            if (leftSum == rightSum) {
                return index
            }
            leftSum += value
        }
        return -1
    }
}
