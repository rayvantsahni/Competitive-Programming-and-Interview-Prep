class Solution:
    def removeDuplicates(self, arr: List[int]) -> int:
        n = len(arr)
        for i in range(1, n):
            if arr[i - 1] == arr[i]:
                arr[i - 1] = float("inf")
        
        arr.sort()
        return n - arr.count(float("inf"))
