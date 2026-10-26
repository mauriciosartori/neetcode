class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val seen = hashSetOf<Pair<Int, Int>>()
        var islands = 0

        fun bfs(row: Int, col: Int) {
            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.addLast(Pair(row, col))
            val directions = mutableListOf(1 to 0, 0 to 1, -1 to 0, 0 to -1)            

            while(queue.isNotEmpty()) {
                val (rowCurrent, colCurrent)= queue.removeFirst()
                for ((rowDir, colDir) in directions) {
                    val rowNext = rowCurrent + rowDir
                    val colNext = colCurrent + colDir
                    val isValid = rowNext >= 0 && rowNext <= grid.lastIndex 
                                && colNext >= 0 && colNext <= grid[0].lastIndex 
                    if (isValid 
                        && grid[rowNext][colNext] == '1' 
                            && !seen.contains(Pair(rowNext, colNext))) {
                        seen.add(Pair(rowNext, colNext))
                        queue.addLast(Pair(rowNext, colNext))
                    }
                }
            }
        }
                
        for (row in grid.indices) {
            for (col in grid[0].indices) {
                if(!seen.contains(Pair(row, col)) &&
                    grid[row][col] == '1') {
                    seen.add(Pair(row, col))                    
                    bfs(row, col)
                    islands++
                }
            }
        }
        return islands
    }
}
