class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                max = Math.max(max, (nums[i] - 1) * (nums[j] - 1));
        
        return max;
    }
}
