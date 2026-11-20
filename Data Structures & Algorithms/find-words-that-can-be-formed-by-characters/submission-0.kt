class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        val lettersMap = hashMapOf<Char, Int>()
        var wordsDone = 0
        for (char in chars) {
            lettersMap[char] = lettersMap.getOrDefault(char, 0) + 1             
        }

        for (word in words) {
            var tempMap: HashMap<Char, Int>? = HashMap(lettersMap)
            for (char in word) {
                if (tempMap != null && !tempMap.contains(char)) { 
                    tempMap = null 
                    break
                }
                
                if (tempMap != null && tempMap.getOrDefault(char, 0) == 0) { 
                    tempMap = null 
                    break
                }
                if (tempMap != null) {
                    tempMap[char] = tempMap.getOrDefault(char, 0) - 1
                }
            }
            if (tempMap != null){
                wordsDone += word.length
            } 
        }
        return wordsDone
    }
}