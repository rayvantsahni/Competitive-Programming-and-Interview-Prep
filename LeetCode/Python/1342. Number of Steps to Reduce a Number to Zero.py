class Solution:
    def numberOfSteps (self, n: int) -> int:
        count = 0
        
        while n != 0:
            n = n - 1 if n & 1 else n // 2
            count += 1
        return count
