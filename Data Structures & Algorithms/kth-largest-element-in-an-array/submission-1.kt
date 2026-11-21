class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val maxHeap = PriorityQueue<Int>(compareByDescending { it })
        for (num in nums) {
            maxHeap.add(num)
            if (maxHeap.size > k) {                 
                maxHeap.remove(maxHeap.minOrNull())                    
            }
        }
        return maxHeap.minOrNull()?:0
    }
}
