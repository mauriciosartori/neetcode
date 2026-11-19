class Solution {
    fun findPeakElement(nums: IntArray): Int {
        var start = 0
        var end = nums.lastIndex

        while (start < end) {
            val middle = start + (end - start) / 2
            var middleValue = nums[middle]
            if (middleValue > nums[middle + 1]) {
                // going down
                end = middle
            } else {
                // middleValue < nums[middle + 1]
                // going up
                start = middle + 1
            }             
        }     
        return start   
    }
}
