class Solution {
    public int longestMountain(int[] arr) {
		int n = arr.length;
        if (n < 3)
			return 0;
		
		int count = 0;
		int max = 0;
		int j, k;
		
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				count = 1;
				
				j = i;
				while (j >= 1 && arr[j] > arr[j - 1]) {
					count++;
					j--;
				}
				
				k = i;
				while (k < n - 1 && arr[k] > arr[k + 1]) {
					count++;
					k++;
				}

				max = Math.max(max, count);
			}
		}

		return max;
    }
}
