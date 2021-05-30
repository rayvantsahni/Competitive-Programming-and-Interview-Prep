class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        int windowSum = 0;
        
        while (end < nums.length) {
            windowSum += nums[end];
            
            while (windowSum >= target) {
                windowSum -= nums[start];
                start++;
                min = Math.min(min, end - start + 1);
            }
            
            end++;
        }
        
        return min == Integer.MAX_VALUE ? 0 : min + 1;
    }
}
