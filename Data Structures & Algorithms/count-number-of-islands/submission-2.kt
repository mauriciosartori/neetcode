class Solution {
    fun numIslands(grid: Array<CharArray>): Int {

        
        val rows = grid.size
        val cols = grid[0].size
        val seen = hashSetOf<Pair<Int, Int>>()
        var islands = 0

         fun bfs(row: Int, col: Int) {
            val queue = ArrayDeque<Pair<Int, Int>>()
            seen.add(row to col)
            queue.addLast(row to col)

            while(queue.isNotEmpty()) {
                val (rowCurrent, colCurrent) = queue.removeFirst()
                val directions = arrayOf<Pair<Int, Int>>(0 to -1, 0 to 1, 1 to 0, -1 to 0)
                for((rowDelta, colDelta) in directions) {
                    val rowNext = rowDelta + rowCurrent
                    val colNext = colDelta + colCurrent
                    val isValid = rowNext < rows && colNext < cols && rowNext >= 0 && colNext >= 0
                    if (isValid && grid[rowNext][colNext] == '1' && !seen.contains(rowNext to colNext)) {
                        seen.add(rowNext to colNext)
                        queue.addLast(rowNext to colNext)
                    }
                }
            }
        }

        for (row in 0 until rows) {
            for (col in 0 until cols) {
                if (grid[row][col] == '1' && !seen.contains(row to col)) {
                    islands++
                    bfs(row, col)
                }
            }
        }

        return islands
    }
}
