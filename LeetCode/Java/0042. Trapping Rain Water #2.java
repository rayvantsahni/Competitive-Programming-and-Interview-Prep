class Solution {
    public int trap(int[] heights) {
		int n = heights.length;
        if (n == 0)
            return 0;
        
		int totalWater = 0;
		int min;
		int left, right;

		int[] leftMax = new int[n];
		int [] rightMax = new int[n];
		leftMax[0] = heights[0];
		rightMax[n - 1] = heights[n - 1];

		for (int i = 1; i < n; i++)
			leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
		for (int i = n - 2; i >= 0; i--)
			rightMax[i] = Math.max(heights[i], rightMax[i + 1]);

		for (int i = 1; i < n - 1; i++) {
			left = leftMax[i];
			right = rightMax[i];
			min = Math.min(left, right);
			
			if (min > heights[i])
				totalWater += min - heights[i];
		}

        return totalWater;
    }
}
