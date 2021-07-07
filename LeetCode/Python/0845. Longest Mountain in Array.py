class Solution:
    def longestMountain(self, arr: List[int]) -> int:
        n = len(arr)
        count = 0
        _max = 0
        
        for i in range(1, n - 1):
            if arr[i - 1] < arr[i] > arr[i + 1]:
                count = 1
                
                j, k = i, i
                while j >= 1 and arr[j] > arr[j - 1]:
                    count += 1
                    j -= 1
                while k < n - 1 and arr[k] > arr[k + 1]:
                    count += 1
                    k += 1
                _max = max(_max, count)
                
        return _max
