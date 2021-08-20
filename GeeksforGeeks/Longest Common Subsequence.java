// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends




class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s, String t) {
        // your code here
        int[][] matrix = new int[x+1][y+1];
        
        for (int row = 1; row <= x; row++) 
            for (int col = 1; col <= y; col++) 
                matrix[row][col] = s.charAt(row - 1) == t.charAt(col - 1) ? matrix[row - 1][col - 1] + 1 : Math.max(matrix[row - 1][col], matrix[row][col - 1]);
        
        return matrix[x][y];
    }
    
}
