class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val seenMap = hashMapOf<Int, Int>() // value + index
        for ((index, value) in nums.withIndex()){
            if (seenMap.contains(value)) {
                val firstIndex = seenMap.getOrDefault(value, 0)
                if(abs(firstIndex - index) <= k) return true
            }
            seenMap[value] = index
        }
        return false 
    }
}
