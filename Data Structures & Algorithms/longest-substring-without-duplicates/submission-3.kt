class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val seenSet = hashSetOf<Char>()
        var left = 0
        var right = 0
        var maxSize = 0
        for (currentChar in s) {
            if (seenSet.contains(currentChar)) {
                while (left <= right) {
                    val removedChar = s[left]
                    seenSet.remove(removedChar)
                    left++
                    if (removedChar == currentChar) {
                        break
                    }                    
                }                
            }
            seenSet.add(currentChar)            
            maxSize = maxOf(right - left + 1, maxSize)
            right++
        }
        return maxSize
    }
}
