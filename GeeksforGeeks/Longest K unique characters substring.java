// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int n = s.length();
        if (n < k || n <= 0)
            return -1;
            
        int start = 0;
        int end = 0;
        int max = 0;
        boolean flag = false;
        HashMap<Character, Integer> window = new HashMap<>();

        while (end < s.length()) {
            char current = s.charAt(end);
            window.put(current, window.getOrDefault(current, 0) + 1);

            while (window.size() > k) {
                char startChar = s.charAt(start);

                window.put(startChar, window.get(startChar) - 1);
                if (window.get(startChar) == 0)
                    window.remove(startChar);
                start++;
            }

            if (window.size() == k) {
                flag = true;
                max = Math.max(max, end - start + 1);
            }

            end++;
        }

        return flag ? max : -1;

    }
}
