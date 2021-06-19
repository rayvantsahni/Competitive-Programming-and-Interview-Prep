class Solution {
    public boolean backspaceCompare(String s, String t) {
        int len;
        char c;
        
        StringBuilder sFinal = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            len = sFinal.length();
            
            if (c == '#') {
                if (len != 0)
                    sFinal.deleteCharAt(len - 1);
            } else
                sFinal.append(c);
        }
        
        StringBuilder tFinal = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            c = t.charAt(i);
            len = tFinal.length();
            
            if (c == '#') {
                if (len != 0)
                    tFinal.deleteCharAt(len - 1);
            } else
                tFinal.append(c);
        }

        return tFinal.toString().equals(sFinal.toString());
    }
}
