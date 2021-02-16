class Solution {
    public int numIdenticalPairs(int[] nums) {
        int good = 0;
        HashMap<Integer, Integer> counter = new HashMap<>();
        
        for (int num: nums)
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        
        for (Integer value: counter.values())
            good += sum(value);
        
        return good;
    }
    
    private int sum(int n) {
        return (n * (n - 1)) / 2;
    }
}
