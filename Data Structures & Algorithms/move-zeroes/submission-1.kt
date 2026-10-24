class Solution {
    fun moveZeroes(nums: IntArray) {
        fun swap(a: Int, b: Int) {
            val temp = nums[a] 
            nums[a] = nums[b] 
            nums[b] = temp
        }
        var start = 0        
        for((index, value) in nums.withIndex()) {
            if(value != 0) {
                swap(index, start)                
                start++                
            }
        }        
    }
}
