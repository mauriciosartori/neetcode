class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = hashSetOf<Int>()
        for (num in nums) {
            if (seen.contains(num)) return true
            seen.add(num)
        }
        return false
    }
}
