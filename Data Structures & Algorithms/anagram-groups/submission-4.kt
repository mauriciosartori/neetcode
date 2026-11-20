class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        fun getArrayKey(word: String): String {
            val alphabArray = IntArray(26)
            for (currentChar in word) {
                val index = currentChar - 'a'
                alphabArray[index] = alphabArray[index] + 1
            }
            return alphabArray.toList().toString()
        }

        val resultMap = hashMapOf<String, MutableList<String>>()
        for (word in strs) {
            val key = getArrayKey(word)
            val list =  resultMap.getOrDefault(key, ArrayList<String>())
            list.add(word)
            resultMap[key] = list
        }
        return resultMap.values.toList()
    }
}
