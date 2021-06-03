class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        length = len(strs)
        if not length:
            return ""
        if length == 1:
            return strs[0]
        if length == 2:
            left, right = strs[0], strs[1]
            shorter = min(len(left), len(right))
            for i in range(shorter):
                if left[i] != right[i]:
                    return left[:i]
            return left[:shorter]
            
        mid = length // 2
        left = self.longestCommonPrefix(strs[:mid + 1])
        right = self.longestCommonPrefix(strs[mid + 1:])
        return self.longestCommonPrefix([left, right])
