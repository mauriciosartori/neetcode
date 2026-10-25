class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val sorted = intervals.sortedBy{it[0]}
        var prevEnd = sorted[0][1]
        var prevStart =  sorted[0][0]
        val result =  mutableListOf<IntArray>()
        for (index in 1 until sorted.size) {
            val currentPair = sorted[index]
            if (prevEnd >= currentPair[0]) {
                prevEnd = maxOf(prevEnd, currentPair[1])
            } else {
                result.add(intArrayOf(prevStart, prevEnd))
                prevStart = currentPair[0]
                prevEnd = currentPair[1]
            }
        }
        result.add(intArrayOf(prevStart, prevEnd))
        return result.toTypedArray()
    }
}
