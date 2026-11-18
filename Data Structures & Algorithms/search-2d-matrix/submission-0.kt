class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var left = 0 
        var right = matrix.size * matrix[0].size - 1
        fun getCoordenateValue(index: Int): Int{
            val columns = matrix[0].size
            val (row, col) =  Pair<Int, Int>(index / columns, index % columns)
            return matrix[row][col]
        }

        while (left <= right) {
            val middleIndex  = left + (right - left) / 2
            
            val middleValue = getCoordenateValue(middleIndex)
            val leftValue = getCoordenateValue(left)
            val rightValue = getCoordenateValue(right)
            if (middleValue > target) {
                right = middleIndex - 1
            } else if(middleValue < target) {
                left = middleIndex + 1
            } else {
                return true
            }        
        }

        
        return false
    }
}
