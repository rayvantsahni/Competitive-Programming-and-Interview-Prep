class Solution:
    def reverse(self, x: int) -> int:
        MIN, MAX = -(2 ** 31), (2 ** 31) - 1
        if x == 0:
            return 0
        
        negative = False
        if x < 0:
            negative = True
            x *= -1
        
        new = 0
        while x:
            new = (new * 10) + (x % 10)
            x //= 10
        
        if negative:
            new *= -1
        return new if MIN <= new <= MAX else 0
        
