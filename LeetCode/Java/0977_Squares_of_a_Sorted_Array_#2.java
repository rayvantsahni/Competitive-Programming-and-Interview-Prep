class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int right = 0;
        for (int num: nums) {
            if (num >= 0)
                break;
            right++;
        }
        
        int left = right - 1;
        int[] squares = new int[n];
        int index = 0;
        
        while (left >= 0 && right < n) {
            if (nums[left] * nums[left] < nums[right] * nums[right])
                squares[index++] = nums[left] * nums[left--];
            else
                squares[index++] = nums[right] * nums[right++];
        }
        
        while (left >= 0)
            squares[index++] = nums[left] * nums[left--];
        
        while (right < n)
            squares[index++] = nums[right] * nums[right++];
        
        return squares;
    }
}
