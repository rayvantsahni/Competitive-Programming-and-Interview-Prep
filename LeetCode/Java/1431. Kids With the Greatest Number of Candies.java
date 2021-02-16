class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy: candies)
            max = Math.max(max, candy);
        
        ArrayList<Boolean> greatestCandies = new ArrayList<>(candies.length);
        for (int candy: candies)
            greatestCandies.add(candy + extraCandies >= max);
        
        return greatestCandies;
    }
}
