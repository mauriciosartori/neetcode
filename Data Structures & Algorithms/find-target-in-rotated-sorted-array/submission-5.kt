class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.lastIndex

        while(start <= end) {
            val middleIndex = start + (end - start) / 2
            val midValue = nums[middleIndex]
            
            val endValue = nums[end]
            val startValue = nums[start]

            if (midValue == target) {
    return middleIndex
}

if (startValue <= midValue) {
    // La mitad izquierda está ordenada.
    if (target >= startValue && target < midValue) {
        end = middleIndex - 1
    } else {
        start = middleIndex + 1
    }
} else {
    // La mitad derecha está ordenada.
    if (target > midValue && target <= endValue) {
        start = middleIndex + 1
    } else {
        end = middleIndex - 1
    }
}
        }
        return -1
    }
}

// 3 4 5 6 1 2
// 3 4 5 6 1 2

