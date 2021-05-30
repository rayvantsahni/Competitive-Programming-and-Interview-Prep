class Solution {
    public int maxPower(String s) {
        int max = 0;
        int count = 0;
        char atHand = 'A';
        char current;
        
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            
            if (current == atHand)
                count++;
            else {
                atHand = current;
                count = 1;
            }
            
            max = Math.max(max, count);
        }
        
        return max;
    }
}
