class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            
            if (!isValid(leftChar)) {
                left++;
                continue;
            }
            
            if (!isValid(rightChar)) {
                right--;
                continue;
            }
            
            if (leftChar != rightChar)
                return false;
            left++;
            right--;
        }
        
        return true;
    }
    
    private boolean isValid(char c) {
        if (c == 32)
            return false;
            
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57))
            return true;
        
        return false;
    }
}
