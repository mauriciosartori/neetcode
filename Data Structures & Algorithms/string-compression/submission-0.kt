class Solution {
    fun compress(chars: CharArray): Int {
        var read = 0
        var write = 0

        while (read < chars.size) {
            val currentChar = chars[read]
            var count = 0


            while(read < chars.size && currentChar == chars[read]) {
                read++
                count++
            }

           chars[write++] = currentChar
           if (count == 1) continue
           for (tempChar in count.toString()) {
            chars[write++] = tempChar
           }
        }

        return write
    }
}
