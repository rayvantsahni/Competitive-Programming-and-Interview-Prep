// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMaximumSubarraySum(int[] arr) {
        int windowSum = 0;
        int max = Integer.MIN_VALUE;
        
        for (int a: arr) {
            windowSum = Math.max(windowSum + a, a);
            max = Math.max(max, windowSum);
        }
        
        return max;
    }
    
    int maximumSumRectangle(int m, int n, int matrix[][]) {
        // code here
        int maxRowSum = Integer.MIN_VALUE;
        int maxRectangleSum = Integer.MIN_VALUE;
        
        for (int L = 0; L < n; L++) {
            int[] runningColSum = new int[m];
            
            for (int R = L; R < n; R++) {
                for (int row = 0; row < m; row++) {
                    runningColSum[row] += matrix[row][R];
                }
                
                maxRowSum = getMaximumSubarraySum(runningColSum);
                maxRectangleSum = Math.max(maxRectangleSum, maxRowSum);
            }
        }
        return maxRectangleSum;
    }
};
