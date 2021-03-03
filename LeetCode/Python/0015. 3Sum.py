class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        if n < 3:
            return []
        
        triplets = set()
        nums.sort()
        
        for i in range(n):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            left, right = i + 1, n - 1
            
            while left < right:
                _sum = nums[left] + nums[right] + nums[i]
                
                if _sum == 0:
                    triplets.add((nums[i], nums[left], nums[right]))
                    left, right = left + 1, right - 1
                elif _sum < 0:
                    left += 1
                else:
                    right -= 1
                    
        return triplets
