class Solution {
    public boolean validPalindrome(String s) {
        return skipFromStart(s) || skipFromEnd(s);
    }
    
    private boolean skipFromStart(String s) {
        int end = s.length() - 1;
        boolean skipped = false;
        
        for (int start = 0; start < end; start++) {
            if (s.charAt(start) != s.charAt(end) && !skipped) {
                skipped = true;
                end++;
            }
            else if (s.charAt(start) != s.charAt(end) && skipped)
                return false;
            
            end--;
        }
        return true;
    }
    
    private boolean skipFromEnd(String s) {
        int start = 0;
        boolean skipped = false;
        
        for (int end = s.length() - 1; end > start; end--) {
            if (s.charAt(start) != s.charAt(end) && !skipped) {
                skipped = true;
                start--;
            }
            else if (s.charAt(start) != s.charAt(end) && skipped)
                return false;
            
            start++;
        }
        return true;
    }
}
