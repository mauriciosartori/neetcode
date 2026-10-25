class Solution {
    fun compress(chars: CharArray): Int {
        var index = 0
        var totalSize = 0

        while (index < chars.size) {
            val currentChar = chars[index]
            var currentTimes = 0

            // Contar este grupo y avanzar index.
            while(index < chars.size && currentChar == chars[index]) {
                currentTimes++
                index++
            }
            chars[totalSize] = currentChar
            totalSize++
            if (currentTimes > 1) {
                for (digit in currentTimes.toString()) {
                    chars[totalSize] = digit
                    totalSize++
                }
            }
        }

        return totalSize
    }
}
