class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        val rows = image.size
        val cols = image[0].size
        val oldColor = image[sr][sc]
        if (oldColor == newColor) {
            return image
        }

        val queue = ArrayDeque<Pair<Int, Int>>()
        image[sr][sc] = newColor
        queue.addLast(sr to sc)

        val directions = arrayListOf(1 to 0, -1 to 0, 0 to -1, 0 to 1)
        while(queue.isNotEmpty()) {
            val (currentRow, currentCol) = queue.removeFirst()
            for ((offsetRow, offsetCol) in directions) {
                val newRow = currentRow + offsetRow
                val newCol = currentCol + offsetCol
                val isValid = newRow in 0 until rows && newCol in 0 until cols
                if (isValid && image[newRow][newCol] == oldColor) {
                    image[newRow][newCol] = newColor
                    queue.addLast(newRow to newCol)
                }
            }            
        }
        return image
    }
}
