class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = max(nums)
        s = sum(nums)
        diff = (((n ** 2) + n) // 2) - s
        if not diff:
            if len(nums) == n:
                return 0
            else:
                return n + 1
        else:
            return diff
