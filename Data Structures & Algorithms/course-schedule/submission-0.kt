class Solution {
    fun canFinish(n: Int, prerequisites: Array<IntArray>): Boolean {
        val adjList = Array(n) {mutableListOf<Int>()}
        for ((course, prerequisite) in prerequisites) {
            adjList[course].add(prerequisite)
        }

        val seen = HashSet<Int>()

        fun dfs(course: Int): Boolean {
            if (seen.contains(course)) return false
            if (adjList[course].isEmpty()) return true
            seen.add(course)
            for (prerequisite in adjList[course]) {
                if (!dfs(prerequisite)) return false
            }
            seen.remove(course)
            adjList[course].clear()
            return true
        }
    
        for (course in 0 until n) {
            if (!dfs(course)) return false
        }    
        return true
    }
}
