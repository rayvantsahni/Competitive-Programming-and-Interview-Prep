package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BookShop
{
    final static int MOD = 1000000007;

    private static int getArraySum(int[] arr) { return Arrays.stream(arr).sum(); }
    private static int[] getIntArray(BufferedReader br) throws IOException { return Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray(); }
    private static String[] getStringArray(BufferedReader br) throws IOException { return br.readLine().split("\\n"); }
    private static String getInput(BufferedReader br) throws IOException { return br.readLine(); }

//    public static int getMaximumPages(int[] prices, int[] pages, int index, int maximumPrice) {
//        if (maximumPrice < 0)
//            return Integer.MIN_VALUE;
//        if (index >= prices.length || maximumPrice == 0)
//            return 0;
//
//        int including = getMaximumPages(prices, pages, index + 1, maximumPrice - prices[index]) + pages[index];
//        int excluding = getMaximumPages(prices, pages, index + 1, maximumPrice);
//        return Math.max(including, excluding);
//    }

    public static int getMaximumPagesDP(int n, int[] prices, int[] pages, int maximumPrice) {
        int[][] matrix = new int[n + 1][maximumPrice + 1];
        int including;
        int excluding;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= maximumPrice; j++) {

                if (j < prices[i - 1])
                    matrix[i][j] = matrix[i - 1][j];
                else {
                    including = matrix[i - 1][j - prices[i - 1]] + pages[i - 1];
                    excluding = matrix[i - 1][j];
                    matrix[i][j] = Math.max(including, excluding);
                }

            }
        }

        return matrix[n][maximumPrice];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = getIntArray(br);
        int n = input[0];
        int maximumPrice = input[1];

        int[] prices = getIntArray(br);
        int[] pages = getIntArray(br);

        System.out.println(getMaximumPagesDP(n, prices, pages, maximumPrice));
    }
}
