class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        from collections import Counter
        
        c = Counter(nums)
        for num in nums:
            if c.get(num) > len(nums) // 2:
                return num
