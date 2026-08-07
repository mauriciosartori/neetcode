class Solution {
   fun twoSum(nums: IntArray, target: Int): IntArray {
	var left = 0
	var right = nums.size - 1
	while (left < right) {
		val sum = nums[left] + nums[right]
		if (sum < target) {
			left++
			continue
		} else if (sum > target) {
			right-- 
			continue
		} else {
			return intArrayOf(left + 1, right + 1)
		}
	}
	return intArrayOf()
    }
}
