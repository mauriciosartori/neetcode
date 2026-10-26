class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableListOf<MutableList<String>>()
        val seen = hashMapOf<String, MutableList<String>>()
        for ((index, value) in strs.withIndex()) {
            val valueConverted = value.toCharArray().sorted().joinToString("")
             val group = seen.getOrDefault(valueConverted, arrayListOf())            
             group.add(value)
             seen[valueConverted] = group
        }

        for ((key, value) in seen) {
            result.add(value)
        }
        return result
    }
}
