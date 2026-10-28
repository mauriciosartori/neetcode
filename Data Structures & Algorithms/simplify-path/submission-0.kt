class Solution {
    fun simplifyPath(path: String): String {
        val pathArray = path.split("/")
        val stack = ArrayDeque<String>()
        for ((index, subString) in pathArray.withIndex()) {
            if (subString == "..") {
                if (stack.isNotEmpty()) {
                    stack.removeLast()
                }                
            } else {
                if (subString.isNotEmpty() && subString != ".") {
                    stack.addLast(subString)
                }
            }
        }
        val stringBuilder = StringBuilder("/")
        while(stack.isNotEmpty()) {
             stringBuilder.append(stack.removeFirst())
             if (stack.size != 0) {
                stringBuilder.append('/')
             }
        }
        return stringBuilder.toString()
    }
}
