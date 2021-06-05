// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
    public long countFriendsPairings(int n) { 
    /*
      if (n == 1 || n == 2) 
          return n;
      return (countFriendsPairings(n - 1) * 1 + countFriendsPairings(n - 2) * (n - 1)) % 1000000007;
     */
     
    if (n <= 2)
        return n;
        
    long[] ways = new long[n + 1];
    ways[1] = 1;
    ways[2] = 2;
    
    for (int i = 3; i <= n; i++)
        ways[i] = (ways[i - 1] + ways[i - 2] * (i - 1)) % 1000000007;
        
    return ways[n];
    }
}    
 
