class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int[] sums = new int[n + 1];
        
        for (int i = 0; i < n; i++) 
            sums[i + 1] = arr[i] + sums[i];
    
        HashMap<Integer, Integer> sumsCounter = new HashMap<>();
        for (int sum: sums) {
            if (sumsCounter.containsKey(sum - k))
                count += sumsCounter.get(sum - k);
            sumsCounter.put(sum, sumsCounter.getOrDefault(sum, 0) + 1);
                
        }
        
        return count;
    }
}
