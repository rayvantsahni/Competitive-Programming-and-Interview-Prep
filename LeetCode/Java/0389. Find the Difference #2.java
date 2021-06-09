class Solution {
    public char findTheDifference(String s, String t) {
        int asciiDiff = 0;
        for (char c: t.toCharArray())
            asciiDiff += c;
        for (char c: s.toCharArray())
            asciiDiff -= c;
        return (char) asciiDiff;
    }
}
