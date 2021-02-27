class Solution {
    public String generateTheString(int n) {
        StringBuilder s = new StringBuilder();
        
        if ((n & 1) == 1) {
            while (n-- != 0)
                s.append('a');
        } else {
            s.append('a');
            while (n-- != 1)
                s.append('b');
        }
        
        return s.toString();
    }
}
