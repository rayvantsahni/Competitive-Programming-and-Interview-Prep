class Solution:
    def findLucky(self, arr: List[int]) -> int:
        from collections import Counter
        c = Counter(arr)
        
        lucky = -1
        for num in c:
            if num == c.get(num):
                lucky = max(lucky, num)
        
        return lucky
