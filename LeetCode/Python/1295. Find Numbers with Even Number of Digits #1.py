class Solution:
    def findNumbers(self, arr: List[int]) -> int:
        count = 0
        
        for a in arr:
            if not len(str(a)) & 1:
                count += 1
        return count
