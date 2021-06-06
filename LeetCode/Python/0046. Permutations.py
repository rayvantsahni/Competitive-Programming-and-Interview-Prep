class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        all_permutations = []
        self._permute(nums, [], all_permutations)
        return all_permutations
    
    def _permute(self, arr, current, all_permutations):
        if len(arr) == 0:
            all_permutations.append(current) 
        for i in range(len(arr)):
            self._permute(arr[:i] + arr[i+1:], [arr[i]] + current, all_permutations)
