class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var top = 0
        var bottom = matrix.size - 1
        var left = 0
        var right = matrix[0].size - 1

        val result = mutableListOf<Int>()

        while(top <= bottom && left <= right) {
        
            for (colIndex in left .. right) {
                result.add(matrix[top][colIndex])
            }
            top++
            for (rowIndex in top .. bottom) {
                result.add(matrix[rowIndex][right])
            }
            right-- 
            if(top <= bottom) {
                for (colIndex in right downTo left) {
                    result.add(matrix[bottom][colIndex])
                }
                bottom--
            }
            if (left <= right) {
                for (rowIndex in bottom downTo top) {
                    result.add(matrix[rowIndex][left])
                }
                left++
            }
        }
        return result
    }
}
