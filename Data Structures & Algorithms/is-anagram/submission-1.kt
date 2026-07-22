class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val sMap = HashMap<Char, Int>()
        for (value in s) {
            sMap[value] = sMap.getOrDefault(value, 0) + 1
        }

        val tMap = HashMap<Char, Int>()
        for (value in t) {
            tMap[value] = tMap.getOrDefault(value, 0) + 1
        }

        return tMap == sMap
    }
}
