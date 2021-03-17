class Solution:
    def defangIPaddr(self, address: str) -> str:
        defange_address = []
        
        for char in address:
            if char == '.':
                defange_address.append("[.]")
            else:
                defange_address.append(char)
                
        return "".join(defange_address)
