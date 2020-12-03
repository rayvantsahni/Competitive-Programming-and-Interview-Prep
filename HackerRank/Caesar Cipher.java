import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        if (s.length() == 0)
            return s;
            
        StringBuilder cipher = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (currentChar >= 65 && currentChar <= 90) {
                cipher.append((char)((((currentChar - 65) + k) % 26) + 65));
                continue;
            }
            
            if (currentChar >= 97 && currentChar <= 122) {
                cipher.append((char)((((currentChar - 97) + k) % 26) + 97));
                continue;
            }
            
            cipher.append((char)currentChar);
                
        }
        
        return cipher.toString();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
