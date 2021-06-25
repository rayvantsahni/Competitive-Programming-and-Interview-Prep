class Solution:
    def moveZeroes(self, arr: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(arr)
        non_zero = 0
        
        for i in range(n):
            if arr[i] != 0:
                arr[i], arr[non_zero] = arr[non_zero], arr[i]
                non_zero += 1
