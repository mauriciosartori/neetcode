class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for ((index, currentChar) in s.withIndex()) {
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.addLast(currentChar)
            } else {
                if (stack.isEmpty()) return false
                 val lastCharAdded = stack.removeLast()                 
                    if(currentChar == ')' && lastCharAdded != '(') return false
                    if(currentChar == '}' && lastCharAdded != '{' )return false
                    if(currentChar == ']' && lastCharAdded != '[' )return false                 
            }
        }
        return stack.isEmpty()
    }
}
