class Solution:
    def numberOfSteps (self, num: int) -> int:
        return self._number_of_steps(num)
    
    def _number_of_steps(self, num, count = 0):
        if not num:
            return count
        return self._number_of_steps(num - 1, count + 1) if num % 2 else self._number_of_steps(num // 2, count + 1)
