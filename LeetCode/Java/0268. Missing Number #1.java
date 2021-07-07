class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num: nums)
            seen.add(num);
        for (int i = 0; i <= nums.length; i++) 
            if (!seen.contains(i)) 
                return i;

        return -1;
    }
}
