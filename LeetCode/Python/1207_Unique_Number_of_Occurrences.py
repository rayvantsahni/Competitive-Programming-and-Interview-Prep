class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        if len(arr) == 1:
            return True
        
        from collections import Counter
        c = Counter(arr)
        return len(c.keys()) == len(set(c.values()))
