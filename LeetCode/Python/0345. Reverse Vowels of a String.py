class Solution:
    def reverseVowels(self, s: str) -> str:
        s = list(s)
        left, right = 0, len(s) - 1
        
        while left < right:
            if not self.is_vowel(s[left]):
                left += 1
                continue

            if not self.is_vowel(s[right]):
                right -= 1
                continue

            s[left], s[right] = s[right], s[left]
            left += 1
            right -= 1

        return "".join(s)
        
    def is_vowel(self, letter):
        return letter in "aeiouAEIOU"
