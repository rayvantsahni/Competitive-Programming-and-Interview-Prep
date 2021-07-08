class Solution {
    private int getMax(int[] arr, int left, int right) {
		int max = 0;

		for (int i = left; i <= right; i++)
			max = Math.max(max, arr[i]);
		return max;
	}
    
    public int trap(int[] height) {
		int n = height.length;
		int totalWater = 0;
		int leftMax, rightMax;
		int min;

		for (int i = 1; i < n - 1; i++) {
			leftMax = getMax(height, 0, i - 1);
			rightMax = getMax(height, i + 1, n - 1);
			min = Math.min(leftMax, rightMax);
			
			if (min > height[i])
				totalWater += min - height[i];
		}

        return totalWater;
    }
}
