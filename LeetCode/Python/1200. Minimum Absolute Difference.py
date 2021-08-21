class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        minimum = float("inf")
        s = set()
        result = []
        
        for i in range(1, len(arr)):
            minimum = min(minimum, abs(arr[i] - arr[i - 1]))
        
        for a in arr:
            if a + minimum in s:
                result.append([a + minimum, a])
            if a - minimum in s:
                result.append([a - minimum, a])
            s.add(a)
            
        return result
