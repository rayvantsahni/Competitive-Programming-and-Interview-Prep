class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());
        int i = 0;
        
        while (i < minLength) {
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(i));
            i++;
        }
        
        mergedString.append(word1.substring(i));
        mergedString.append(word2.substring(i));
        
        return mergedString.toString();
    }
}
