class Solution {
    fun isPalindrome(s: String): Boolean {
        val input = s.filter { it.isLetterOrDigit() }.lowercase()
        var start = 0
        var end = input.length - 1
        while(start <= end ) {
            if(input[start] != input[end]) {
                return false
            }
            start++
            end--    
        }
        return true
    }
}
