class Solution {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {    
        
        var currentSum = 0
        var result = 0
        var left = 0
        var right = 0

        while(right < arr.size) {
            currentSum += arr[right]

            val currentSize = right - left + 1
            if(currentSize == k) {
               val currentAvg = currentSum / k 
               if (currentAvg >= threshold) {
                result++
               }       
               currentSum -= arr[left]
               left++        
            }             
            right++        
        }        
        
        return result
    }
}
