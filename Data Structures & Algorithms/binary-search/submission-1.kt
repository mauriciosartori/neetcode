class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.lastIndex
        while(start <= end) {
            val middle = (end - start) / 2 + start
            val currentValue = nums[middle]
            if (currentValue > target) {
                end = middle - 1
            } else if (currentValue < target) {
                start = middle + 1
            } else {
                return middle
            }
        }
        return -1 
    }
}
