class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] positions = {-1, -1};
        
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) {
                positions[0] = i;
                break;
            }
        
        if (positions[0] == -1)
            return positions;
        
        for (int i = arr.length - 1; i >= 0; i--) 
            if (arr[i] == target) {
                positions[1] = i;
                break;
            }
        
        return positions;
    }
}
