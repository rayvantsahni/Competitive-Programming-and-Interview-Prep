class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        c = collections.Counter(nums)
        
        for i in range(c[0]):
            nums[i] = 0
        for i in range(c[0], c[0] + c[1]):
            nums[i] = 1
        for i in range(c[0] + c[1], c[0] + c[1] + c[2]):
            nums[i] = 2
