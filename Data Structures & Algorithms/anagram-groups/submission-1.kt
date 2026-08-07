class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val resultMap = HashMap<HashMap<Char, Int>, MutableList<String>>()
        for (word in strs) {
            val wordMap = HashMap<Char, Int>()
            for (wIndex in word.indices) {
                val wChar = word.get(wIndex)
                wordMap[wChar] = wordMap.getOrDefault(wChar, 0) + 1
            }
            val group = resultMap.getOrPut(wordMap) {
                mutableListOf()
            }
            group.add(word)
        }
        return resultMap.values.toList()
    }
}
