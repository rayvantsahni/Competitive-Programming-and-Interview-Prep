class Solution:
    def shuffle(self, arr: List[int], n: int) -> List[int]:
        result = []
        
        for i in range(n):
            result.append(arr[i])
            result.append(arr[i + n])
        return result
