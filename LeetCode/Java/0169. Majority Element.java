class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        return nums[(int) Math.ceil(nums.length / 2)];
    }
}
