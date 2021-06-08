class Solution {
    public List<String> letterCombinations(String digits) {
        var allCombinations = new ArrayList<String>();
        
        if (digits.length() == 0)
            return allCombinations;
        
        letterCombinations(digits, "", allCombinations);
        return allCombinations;
    }
    
    private void letterCombinations(String digits, String current, ArrayList<String> allCombinations) {
        if (digits.length() == 0) {
            allCombinations.add(current);
            return;
        }
        
        String mapping = getMapping(digits.charAt(0));
        for (int i = 0; i < mapping.length(); i++)
            letterCombinations(digits.substring(1), current + mapping.charAt(i), allCombinations);
    }
    
    private String getMapping(char n) {
        return new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"} [n - '0'];
    }
}
