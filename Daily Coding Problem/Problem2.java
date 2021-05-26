import java.util.*;

class Main
{
    public static int[] productExceptI(int[] arr) {
        int n = arr.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = arr[0];
        suffix[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] * arr[i];
        for (int i = n - 2; i >= 0; i--)
            suffix[i] = suffix[i + 1] * arr[i];

        int[] products = new int[n];
        products[0] = suffix[1];
        products[n - 1] = prefix[n - 2];

        for (int i = 1; i < n - 1; i++)
            products[i] = prefix[i - 1] * suffix[i + 1];

        return products;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        System.out.println(Arrays.toString(productExceptI(arr)));
    }
}