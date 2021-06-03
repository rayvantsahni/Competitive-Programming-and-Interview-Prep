from collections import Counter

class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        c = Counter(text)
        balloon = Counter("balloon")
        
        count = float("inf")
        for char in balloon:
            count = min(count, c.get(char, 0) // balloon.get(char))
            
        return count
