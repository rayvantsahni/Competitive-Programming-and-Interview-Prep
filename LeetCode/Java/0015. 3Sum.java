class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> triplets = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        int j, k, sum;
        
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            j = i + 1;
            k = n - 1;
            
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    triplets.add(triplet);
                    j++;
                    k--;
                } 
                else if (sum > 0) 
                    k--;
                else if (sum < 0)
                    j++;
            }
        }
        return new ArrayList<List<Integer>>(triplets);
    }
}
