class Solution {
    fun isPalindrome(x: Int): Boolean {
        val input = x.toString()
        var rigthIndex = input.lastIndex
        for ((leftIndex, value) in input.withIndex()) {
            if (leftIndex == rigthIndex) return true
            if (input[rigthIndex--] != value) return false 
        }
        return true
    }
}
