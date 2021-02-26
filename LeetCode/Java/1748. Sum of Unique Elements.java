class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        int sum = 0;
        
        for (int num: nums)
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        
        for (Map.Entry<Integer, Integer> pair : counter.entrySet())
            if (pair.getValue() == 1)
                sum += pair.getKey();
        
        return sum;
    }
}
