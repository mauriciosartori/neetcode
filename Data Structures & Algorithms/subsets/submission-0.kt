class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result= mutableListOf<List<Int>>()
        val current = mutableListOf<Int>()

        fun dfs(index: Int) {
            if (index >= nums.size) {
                result.add(current.toList())   
                return
            }
        
            current.add(nums[index])
            dfs(index + 1)

            current.removeAt(current.lastIndex)
            dfs(index + 1)
        }
        dfs(0)
        return result
    }
}
