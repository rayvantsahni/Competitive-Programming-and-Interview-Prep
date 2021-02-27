class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        merged_string = []
        min_length = min(len(word1), len(word2))
        
        for i in range(min_length):
            merged_string += [word1[i], word2[i]]
        
        return "".join(merged_string) + word1[min_length:] + word2[min_length:]
