class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (currentChar in s) {
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.addLast(currentChar)
            } else {
                if(stack.isEmpty()) return false
                val lastAdded = stack.removeLast()
                if (lastAdded == '(' && currentChar != ')') return false
                if (lastAdded == '[' && currentChar != ']') return false
                if (lastAdded == '{' && currentChar != '}') return false
            }
        }
        return stack.isEmpty()
    }
}
