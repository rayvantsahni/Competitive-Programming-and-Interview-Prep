class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        column_number = 0
        
        for i, char in enumerate(reversed(columnTitle)):
            mapping = ord(char) - ord('A') + 1
            column_number += pow(26, i) * mapping    
        return column_number
