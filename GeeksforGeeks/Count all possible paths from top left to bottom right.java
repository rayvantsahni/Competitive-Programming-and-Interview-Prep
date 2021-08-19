// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int m = Integer.parseInt(input[0]); 
            int n = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.numberOfPaths(m,n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    long MOD = 1000000007;
    
    boolean isValid(int[][] matrix, int x, int y) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        return x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] == 0;
    }
    
    long numberOfPaths(int m, int n) {
        // code here
        int[][] matrix = new int[m][n];
        return numberOfPaths(matrix, 0, 0, new HashMap<String, Long>());
    }
    
    long numberOfPaths(int[][] matrix, int x, int y, HashMap<String, Long> dp) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        if (x == m - 1 && y == n - 1) 
            return 1;
        
        if (!isValid(matrix, x, y)) 
            return 0;
            
        String pair = x + " " + y;
        if (dp.containsKey(pair))
            return dp.get(pair);
        
        matrix[x][y] = 1;
        
        long count = 0;
        count = (count + numberOfPaths(matrix, x+1, y, dp)) % MOD;
        count = (count + numberOfPaths(matrix, x, y+1, dp)) % MOD;
        
        matrix[x][y] = 0;
        
        dp.put(pair, count);
        return count;
    }
}
