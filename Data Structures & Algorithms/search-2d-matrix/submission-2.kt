class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val cols = matrix[0].size

        fun getIndex(row: Int, col: Int): Int {
            return (cols * row) + col
        }

        fun getCoordinates(index: Int): Pair<Int, Int> {
            return Pair((index / cols),  (index % cols))
        }

        var start = 0
        var end = getIndex(rows - 1, cols - 1)

        while(start <= end) {
            val middleIndex = start + (end - start) / 2
            val (mRow, mCol) = getCoordinates(middleIndex)
            val middleValue = matrix[mRow][mCol]
            if (middleValue > target) {
                end =  middleIndex - 1 
            } else if(middleValue < target) {
                start = middleIndex + 1 
            } else {
                return true
            }
        }
        return false 
    }
}


//row 4 m
//col 3 n

//1 2 3 4 10 11 12 13 14
//0 0 0 0 1  1  1   1  2
//0 1 2 3 0  1  2   3  0