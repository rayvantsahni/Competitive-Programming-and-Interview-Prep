class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> allCombinations = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", allCombinations);
        return allCombinations;
    }
    
    private void generateParenthesis(int n, int opened, int closed, String s, ArrayList<String> allCombinations) {
        if (opened > n)
            return;
        if (closed > opened)
            return;
        if (opened == n && closed == n) {
            allCombinations.add(s);
            return;
        }
        
        generateParenthesis(n, opened + 1, closed, s + "(", allCombinations);
        generateParenthesis(n, opened, closed + 1, s + ")", allCombinations);
    }
}
