class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        first = second = -math.inf
        
        for num in nums:
            if num == 1:
                continue
            if num > first:
                first, second = num, first
            elif num > second:
                second = num

        product = (first - 1) * (second - 1)
        return product if not product == inf else 0
