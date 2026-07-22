class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val myMap = HashMap<String, ArrayList<String>>()
        for (word in strs) {
            val key = word.toCharArray().sorted().joinToString("")
            val list = myMap.getOrPut(key) {
                ArrayList<String>()
            }
            list.add(word)
        }

            
        return myMap.values.toList()
    }
}
