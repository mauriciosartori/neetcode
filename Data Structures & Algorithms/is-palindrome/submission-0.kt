class Solution {
    fun isPalindrome(s: String): Boolean {
    var left = 0
	var right = s.length - 1 

	while (left < right) {
		var leftChar = s[left].lowercaseChar()
		while (left < right && !leftChar.isLetterOrDigit()) {
            left++
            leftChar = s[left].lowercaseChar()
			
		}
		var rightChar = s[right].lowercaseChar()
		while (left < right && !rightChar.isLetterOrDigit()) {
            right--
            rightChar = s[right].lowercaseChar()
			
		}
		if(s[left].lowercaseChar() != s[right].lowercaseChar()) {
			return false
		}
		left++
		right--
	}
	return true
    }
}
