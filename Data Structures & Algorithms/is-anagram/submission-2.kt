class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val myMap = HashMap<Char, Int>()
        for (value in s) {
            myMap[value] = myMap.getOrDefault(value, 0) + 1
        }

        for (value in t) {
            myMap[value] = myMap.getOrDefault(value, 0) - 1
            if (myMap.get(value) == 0) {
                myMap.remove(value)
            }
        }

        return myMap.size == 0
    }
}
