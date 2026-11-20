class Solution {
    fun countSubstrings(s: String): Int {
        var result = 0        
        for ((index, currentChar) in s.withIndex()) {                                    
            var left = index - 1
            var right = index + 1            
            while ((left >= 0 && right < s.length) &&  s[left] == s[right]) {
                left--
                right++
                result++
            }

            left = index
            right = index + 1            
            while ((left >= 0 && right < s.length) &&  s[left] == s[right]) {
                left--
                right++
                result++
            }
            result++
        }
        return result
    }
}
