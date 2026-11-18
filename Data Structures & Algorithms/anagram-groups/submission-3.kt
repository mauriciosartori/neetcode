class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val seenMap = hashMapOf<List<Int>,MutableList<String>>()
        for (word in strs) {
            val wordArray = IntArray(26)
            for (currentChar in word) {                 
                val index = currentChar - 'a'
                wordArray[index] = wordArray[index] + 1
            }
            val key = wordArray.toList()

             val mapValue = seenMap.getOrDefault(key, arrayListOf<String>()) 
             mapValue.add(word)
             seenMap[key] = mapValue
        }
        val result = mutableListOf<List<String>>()
        for ((key, values) in seenMap) {
            result.add(values)
        }
        return result
    }
}
