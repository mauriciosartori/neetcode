    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
                val map = HashMap<Int, Int>()
                val result = IntArray(2)
                for ((index, value) in nums.withIndex()) {
                    val pending = target - value
                    val position = map.getOrDefault(pending, -1)
                    if (position != -1) {
                        result[0] = position
                        result[1] = index
                        return result
                    }
                    map[value] = index
                }
                return result
        }
    }
