class Solution:
    def climbStairs(self, n: int, memo={}) -> int:
        if n == 1 or n == 2:
            return n
        if n in memo:
            return memo[n]
        else:
            memo[n] = self.climbStairs(n - 1, memo) + self.climbStairs(n - 2, memo)
        return memo[n]
