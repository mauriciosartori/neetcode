class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val sortedIntervals = intervals.sortedBy{it[0]}
        var result = mutableListOf<IntArray>() 
        var prevStart = sortedIntervals[0][0]
        var prevEnd = sortedIntervals[0][1]

        for (index in 1 until sortedIntervals.size) {            
            val (currentStart, currentEnd) = sortedIntervals[index]
            if(currentStart <= prevEnd) {
                prevEnd = maxOf(prevEnd, currentEnd)
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
