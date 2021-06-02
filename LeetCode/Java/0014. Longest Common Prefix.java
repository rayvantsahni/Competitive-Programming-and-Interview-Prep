class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int min = Integer.MAX_VALUE;
        
        for (String str: strs)
            min = Math.min(min, str.length());
            
        for (int i = 0; i < min; i++) {
            HashSet<Character> s = new HashSet<>();
            for (String str: strs)
                s.add(str.charAt(i));
            
            
            if (s.size() == 1)
                prefix.append(s.toArray()[0]);
            else
                return prefix.toString();
        }
        
        return prefix.toString();
    }
}
