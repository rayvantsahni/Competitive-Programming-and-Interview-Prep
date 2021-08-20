class Solution {
    public int longestCommonSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        int[][] matrix = new int[m+1][n+1];
        
        for (int row = 1; row <= m; row++) 
            for (int col = 1; col <= n; col++) 
                matrix[row][col] = s.charAt(row - 1) == t.charAt(col - 1) ? matrix[row - 1][col - 1] + 1 : Math.max(matrix[row - 1][col], matrix[row][col - 1]);
        
        return matrix[m][n];
    }
} 
