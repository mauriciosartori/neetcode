class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        
        val indices = intArrayOf(0, 3, 6)
        for (initialRowIndex in 0 .. 2) {
            for (initialColIndex in 0 .. 2) {
                var rowStart = 0 + indices[initialRowIndex]
                var rowEnd = 2 + indices[initialRowIndex]

                var colStart = 0 + indices[initialColIndex]
                var colEnd = 2 + indices[initialColIndex]
                val seen = hashSetOf<Char>()
                for (row in rowStart .. rowEnd) {
                    for (col in colStart .. colEnd) {
                        val value = board[row][col]
                        if (value == '.') continue
                        if(seen.contains(value)) {
                            return false   
                        } else {
                            seen.add(value)
                        }
                    }
                }
            }
        }

       for (row in 0..8) {
            val seenRow = hashSetOf<Char>()
            for (col in 0..8) {
                val value = board[row][col]
                if (value == '.') continue
                if (seenRow.contains(value)) return false
                seenRow.add(value)
            }
        }

        for (col in 0..8) {
            val seenCol = hashSetOf<Char>()
            for (row in 0..8) {
                val value = board[row][col]
                if (value == '.') continue
                if (seenCol.contains(value)) return false
                seenCol.add(value)
            }
        }
        return true
    }
}
