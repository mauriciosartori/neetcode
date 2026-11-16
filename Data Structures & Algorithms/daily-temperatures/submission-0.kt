class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Pair<Int, Int>>()
        val result = IntArray(temperatures.size)
        for((currentIndex, temperature) in temperatures.withIndex()) {            
            while (stack.isNotEmpty() && stack.peek().first < temperature) {
                val (value, index)= stack.pop()
                result[index] = currentIndex - index
            }
            stack.push(Pair(temperature, currentIndex))
        }
        return result
    }
}
