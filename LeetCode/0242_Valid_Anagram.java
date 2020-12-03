class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 && s.length() == 0)
            return true;
        
        if (s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> sCounter = new HashMap<>();
        HashMap<Character, Integer> tCounter = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sCounter.put(c, sCounter.getOrDefault(c, 0) + 1);
            c = t.charAt(i);
            tCounter.put(c, tCounter.getOrDefault(c, 0) + 1);
        }
        
        return sCounter.equals(tCounter);
    }
}
