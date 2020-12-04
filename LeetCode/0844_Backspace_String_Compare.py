class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        if not len(s) and not len(t):
            return True
        
        stack = []
        
        for char in s:
            if char == "#":
                if len(stack):
                    stack.pop()
            else:
                stack.append(char)
                
        new_s = stack.copy()
        stack.clear()
        
        for char in t:
            if char == "#":
                if len(stack):
                    stack.pop()
            else:
                stack.append(char)
                
        return new_s == stack
