class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        int currentWater;
        int minHeight;
        
        while (left < right) {
            minHeight = Math.min(height[left], height[right]);
            currentWater = minHeight * Math.abs(right - left);
            maxWater = Math.max(currentWater, maxWater);
            
            if (height[left] <= height[right])
                left++;
            else
                right--;
            
        }
        
        return maxWater;
    }
}
