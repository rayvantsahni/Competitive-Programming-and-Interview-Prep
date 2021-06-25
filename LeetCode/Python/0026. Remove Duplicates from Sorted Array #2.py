class Solution:
    def removeDuplicates(self, arr: List[int]) -> int:
        last_unique = 0
        n = len(arr)
        
        for i in range(1, n):
            if arr[i] != arr[last_unique]:
                arr[i], arr[last_unique + 1] = arr[last_unique + 1], arr[i]
                last_unique += 1
        
        return last_unique + 1
            
