class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int columnNumber = 0;
        int mapping;
        
        for (int i = 0; i < n; i++) {
            mapping = columnTitle.charAt(i) - 'A' + 1;
            columnNumber += mapping * (int) Math.pow(26, n - i - 1);
        }
        return columnNumber;
    } 
}
