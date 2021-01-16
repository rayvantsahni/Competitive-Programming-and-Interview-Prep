class Solution:
    def maximum69Number (self, num: int) -> int:
        digits = list(str(num))
        changed = False
        
        for index, digit in enumerate(digits):
            if digit == '6':
                digits[index] = '9'
                changed = True
                break
        
        if not changed:
            return num
        return int("".join(digits))
