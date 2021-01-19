class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        
        if not n:
            return 0
        if n == 1:
            return nums[0]
        if n == 2:
            return max(nums)
        
        potential_amounts = [nums[0], max(nums[0], nums[1])]
        
        for i in range(2, n):
            potential_amounts.append(max(potential_amounts[i - 2] + nums[i], potential_amounts[i - 1]))
            
        return potential_amounts[n - 1]
