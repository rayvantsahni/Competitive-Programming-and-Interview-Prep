class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);
        
        int[] possibleAmounts = new int[nums.length];
        
        possibleAmounts[0] = nums[0];
        possibleAmounts[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < n; i++)
            possibleAmounts[i] = Math.max(possibleAmounts[i - 2] + nums[i], possibleAmounts[i - 1]);
        
        return possibleAmounts[n - 1];
        
    }
}
