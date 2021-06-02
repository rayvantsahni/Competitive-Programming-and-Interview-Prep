class Solution:
    def longestCommonPrefix(self, strings: List[str]) -> str:
        prefix = []
        shortest = float("inf")
        
        for string in strings:
            shortest = min(shortest, len(string))
        
        for index in range(shortest):
            s = set()
            for string in strings:
                s.add(string[index])
            
            if len(s) == 1:
                prefix.append(s.pop())
            else:
                return "".join(prefix)
            
        return "".join(prefix)
