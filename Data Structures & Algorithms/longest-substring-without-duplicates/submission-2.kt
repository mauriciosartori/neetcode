class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var startIndex = 0
        val seen = hashSetOf<Char>()
        var maxSize = 0
        for ((index, value) in s.withIndex()) {            
                while (seen.contains(value)) {                                
                    seen.remove(s[startIndex])                        
                    startIndex++
                }                
                seen.add(value)
                maxSize = maxOf(maxSize, index - startIndex +1)
            }     
        return maxSize
    }
}
