class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        s_stack = []
        t_stack = []
        
        for char in s:
            if char == "#":
                if len(s_stack):
                    s_stack.pop()
            else:
                s_stack.append(char)
                
        for char in t:
            if char == "#":
                if len(t_stack):
                    t_stack.pop()
            else:
                t_stack.append(char)
                
        return s_stack == t_stack
