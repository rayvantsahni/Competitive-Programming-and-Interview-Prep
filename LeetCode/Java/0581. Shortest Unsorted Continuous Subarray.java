class Solution {
    public int findUnsortedSubarray(int[] arr) {
		int n = arr.length;
		if (n == 1)
			return 0;

		int start = 0;
		int end = 0;
		int[] sorted = Arrays.copyOf(arr, n);
		Arrays.sort(sorted);

        boolean isSorted = true;
		for (int i = 0; i < n; i++) 
			if (sorted[i] != arr[i]) {
				start = i;
                isSorted = false;
                break;
            }
		
        if (isSorted)
            return 0;
        
		for (int i = n - 1; i >= 0; i--)
			if (sorted[i] != arr[i]) {
				end = i;
                break;
            }

		return end - start + 1;

    }
}