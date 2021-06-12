import java.util.*;

class DiceCombinations
{
    public static long getNumberOfWays(int n) {
        int MOD = 1000000007;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j == i)
                    dp[i]++;
                if (i > j)
                    dp[i] = (dp[i] + dp[i - j]) % MOD;
            }
        }

        return dp[n];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(getNumberOfWays(n));
    }
}