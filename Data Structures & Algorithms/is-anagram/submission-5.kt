class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val mapS = hashMapOf<Char, Int>()
        val mapT = hashMapOf<Char, Int>()
        for((index, sChar) in s.withIndex()) {            
            mapS[sChar] = mapS.getOrDefault(sChar, 0) + 1

            val tChar = t[index]
            mapT[tChar] = mapT.getOrDefault(tChar, 0) + 1
        }
        return mapT == mapS
    }
}
