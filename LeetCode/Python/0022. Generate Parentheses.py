class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        all_combinations = []
        self._generateParenthesis(n, 0, 0, "", all_combinations)
        return all_combinations
    
    def _generateParenthesis(self, n, opened, closed, s, all_combinations):
        if opened > n:
            return
        if closed > opened:
            return
        if opened == closed == n:
            all_combinations.append(s)
        else:
            self._generateParenthesis(n, opened + 1, closed, s + "(", all_combinations)
            self._generateParenthesis(n, opened, closed + 1, s + ")", all_combinations)
