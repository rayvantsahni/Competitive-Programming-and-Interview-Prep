class Solution {
    public int missingNumber(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int num: nums) {
            max = Math.max(max, num);
            sum += num;
        }
        
        int diff = (((max + 1) * max) / 2) - sum;
        if (diff != 0)
            return diff;
        if (max == nums.length)
            return 0;
        return max + 1;
    }
}
