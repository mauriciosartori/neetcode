class Solution {
    fun isValid(s: String): Boolean {
        val queue = ArrayDeque<Char>()
        for ((index, value) in s.withIndex()) {
            if (value == '(' || value == '[' || value == '{') {
                queue.addLast(value)
            } else {
                 if (queue.isEmpty()) return false
                 val prevValue = queue.removeLast()
                 if (prevValue == '(' && value != ')') { return false}
                 if (prevValue == '[' && value != ']') { return false}
                 if (prevValue == '{' && value != '}') { return false}
            }
        }
        return queue.isEmpty()
    }
}
