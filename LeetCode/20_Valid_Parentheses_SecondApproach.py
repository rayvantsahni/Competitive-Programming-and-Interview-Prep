class Solution:
    def isValid(self, s: str) -> bool:       
        stack = []
        bracket_pairs = {"{": "}", "(": ")", "[": "]"}
        
        for i in s:
            if i in bracket_pairs:
                stack.append(i)
            else:
                if len(stack) == 0: 
                    return False
                last = stack.pop()
                if i != bracket_pairs[last]: 
                    return False
            
        return len(stack) == 0
