class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        fun squareDistance(point: IntArray) : Long {
            val x = point[0].toLong()
            val y = point[1].toLong()
            return x * x + y * y
        }

        val maxHeap = PriorityQueue<IntArray> { pointA, pointB ->
            squareDistance(pointB).compareTo(squareDistance(pointA))
        }
        // Calculate the distances 
        for (coordinates in points) {
            maxHeap.offer(coordinates)
            if(maxHeap.size > k) {
                maxHeap.poll()
            }
        }
        return maxHeap.toTypedArray()
    }
}
