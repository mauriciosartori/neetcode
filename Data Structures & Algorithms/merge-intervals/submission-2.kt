class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val sorted = intervals.sortedBy{it[0]}
        var prevEnd: Int = sorted[0][1] 
        var prevStart: Int = sorted[0][0] 
        val result = mutableListOf<IntArray>()
        for (index in 1 .. sorted.lastIndex) {
            val interval = sorted[index]
            val (startCurrent, endCurrent) = interval            
            if (prevEnd >= startCurrent) {
                prevEnd = maxOf(prevEnd, endCurrent)
            } else {
                result.add(intArrayOf(prevStart, prevEnd))                
                prevStart = startCurrent
                prevEnd = endCurrent
            }
        }
        result.add(intArrayOf(prevStart, prevEnd))
        return result.toTypedArray()
    }
}
