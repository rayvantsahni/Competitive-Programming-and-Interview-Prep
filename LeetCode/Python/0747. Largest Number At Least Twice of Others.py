class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        max_index = 0
        
        for index, num in enumerate(nums):
            if num > nums[max_index]:
                max_index = index
        
        for index, num in enumerate(nums):
            if index == max_index:
                continue
            if not nums[max_index] >= 2 * num:
                return -1
        
        return max_index
