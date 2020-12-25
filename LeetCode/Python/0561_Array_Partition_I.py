class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if len(nums) == 2:
            return min(nums)
        
        _sum = 0
        nums.sort()
        
        while nums:
            nums.pop()
            _sum += nums.pop()
            
        return _sum
