class Solution:
    def twoSum(self, arr: List[int], target: int) -> List[int]:
        left, right = 0, len(arr) - 1
        
        while left < right:
            _sum = arr[left] + arr[right]
            
            if _sum == target:
                return [left + 1, right + 1]
            elif _sum < target:
                left += 1
            elif _sum > target:
                right -= 1
