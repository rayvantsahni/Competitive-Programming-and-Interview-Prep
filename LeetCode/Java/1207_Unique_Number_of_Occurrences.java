class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if (arr.length == 1)
            return true;
        
        HashMap<Integer, Integer> counter = new HashMap<>();
        
        for (int n: arr)
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        
        return counter.size() == new HashSet<Integer>(counter.values()).size();
    }
}
