class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()
        for ((index, currentNum) in nums.withIndex()) {
            val complement = target - currentNum
            if (seen.contains(complement)) {
                 val complementIndex = seen.getOrDefault(complement, 0)
                 return intArrayOf(complementIndex, index)
            }
            seen[currentNum] = index
        }
        return intArrayOf()
    }
}
