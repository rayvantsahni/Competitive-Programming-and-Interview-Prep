class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if not n or n < 0:
            return False
        
        x = 1
        while x <= n:
            if x == n:
                return True
            x *= 3
        return False
