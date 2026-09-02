class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var numIslands = 0
        val seen = HashSet<Pair<Int, Int>>()
        val directions = arrayOf(0 to 1, 0 to -1, 1 to 0, -1 to 0)
        fun bfs(row: Int, col: Int) {
            seen.add(row to col)
            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.add(row to col) 
            while(queue.isNotEmpty()) {
                val (rowCurrent, colCurrent) = queue.removeFirst()        

                for (direction in directions) {
                    val rowNext = rowCurrent + direction.first
                    val colNext = colCurrent + direction.second
                    val isValidRow = rowNext >= 0 && rowNext < grid.size && colNext >= 0 && colNext < grid[0].size
                    if(isValidRow && grid[rowNext][colNext] == '1' && !seen.contains(rowNext to colNext)) {
                        seen.add(rowNext to colNext)
                        queue.add(rowNext to colNext)    
                    }
                }
            }            
        }

        for (row in 0 until grid.size) {
            for (col in 0 until grid[0].size) {
                if (grid[row][col] == '1' && !seen.contains(row to col)) {
                    bfs(row, col)
                    numIslands++
                }                
            }
        }
        return numIslands
    }
}
