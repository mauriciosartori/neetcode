class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val leftToRightArray = IntArray(nums.size)
        val rightToLeftArray = IntArray(nums.size)
        val result = IntArray(nums.size)
        var backIndex = nums.size - 1
        var leftToRightMult = 1
        var rightToLeftMult = 1
        for (index in 0 until nums.size) {
            leftToRightArray[index] = nums[index] * leftToRightMult
            leftToRightMult = leftToRightArray[index]
            
            rightToLeftArray[backIndex] = nums[backIndex] * rightToLeftMult
            rightToLeftMult = rightToLeftArray[backIndex]
            backIndex--
        }
        for (index in nums.indices) {
            val leftPoduct = if (index == 0) 1 else leftToRightArray[index - 1]
            val rightProduct = if (index == nums.lastIndex) 1 else rightToLeftArray[index + 1]
            result[index] = leftPoduct * rightProduct
        }
        return result
    }
}
