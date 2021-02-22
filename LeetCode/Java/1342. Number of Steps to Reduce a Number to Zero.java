class Solution {
    public int numberOfSteps (int num) {
        return stepsCount(num, 0);
    }
    
    private int stepsCount(int num, int count) {
        if (num == 0)
            return count;
        return (num & 1) == 1 ? stepsCount(num - 1, count + 1) : stepsCount(num / 2, count + 1);
    }
}
