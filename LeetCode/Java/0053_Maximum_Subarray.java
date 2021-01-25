class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0] + nums[1], Math.max(nums[0], nums[1]));
        
        int currentSum = 0;
        int maxSum = nums[0];
        
        for (int num: nums) {
            if (currentSum < 0)
                currentSum = 0;
            currentSum += num;
            maxSum = Math.max(currentSum, maxSum);
        }
        
        return maxSum;
    }
}
