import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        java.util.HashMap<Character, Integer> counterA = new java.util.HashMap<>();
        java.util.HashMap<Character, Integer> counterB = new java.util.HashMap<>();
        
        for (int i = 0; i < a.length(); i++) {
            char letter = Character.toLowerCase(a.charAt(i));
            counterA.put(letter, counterA.getOrDefault(letter, 0) + 1);
        }
            
        for (int i = 0; i < b.length(); i++) {
            char letter = Character.toLowerCase(b.charAt(i));
            counterB.put(letter, counterB.getOrDefault(letter, 0) + 1);
        }
            
        return counterA.equals(counterB);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
