class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>();
        String s;
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                s = "FizzBuzz";
            else if (i % 3 == 0)
                s = "Fizz";
            else if (i % 5 == 0)
                s = "Buzz";
            else
                s = String.valueOf(i);
            answer.add(s);
        }
        
        return answer;
    }
}
