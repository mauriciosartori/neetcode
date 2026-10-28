class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var secondIndex = 0
        for (index in (m .. nums1.lastIndex)) {
            nums1[index] = nums2[secondIndex++]
        }
        nums1.sort()
    }
}
