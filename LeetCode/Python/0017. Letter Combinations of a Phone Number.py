class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        
        all_combinations = []
        self._letterCombinations(digits, [], all_combinations)
        return all_combinations
    
    def getMapping(self, n):
        return ("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")[ord(n) - ord('0')]
    
    def _letterCombinations(self, digits, current, all_combinations):
        if not digits:
            all_combinations.append("".join(current))
            return
        
        mapping = self.getMapping(digits[0])
        for char in mapping:
            self._letterCombinations(digits[1:], current + [char], all_combinations)
