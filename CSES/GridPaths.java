package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.Arrays;

public class GridPaths
{
    final static int MOD = 1000000007;

    private static int getArraySum(int[] arr) { return Arrays.stream(arr).sum(); }
    private static int[] getIntArray(BufferedReader br) throws IOException { return Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray(); }
    private static String[] getStringArray(BufferedReader br) throws IOException { return br.readLine().split("\\n"); }
    private static String getInput(BufferedReader br) throws IOException { return br.readLine(); }


/*
    public static int gridPathsCount(String[] grid, int n) {
        return gridPathsCount(grid, n, 0, 0);
    }

    public static int gridPathsCount(String[] grid, int n, int x, int y) {
        if (x == n - 1 && y == n - 1)
            return 1;

        if (!isValidMove(grid, n, x, y))
            return 0;

        int count = 0;
        count += gridPathsCount(grid, n, x + 1, y);
        count += gridPathsCount(grid, n, x, y + 1);
        return count % MOD;
    }

    private static boolean isValidMove(String[] grid, int n, int x, int y) {
        return (0 <= x) && (x < n) && (0 <= y) && (y < n) && (grid[x].charAt(y) == '.');
    }
*/

    public static int gridPathsCountDP(String[] grid, int n) {
        if (grid[0].charAt(0) == '*')
            return 0;

        int[][] matrix = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j == 1)
                    matrix[i][j] = 1;
                else if (grid[i - 1].charAt(j - 1) == '*')
                    matrix[i][j] = 0;
                else
                    matrix[i][j] = (matrix[i - 1][j] + matrix[i][j - 1]) % MOD;
            }
        }

        return matrix[n][n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(getInput(br));
        String[] grid = new String[n];
        for (int i = 0; i < n; i++)
            grid[i] = getInput(br);

        System.out.println(gridPathsCountDP(grid, n));
    }
}
