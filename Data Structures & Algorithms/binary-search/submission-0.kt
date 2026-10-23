class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        

        while(left <= right) {
            val middleIndex = (right - left) / 2 + left
            val middleValue = nums[middleIndex]
            
            if (middleValue > target) {
                right = middleIndex - 1
            } else if(middleValue < target) {
                   left = middleIndex + 1
            } else {
                return middleIndex
            }
        }
        return -1
    }
}
