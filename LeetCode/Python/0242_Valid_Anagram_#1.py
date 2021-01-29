class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if not len(s) and not len(t):
            return True
        if len(s) != len(t):
            return False
        
        from collections import Counter
        return Counter(s) == Counter(t)
