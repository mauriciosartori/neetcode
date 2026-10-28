class Solution {
    fun firstUniqChar(s: String): Int {
        val seenMap = hashMapOf<Char, Int>()
        for ((index, value) in s.withIndex()) {
            seenMap[value] = seenMap.getOrDefault(value, 0) + 1
        }

        for ((index, value) in s.withIndex()) {
            val timesShown = seenMap.getOrDefault(value, -1)
            if (timesShown == 1) {
                return index
            }
        }
        return - 1 
    }
}
