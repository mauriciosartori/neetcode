class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        var seen = hashMapOf<Char, Int>() // char and index
        var startIndex = 0 
        for (index in 0 until s.length) {
            val value = s[index]
            if (seen.contains(value)) {
                 val previousIndex = seen.getOrDefault(value, 0)
                startIndex = maxOf(startIndex, previousIndex + 1)                
            }
            maxLength = maxOf(maxLength, index - startIndex + 1)
            seen[value] = index            
        }
        return maxLength
    }
}
