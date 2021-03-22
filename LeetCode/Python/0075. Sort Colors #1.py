class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def swap(arr, left, right):
            arr[left], arr[right] = arr[right], arr[left]
        
        j = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                swap(nums, i, j)
                j += 1
        
        j = len(nums) - 1
        for i in range(len(nums) - 1, -1, -1):
            if nums[i] == 2:
                swap(nums, i, j)
                j -= 1
        
