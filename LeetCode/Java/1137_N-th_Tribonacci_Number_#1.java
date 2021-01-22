class Solution {
    public int tribonacci(int n) {
        int first = 0;
        int second = 1;
        int third = 1;
        
        if (n == 0)
            return first;
        if (n == 1)
            return second;
        if (n == 2)
            return third;
        
        for (int i = 0; i <= n - 3; i++) {
            int tempFirst = first;
            int tempSecond = second;
            
            first = second;
            second = third;
            third = tempFirst + tempSecond + third;
        }
        
        return third;
    }
}
