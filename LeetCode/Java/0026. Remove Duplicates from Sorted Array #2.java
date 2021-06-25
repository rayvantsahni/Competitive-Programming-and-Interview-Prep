class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int lastUnique = 0;
        
        for (int i = 1; i < n; i++) 
            if (arr[i] != arr[lastUnique])
                swap(arr, i, ++lastUnique);
        
        return ++lastUnique;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
