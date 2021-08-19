class Solution {
    private int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int a: arr)
            max = Math.max(a, max);
        return max;
    }
    
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int current;
        
        for (int i = 1; i < n; i++) {
            current = arr[i];
            
            int j = i;
            while (j-- != 0) {
                if (current <= arr[j])
                    continue;
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        return getMax(dp, n);
    }
} 
