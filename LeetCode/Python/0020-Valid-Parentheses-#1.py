class Solution:
    def isValid(self, s: str) -> bool:
        if not len(s): 
            return True
        if len(s) == 1: 
            return False
        
        stack = []
        
        for i in s:
            if i in ("(", "{", "["):
                stack.append(i)
            else:
                if not len(stack): 
                    return False
                close = stack.pop()
                if close == "(" and i != ")":
                    return False
                elif close == "{" and i != "}":
                    return False
                elif close == "[" and i != "]":
                    return False
            
        if not len(stack): 
            return True
        else: 
            return False
