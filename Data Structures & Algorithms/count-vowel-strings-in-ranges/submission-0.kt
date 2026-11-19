class Solution {
    fun vowelStrings(words: Array<String>, queries: Array<IntArray>): IntArray {
        val vowelSet = hashSetOf<Char>('a','e','i','o','u')
        fun isValid(word: String): Boolean {            
            return vowelSet.contains(word[0]) && vowelSet.contains(word[word.lastIndex])
        }

        val validArray = ArrayList<Boolean>(words.size)
        for ((index, word) in words.withIndex()) {
            //validArray[index] = isValid(word)
            validArray.add(isValid(word))
        }

        val result = arrayListOf<Int>()
        for (query in queries) {
            val startIndex = query[0]
            val endIndex = query[1]            
            var totalValid = 0
            for (index in startIndex .. endIndex) {
                if(validArray[index]) {
                    totalValid++
                }
            }
            result.add(totalValid)
        }
        return result.toIntArray()
    }
}