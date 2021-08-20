class Solution {
    private int getMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    
    public int minDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        int[][] matrix = new int[m+1][n+1];
        
        for (int row = 0; row <= m; row++) {
            for (int col = 0; col <= n; col++) {
                if (row == 0 || col == 0)
                    matrix[row][col] = Math.abs(row - col);
                else if (s.charAt(row - 1) == t.charAt(col - 1)) 
                    matrix[row][col] = matrix[row - 1][col - 1];
                else 
                    matrix[row][col] = 1 + getMin(matrix[row - 1][col], matrix[row][col - 1], matrix[row - 1][col - 1]);
            }
        }
        
        return matrix[m][n];
    }
}
