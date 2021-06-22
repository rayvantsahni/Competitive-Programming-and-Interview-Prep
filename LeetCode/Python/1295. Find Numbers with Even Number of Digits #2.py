class Solution:
    def numLength(self, n):
        count = 0
        while n:
            n //= 10
            count += 1
        return count
        
    def findNumbers(self, arr: List[int]) -> int:
        count = 0
        for a in arr:
            if not self.numLength(a) & 1:
                count += 1
        return count
