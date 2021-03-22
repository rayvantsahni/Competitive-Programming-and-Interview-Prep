class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        
        int j = 0;
        for (int i = 0; i < n; i++)
            if (nums[i] == 0)
                swap(nums, i, j++);
        
        j = n - 1;
        for (int i = n - 1; i >= 0; i--)
            if (nums[i] == 2)
                swap(nums, i, j--);
    }
    
    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
