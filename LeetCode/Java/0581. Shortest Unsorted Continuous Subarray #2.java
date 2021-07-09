class Solution {
    private boolean isInOrder(int[] arr, int i) {
		if (i == 0)
			return arr[i] <= arr[i + 1];
		if (i == arr.length - 1)
			return arr[i] >= arr[i - 1];
		return arr[i] >= arr[i - 1] && arr[i] <= arr[i + 1];
	}
    
    public int findUnsortedSubarray(int[] arr) {
		int n = arr.length;
		if (n == 1)
			return 0;

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
			if (!isInOrder(arr, i)) {
				max = Math.max(max, arr[i]);
				min = Math.min(min, arr[i]);
			}
		}
        
		if (min == Integer.MAX_VALUE)
			return 0;

        int left = 0;
        while (arr[left] <= min)
            left++;

        int right = n - 1;
        while (arr[right] >= max)
            right--;
        
		return right - left + 1;
    }
}
