class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val res = ArrayList<List<Int>>()
        val subset = ArrayList<Int>()

        fun dfs(i: Int) {
            if (i > nums.lastIndex) {
                res.add(subset.toList())
                return 
            }
            
            subset.add(nums[i])
            dfs( i + 1)
            subset.removeAt(subset.lastIndex)
            dfs( i + 1)            
        }

        dfs(0)
        return res
    }
}
