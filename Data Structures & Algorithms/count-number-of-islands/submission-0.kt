class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val seenSet = HashSet<Pair<Int, Int>>()
        val directions = arrayListOf(0 to 1, 0 to -1, 1 to 0, -1 to 0)
        var islands = 0

        for (row in 0 until rows) {
            for (col in 0 until cols) {
                val cellValue = grid[row][col]
                if (cellValue == '1' && !seenSet.contains(row to col)) {
                    islands++
                    seenSet.add(row to col) 
                    val queue = ArrayDeque<Pair<Int, Int>>()
                    queue.addLast(row to col)
                    while(queue.isNotEmpty()) {
                        val (currentRow, currentCol) = queue.removeFirst()
                        for((offsetRow, offsetCol) in directions) {
                            val nextRow = currentRow + offsetRow
                            val nextCol = currentCol + offsetCol
                            val isValid = nextRow in 0 until rows && nextCol in 0 until cols
                            if (isValid  && !seenSet.contains(nextRow to nextCol) 
                                && grid[nextRow][nextCol] == '1') {
                                seenSet.add(nextRow to nextCol) 
                                queue.addLast(nextRow to nextCol)
                            }
                        }
                    }

                }
            }
        }
        return islands
    }
}
