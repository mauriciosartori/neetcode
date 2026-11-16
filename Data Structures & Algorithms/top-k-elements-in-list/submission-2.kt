class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val seenMap = hashMapOf<Int, Int>()
        for(num in nums) {
            seenMap[num] = seenMap.getOrDefault(num, 0) + 1            
        }
        val list = seenMap.entries.sortedByDescending{ it.value }
        return list.take(k).map{it.key}.toIntArray()
    }
}
