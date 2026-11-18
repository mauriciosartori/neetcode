class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        for (asteroid in asteroids) {
            if (stack.isEmpty()) {
                stack.addLast(asteroid)
                continue
            }
            var alive = true
            while (stack.isNotEmpty() && stack.peekLast() > 0 && asteroid < 0){
                if(abs(stack.peekLast()) < abs(asteroid)) {
                    stack.removeLast()
                    
                } else if (abs(stack.peekLast()) == abs(asteroid)) {
                    stack.removeLast()
                    alive = false
                    break
                } else {
                    // abs(stack.peekLast()) > abs(asteroid)  // Muere el actual
                    alive = false                    
                    break
                }                                  
            }            
            if (alive) stack.addLast(asteroid)
        }
        return stack.toIntArray()
    }
}
