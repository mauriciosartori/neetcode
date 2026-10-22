class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var seenMap = hashMapOf<Int, Int>()
        for ((index, currentValue) in nums.withIndex()) {

            if (seenMap.contains(currentValue)) {
                val firstIndex = seenMap.getOrDefault(currentValue, 0)
                if (index - firstIndex <= k) {
                    return true
                }
            }
            seenMap[currentValue] = index
        }
        return false
    }
}
