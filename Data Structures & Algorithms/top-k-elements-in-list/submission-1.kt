class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val queue = PriorityQueue<Pair<Int, Int>>(
            compareBy {it.second}
        )
        val seen = hashMapOf<Int, Int>()
        for (value in nums) {
            seen[value] = seen.getOrDefault(value, 0) + 1
        }
        
        for ((value, frequency) in seen) {
            queue.add(Pair(value, frequency))
            if (queue.size > k) {
                queue.poll()
            }            
        }
        return queue.map{it.first}.toIntArray()
    }
}
