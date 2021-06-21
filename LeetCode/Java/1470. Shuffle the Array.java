class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        
        for (int i = 0; i < 2 * n; i += 2) {
            result[i] = nums[i / 2];
            result[i + 1] = nums[(i / 2) + n];
        }
        
        return result;
    }
}
