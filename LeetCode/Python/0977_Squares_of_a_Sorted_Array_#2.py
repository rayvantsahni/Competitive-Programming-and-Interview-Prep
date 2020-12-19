class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        
        right = 0
        for num in nums:
            if num >= 0:
                break
            right += 1
        
        left = right - 1
        squares = []
        
        while left >= 0 and right < n:
            if nums[left] ** 2 > nums[right] ** 2:
                squares.append(nums[right] ** 2)
                right += 1
            else:
                squares.append(nums[left] ** 2)
                left -= 1
                
        while left >= 0:
            squares.append(nums[left] ** 2)
            left -= 1
            
        while right < n:
            squares.append(nums[right] ** 2)
            right += 1
                
        return squares
