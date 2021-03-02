class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        
        for (int num: nums)
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        
        for (HashMap.Entry<Integer, Integer> set : counter.entrySet())
            if (set.getValue() > nums.length / 2)
                return set.getKey();
        
        return -1;
    }
}
