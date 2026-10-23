class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        var sResult = StringBuilder()
        for(index in 0 .. s.lastIndex) {
            val currentChar = s[index]
            if (currentChar == '#' ) {  
                if( sResult.isNotEmpty()){
                sResult.deleteCharAt(sResult.length - 1)
                }
            } else {
                sResult.append(currentChar)
            }
        }

        var tResult = StringBuilder()
        for(index in 0 .. t.lastIndex) {
            val currentChar = t[index]
            if (currentChar == '#' ) {  
                if(tResult.isNotEmpty()) {
                tResult.deleteCharAt(tResult.length - 1)
                }
            } else{
                tResult.append(currentChar)
            }
            
        }
        return sResult.toString() == tResult.toString()
    }
}
