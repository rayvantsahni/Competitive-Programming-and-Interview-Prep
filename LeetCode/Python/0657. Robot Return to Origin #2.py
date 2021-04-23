class Solution:
    def judgeCircle(self, moves: str) -> bool:
        from collections import Counter
        c = Counter(moves)
        
        return c.get("U", 0) == c.get("D", 0) and c.get("L", 0) == c.get("R", 0)
