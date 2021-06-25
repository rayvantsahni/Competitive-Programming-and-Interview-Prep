class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int count = 0;
        
        for (int i = 1; i < n; i++) 
            if (arr[i - 1] == arr[i]) {
                arr[i - 1] = Integer.MAX_VALUE;
                count++;
            }
        
        Arrays.sort(arr);
        return n - count;
    }
}
