class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0 or n == 1:
            return n
        if n == 2:
            return 1
        
        first, second, third = 0, 1, 1
        
        for _ in range(n - 2):
            first, second, third = second, third, first + second + third
        
        return third
