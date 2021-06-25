class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        
        for (int i = 0; i < nums.length; i++) 
            if (nums[i] != 0)
                swap(nums, i, nonZero++);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
