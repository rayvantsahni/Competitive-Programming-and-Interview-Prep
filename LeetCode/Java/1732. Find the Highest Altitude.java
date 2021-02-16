class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        
        for (int altitude: gain) {
            sum += altitude;
            max = Math.max(max, sum);
        }
        
        return max;
    }
}
