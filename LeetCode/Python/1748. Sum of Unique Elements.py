class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        from collections import Counter
        
        c = Counter(nums)
        _sum = 0
        
        for key in c:
            if c.get(key) == 1:
                _sum += key
        
        return _sum
