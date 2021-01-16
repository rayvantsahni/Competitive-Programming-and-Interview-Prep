class Solution:
    def searchRange(self, arr: List[int], target: int) -> List[int]:
        positions = [-1, -1]
        
        for i in range(len(arr)):
            if arr[i] == target:
                positions[0] = i
                break
        
        if positions[0] == -1:
            return positions
        
        for i in range(len(arr) - 1, -1, -1):
            if arr[i] == target:
                positions[1] = i
                return positions
