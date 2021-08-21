class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        if nums == []:
            return [[]]
        
        subsets = self.subsets(nums[1:])
        size = len(subsets)

        for i in range(size):
            new_subset = subsets[i] + [nums[0]]
            subsets.append(new_subset)
        
        return subsets
