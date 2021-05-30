class Solution {
    public int maxPower(String s) {
        int n = s.length();
        int max = 1;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (set.contains(c)) {
                count++;
                max = Math.max(count, max);
            }
            else {
                set = new HashSet<>();
                set.add(c);
                count = 1;
            }
        }
        
        return max;
    }
}
