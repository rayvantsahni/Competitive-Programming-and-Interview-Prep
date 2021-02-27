class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        first = second = -math.inf
        
        for num in nums:
            if num > first:
                first, second = num, first
            elif num > second:
                second = num

        return (first - 1) * (second - 1)
