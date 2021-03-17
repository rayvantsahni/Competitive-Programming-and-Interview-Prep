class Solution {
    public String defangIPaddr(String address) {
        StringBuilder defangedAddress = new StringBuilder();
        
        for (int i = 0; i < address.length(); i++) {
            char currentChar = address.charAt(i);
            
            if (currentChar == '.')
                defangedAddress.append("[.]");
            else
                defangedAddress.append(currentChar);
        }
        
        return defangedAddress.toString();
    }
}
