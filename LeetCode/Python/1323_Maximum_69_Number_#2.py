class Solution:
    def maximum69Number (self, num: int) -> int:
        try:
            s = str(num)
            index = s.index('6')
            new = s[:index] + '9' + s[index + 1:]
            return new
        except:
            return num
