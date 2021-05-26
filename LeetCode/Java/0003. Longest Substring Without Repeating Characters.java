class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0)
            return 0;
        
        int start = 0;
        int max = 0;
        HashSet<Character> window = new HashSet<>();
        
        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            if (!window.contains(c)) {
                window.add(c);
                max = Math.max(max, end - start + 1);
            } else {
                window.remove(s.charAt(start++));
                end--;
            }
        }
        
        return max;
    }
}
