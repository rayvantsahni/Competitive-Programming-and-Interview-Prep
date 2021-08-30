package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
import java.text.MessageFormat;

public class ChessboardAndQueens
{
    final static int MOD = 1000000007;

    // private static int getArraySum(int[] arr) { return Arrays.stream(arr).sum(); }
    private static int[] getIntArray(BufferedReader br) throws IOException { return Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray(); }
    private static String[] getStringArray(BufferedReader br) throws IOException { return br.readLine().split("\\s"); }
    private static String getInput(BufferedReader br) throws IOException { return br.readLine(); }

    public static int getWaysToPlaceQueen(String[] board, boolean[][] queens, int row) {
        if (row == 8)
            return 1;

        int count = 0;
        for (int col = 0; col < 8; col++) {
            if (!isValidMove(board, queens, row, col))
                continue;
            queens[row][col] = true;
            count += getWaysToPlaceQueen(board, queens, row + 1);
            queens[row][col] = false;
        }

        return count;
    }


    private static boolean isValidMove(String[] board, boolean[][] queens, int row, int col) {
        for (int i = 0; i < row; i++)
            if (queens[i][col])
                return false;

        int i = row - 1;
        int j = col - 1;
        while ((i >= 0) && (j >= 0))
            if (queens[i--][j--])
                return false;

        i = row - 1;
        j = col + 1;
        while ((i >= 0) && (j < 8))
            if (queens[i--][j++])
                return false;

        return board[row].charAt(col) == '.';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] board = new String[8];
        for (int i = 0; i < 8; i++)
            board[i] = getInput(br);

        System.out.println(getWaysToPlaceQueen(board, new boolean[8][8], 0));
    }
}