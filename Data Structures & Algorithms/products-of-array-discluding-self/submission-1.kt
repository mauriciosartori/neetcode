class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val multArray = IntArray(nums.size)
        var currentMult = 1
        for (index in 0 until nums.size) {
            multArray[index] = nums[index] * currentMult
            currentMult = multArray[index]
        }
        val multArrayDos = IntArray(nums.size)
        currentMult = 1
        for (index in nums.lastIndex downTo 0) {                        
            multArrayDos[index] = nums[index] * currentMult
            currentMult = multArrayDos[index]        
        }
        val result = IntArray(nums.size)
        for (index in 1 until nums.size - 1) {
            result[index] = multArray[index - 1] * multArrayDos[index + 1] 
        }
        result[0] = multArrayDos[1]
        result[nums.lastIndex] = multArray[nums.lastIndex - 1]
        return result
    }
}
