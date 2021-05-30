class Solution:
    def maxPower(self, s: str) -> int:
        count = 0
        _max = 0
        at_hand = 'A'
        
        for char in s:
            if char == at_hand:
                count += 1
            else:
                at_hand = char
                count = 1
            _max = max(_max, count)
        
        return _max
