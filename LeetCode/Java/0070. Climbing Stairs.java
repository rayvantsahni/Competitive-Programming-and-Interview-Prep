class Solution {
    public int climbStairs(int n) {
        return climbStairs(n, new HashMap<Integer, Integer>());
    }
    
    public int climbStairs(int n, HashMap<Integer, Integer> memo) {
        if (n == 1 || n == 2)
            return n;
        if (!memo.containsKey(n))
            memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        return memo.get(n);
    }
}
