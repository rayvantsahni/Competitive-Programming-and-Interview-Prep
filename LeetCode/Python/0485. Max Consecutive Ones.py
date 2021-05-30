class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        _max = 0
        count = 0
        
        for num in nums:
            if num:
                count += 1
                _max = max(_max, count)
            else:
                count = 0
        
        return _max
