class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        for (value in nums) {            
            if (set.contains(value)) {
                return true
            }
            set.add(value)
        }
        return false
    }
}
