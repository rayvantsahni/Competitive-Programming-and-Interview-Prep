class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        from collections import Counter
        c = Counter(nums)
        good = 0
        
        for num in c:
            good += self._sum(c.get(num))
        
        return good
            
            
    def _sum(self, n):
        return (n * (n - 1)) // 2
