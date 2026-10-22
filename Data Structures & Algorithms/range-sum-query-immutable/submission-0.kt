class NumArray(val nums: IntArray) {

    fun sumRange(left: Int, right: Int): Int {
        var total = 0
        for (index in left .. right) {
            total += nums[index]
        }
        return total
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */