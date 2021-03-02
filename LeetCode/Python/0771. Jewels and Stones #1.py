class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        from collections import Counter
        
        stones = Counter(stones)
        count = 0
        
        for jewel in jewels:
            count += stones.get(jewel, 0)
        
        return count
