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
    
    long numberOfPaths(int m, int n) {
        // code here
        long[][] matrix = new long[m+1][n+1];
        return numberOfPaths(matrix, m, n);
    }
    
    long numberOfPaths(long[][] matrix, int m, int n) {
        
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 && col == 1)
                    matrix[row][col] = 1;
                else
                    matrix[row][col] = (matrix[row - 1][col] + matrix[row][col - 1]) % MOD;
            }
        }
        
        return matrix[m][n];
    }
    
}
