class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
		    return false
        }
        val mapS = HashMap<Char, Int>()
        val mapT = HashMap<Char, Int>()

        for ((index, value) in s.withIndex()) {
            val sChar = s[index]
            val tChar = t[index]
            mapS[sChar] = mapS.getOrDefault(sChar, 0) + 1
            mapT[tChar] = mapT.getOrDefault(tChar, 0) + 1
        }
        return mapS == mapT
    }
}
