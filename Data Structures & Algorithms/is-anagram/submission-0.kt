class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val mapS = HashMap<Char, Int>()
        val mapT = HashMap<Char, Int>()
        for (i in s.indices) {
            val charS = s[i]
            val charT = t[i]
            mapS[charS] = mapS.getOrDefault(charS, 0) + 1
            mapT[charT] = mapT.getOrDefault(charT, 0) + 1
        }

    
        return mapS == mapT
    }
}
