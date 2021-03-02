class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> counter = new HashMap<>();
        int count = 0;
        
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            counter.put(stone, counter.getOrDefault(stone, 0) + 1);
        }
        
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            count += counter.getOrDefault(jewel, 0);
        }
        
        return count;
    }
}
