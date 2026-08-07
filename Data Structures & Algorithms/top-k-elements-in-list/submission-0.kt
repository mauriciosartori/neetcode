class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
	for (value in nums) {
		map[value] = map.getOrDefault(value, 0) + 1
	}
	val sortedList = map.entries.sortedByDescending {it.value}
	return sortedList.take(k)
                .map {it.key}
                .toIntArray()

    }
}
