class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val seen = hashMapOf<Int, Int>()
        var result = intArrayOf(0, 1)
        for((index, value) in numbers.withIndex()) {
            val complement = target - value
            if (seen.contains(complement)) {
                val firstIndex = seen.getOrDefault(complement, 0)
                result = intArrayOf(firstIndex + 1, index + 1)
            }
            seen[value] = index
        }
        return result
    }
}
