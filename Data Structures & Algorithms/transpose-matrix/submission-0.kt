class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val rows = matrix.size
        val cols = matrix[0].size
        val resultMatrix = Array(cols) {IntArray(rows)}
        for (row in 0 until cols) {
            for (col in 0 until rows) {
                resultMatrix[row][col] = matrix[col][row]
            }
        }
        return resultMatrix
    }
}
