class Solution:
    def validPalindrome(self, s: str) -> bool:
        l, r = 0, len(s) - 1
        
        while l < r:
            if s[l] != s[r]:
                return self._validPalindrome(s, l + 1, r) or self._validPalindrome(s, l, r - 1)
            l += 1
            r -= 1
        
        return True
    
    def _validPalindrome(self, s, left, right):
        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True
