class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        for (String string: word1)
            s1.append(string);
        
        for (String string: word2)
            s2.append(string);
        
        return s1.toString().equals(s2.toString());
    }
}
