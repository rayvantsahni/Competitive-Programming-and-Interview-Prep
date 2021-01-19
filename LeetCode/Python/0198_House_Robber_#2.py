class Solution:
    def rob(self, nums: List[int]) -> int:       
        if not nums:
            return 0
        
        first, second = nums[0], max(nums[:2])
        
        for num in nums[2:]:
            current = max(first + num, second)
            first, second = second, current
        
        return second
            
