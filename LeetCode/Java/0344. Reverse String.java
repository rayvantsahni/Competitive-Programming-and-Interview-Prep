class Solution {
    public void reverseString(char[] s) {
        int left = -1;
        int right = s.length;
        
        while (++left < --right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

        }
    }
}
