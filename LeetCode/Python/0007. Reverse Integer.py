class Solution:
    def reverse(self, num: int) -> int:
        negative = True if num < 0 else False
        
        if negative:
            n = -int("".join(reversed(str(-num))))
        else:
            n = int("".join(reversed(str(num))))
        
        return n if -pow(2, 31) <= n <= pow(2, 31) - 1 else 0
