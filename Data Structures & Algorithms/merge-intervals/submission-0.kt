class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if(intervals.isEmpty()) return emptyArray()
        intervals.sortBy {it[0]}

        var prevStart = intervals[0][0]
        var prevEnd = intervals[0][1]
        val result = mutableListOf<IntArray>()

        for (index in 1 until intervals.size) {
            val (currentStart, currentEnd) = intervals[index]

            if(prevEnd >= currentStart) {
                prevEnd = maxOf(currentEnd, prevEnd)                
            } else {
                result.add(intArrayOf(prevStart, prevEnd))
                prevStart = currentStart
                prevEnd = currentEnd                
            }
        }
        result.add(intArrayOf(prevStart, prevEnd))
        return result.toTypedArray()
    }
}
