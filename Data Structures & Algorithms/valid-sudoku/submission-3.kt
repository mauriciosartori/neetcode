class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val repeatRows: HashMap<Int, HashSet<Char>> = hashMapOf()
        val repeatCols: HashMap<Int, HashSet<Char>> = hashMapOf()
        fun isValidBoard(rowInit: Int, colInit: Int): Boolean {
            val seenSet = hashSetOf<Char>()

            for (row in (0 + rowInit)  until (3 + rowInit)) {
                for (col in (0 + colInit)  until (3 + colInit)) {
                    val celValue = board[row][col]
                    if (seenSet.contains(celValue)) {
                        return false
                    }
                    if(celValue != '.'){
                        seenSet.add(celValue)                    
                        val rowMap = repeatRows.getOrDefault(row,hashSetOf<Char>())
                        if (rowMap.contains(celValue)) return false
                        rowMap.add(celValue)
                        repeatRows[row] = rowMap

                        val colMap = repeatCols.getOrDefault(col,hashSetOf<Char>())
                        if (colMap.contains(celValue)) return false
                        colMap.add(celValue)
                        repeatCols[col] = colMap                        
                    } 
                }
            }
            return true
        }

        val rows = board.size
        val cols = board[0].size
        val coorners = arrayListOf(
            Pair(0,0), Pair(0,3), Pair(0,6),
            Pair(3,0), Pair(3,3), Pair(3,6),
            Pair(6,0), Pair(6,3), Pair(6,6)
         )

        for((row, col) in coorners) {
            if (!isValidBoard(row, col)) return false
        }

        
        return true
    }
}
