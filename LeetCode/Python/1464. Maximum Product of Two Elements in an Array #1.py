class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n = len(nums)
        _max = -float("inf")
        
        for i in range(n):
            for j in range(i + 1, n):
                _max = max(_max, (nums[i] - 1) * (nums[j] - 1))
        
        return _max
