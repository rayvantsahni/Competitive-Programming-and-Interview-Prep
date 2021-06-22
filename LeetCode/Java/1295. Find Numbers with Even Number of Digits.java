class Solution {
    private int numLength(int n) {
        int count = 0;
    
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int num: nums) 
            if (numLength(num) % 2 == 0)
                count++;
        return count;
    }
}
