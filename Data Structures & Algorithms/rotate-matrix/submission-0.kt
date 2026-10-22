    class Solution {
        fun rotate(matrix: Array<IntArray>) {
            val rows = matrix.size
            val cols = matrix[0].size
            for(row in 0 until rows) {
                for(col in (row + 1) until cols) {
                    val temp = matrix[row][col]
                    matrix[row][col] = matrix[col][row]
                    matrix[col][row] = temp
                }
            }
            for(row in 0 until rows) {
                matrix[row].reverse()
            }
        }
    }
