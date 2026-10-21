class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seenMap = hashMapOf<Int, Int>()
        
        for ((index, value) in nums.withIndex()) {
            val missedValue = target - value
            if(seenMap.contains(missedValue)) {
                val firstIndex = seenMap.getOrDefault(missedValue, 0)
                return intArrayOf(firstIndex, index)
            } else {
                seenMap[value] = index
            }
        }
        return intArrayOf(0, 0)
    }
}
