class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count = 0
        
        for index, num_i in enumerate(nums):
            for num_j in nums[index + 1:]:
                if num_i == num_j:
                    count += 1
                    
        return count
