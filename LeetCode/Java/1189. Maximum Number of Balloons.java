class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> counter = new HashMap<>();
        Map<Character, Integer> balloon = Map.of('b', 1,
                                                 'a', 1,
                                                 'l', 2,
                                                 'o', 2,
                                                 'n', 1);
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        int count = Integer.MAX_VALUE;
        for (Character key: balloon.keySet()) 
            count = Math.min(counter.getOrDefault(key, 0) / balloon.get(key) ,count);
             
        return count;
        
    }
}
